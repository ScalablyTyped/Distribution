package typings
package commangularLib.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRootScopeService extends js.Object {
  /**
  		 * Commangular method to execute a command.
  		 * @param eventName Name of the even that will trigger a command sequence
  		 * @param data Data of any type that will be passed to the command.
  		 */
  def dispatch(eventName: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  def dispatch(eventName: java.lang.String, data: js.Any): angularLib.angularMod.IPromise[_] = js.native
}

