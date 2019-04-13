package typings
package cqrsDashDomainLib.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CqrsDomain extends js.Object {
  /**
    * Inject idGenerator function for aggregate id.
    * @param fn The function to be injected.
    * @returns to be able to chain...
    */
  def aggregateIdGenerator(cb: js.Function0[java.lang.String]): CqrsDomain = js.native
  def aggregateIdGenerator(cb: js.Function1[/* callback */ generateIdCallback, java.lang.String]): CqrsDomain = js.native
  /**
    * Converts an error to the commandRejected event
    * @param cmd The command that was handled.
    * @param err The error that occurs.
    * @returns The resulting event.
    */
  def createCommandRejectedEvent(cmd: js.Any, err: stdLib.Error): js.Any = js.native
  /**
    * Inject definition for command structure.
    * @param definition the definition to be injected
    * @returns to be able to chain...
    */
  def defineCommand(definition: CommandDefinition): CqrsDomain = js.native
  /**
    * Inject definition for event structure.
    * @param definition the definition to be injected
    * @returns to be able to chain...
    */
  def defineEvent(definition: EventDefinition): CqrsDomain = js.native
  /**
    * Returns the domain information.
    */
  def getInfo(): js.Any = js.native
  /**
    * Call this function to let the domain handle it.
    * @param cmd      the command object
    * @param callback the function that will be called when this action has finished [optional]
    *                            `function(err, evts, aggregateData, meta){}` evts is of type Array, aggregateData and meta are an object
    */
  def handle(cmd: js.Any): scala.Unit = js.native
  def handle(cmd: js.Any, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def handle(
    cmd: js.Any,
    cb: js.Function4[
      /* err */ stdLib.Error, 
      /* events */ js.Array[_], 
      /* aggregateData */ js.Any, 
      /* metaInfos */ HandleMetaInfos, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Inject idGenerator function.
    * @param fn The function to be injected.
    * @returns to be able to chain...
    */
  def idGenerator(cb: js.Function0[java.lang.String]): CqrsDomain = js.native
  def idGenerator(cb: js.Function1[/* callback */ generateIdCallback, java.lang.String]): CqrsDomain = js.native
  /**
    * Call this function to initialize the domain.
    * @param callback the function that will be called when this action has finished [optional]
    *                            `function(err, warnings){}`
    */
  def init(cb: js.Function2[/* err */ stdLib.Error, /* warnings */ js.Array[stdLib.Error], scala.Unit]): scala.Unit = js.native
  /**
    * Is called when dispatched a command.
    * @param cmd              the command object
    * @param err              the error
    * @param eventsToDispatch the events to dispatch
    * @param aggregateData    the aggregate data
    * @param meta             the meta infos
    * @param callback         the function that will be called when this action has finished [optional]
    *                                    `function(err, evts, aggregateData, meta){}` evts is of type Array, aggregateData and meta are an object
    */
  def onDispatched(
    cmd: js.Any,
    err: stdLib.Error,
    eventsToDispatch: js.Array[_],
    aggregateData: js.Any,
    meta: js.Any,
    callback: js.Function4[
      /* err */ stdLib.Error, 
      /* evts */ js.Array[_], 
      /* aggregateData */ js.Any, 
      /* meta */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Inject function for for event notification.
    * @param fn the function to be injected
    * @returns to be able to chain...
    */
  def onEvent(cb: js.Function1[/* evt */ js.Any, scala.Unit]): CqrsDomain = js.native
  def onEvent(cb: js.Function2[/* evt */ js.Any, /* callback */ js.Function0[scala.Unit], scala.Unit]): CqrsDomain = js.native
}

