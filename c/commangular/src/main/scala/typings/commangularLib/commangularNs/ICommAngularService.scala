package typings
package commangularLib.commangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def dispatch(eventName: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  def dispatch(eventName: java.lang.String, data: js.Any): angularLib.angularMod.IPromise[_] = js.native
}

