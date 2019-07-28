package typings.baconjs.BaconNs

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Bus
  * @augments Bacon.EventStream
  * @description An [EventStream]{@link Bacon.EventStream} that allows you to [push]{@link Bacon.Bus#push} values into the EventStream. It also allows [plug]{@link Bacon.Bus#plug}ging other EventStream's into the Bus. The Bus practically merges all plugged-in streams and the values pushed using the [push]{@link Bacon.Bus#push} method.
  */
@js.native
trait Bus[E, A] extends EventStream[E, A] {
  /**
    * @method
    * @description Ends the [Bus]{@link Bacon.Bus}. Sends an [End]{@link Bacon.End} event to all subscribers. After this call, there'll be no more events to the subscribers. Also, the [Bus.push]{@link Bacon.Bus#push} and [Bus.plug]{@link Bacon.Bus#plug} methods have no effect.
    * @returns {void}
    */
  def end(): Unit = js.native
  /**
    * @method
    * @description Sends an [Error]{@link Bacon.Error} with given `error` message to all subscribers.
    * @param {E} error
    * @returns {void}
    */
  def error(error: E): Unit = js.native
  /**
    * @callback Bus#plug~unplug
    * @returns {void}
    */
  /**
    * @method Bus#plug
    * @description Plugs the given [EventStream]{@link Bacon.EventStream} to the [Bus]{@link Bacon.Bus}. All events from the given `stream` will be delivered to the subscribers of the Bus. Returns a function `unplug` that can be used to unplug the same stream. The [plug]{@link Bacon.Bus#plug} method practically allows you to merge in other EventStream's after the creation of the Bus.
    * @param {EventStream<A>} stream
    * @returns {Bus#plug~unplug}
    */
  def plug(stream: EventStream[E, A]): js.Function0[Unit] = js.native
  /**
    * @method Bus#push
    * @description Pushes the given `value` to the [Bus]{@link Bacon.Bus}.
    * @param {A} value
    * @returns {void}
    */
  def push(value: A): Unit = js.native
}

@JSGlobal("Bacon.Bus")
@js.native
/**
  * @constructor
  * @constructs Bacon.Bus
  * @description Returns a new [Bus]{@link Bacon.Bus}.
  * @returns {Bus<E, A>}
  */
class BusCls[E, A] () extends Bus[E, A]

@JSGlobal("Bacon.Bus")
@js.native
object Bus
  extends /**
  * @constructor
  * @constructs Bacon.Bus
  * @description Returns a new [Bus]{@link Bacon.Bus}.
  * @returns {Bus<E, A>}
  */
Instantiable0[Bus[js.Object, js.Object]]

