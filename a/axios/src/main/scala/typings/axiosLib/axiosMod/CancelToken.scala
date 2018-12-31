package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelToken extends js.Object {
  var promise: js.Promise[Cancel]
  var reason: js.UndefOr[Cancel] = js.undefined
  def throwIfRequested(): scala.Unit
}

