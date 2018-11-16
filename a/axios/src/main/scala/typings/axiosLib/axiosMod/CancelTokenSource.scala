package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelTokenSource extends js.Object {
  @JSName("cancel")
  var cancel_Original: Canceler = js.native
  var token: CancelToken = js.native
  def cancel(): scala.Unit = js.native
  def cancel(message: java.lang.String): scala.Unit = js.native
}

