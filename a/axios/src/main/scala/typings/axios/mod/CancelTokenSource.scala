package typings.axios.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelTokenSource extends js.Object {
  @JSName("cancel")
  var cancel_Original: Canceler = js.native
  var token: CancelToken = js.native
  def cancel(): Unit = js.native
  def cancel(message: String): Unit = js.native
}

