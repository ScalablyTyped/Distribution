package typings.commangular.angularNs

import typings.angular.angularMod.IPromise
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
  def dispatch(eventName: String): IPromise[_] = js.native
  def dispatch(eventName: String, data: js.Any): IPromise[_] = js.native
}

