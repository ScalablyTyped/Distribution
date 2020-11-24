package typings.commangular.commangular

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service that enables the execution of commands
  * see http://commangular.org/docs/#dispatching-events
  */
@js.native
trait ICommAngularService extends js.Object {
  
  /**
    * This function executes the given command sequence.
    * see http://commangular.org/docs/#dispatching-events
    * @param eventName Name of the even that will trigger a command sequence
    * @param data Data of any type that will be passed to the command.
    */
  def dispatch(eventName: String): IPromise[_] = js.native
  def dispatch(eventName: String, data: js.Any): IPromise[_] = js.native
}
