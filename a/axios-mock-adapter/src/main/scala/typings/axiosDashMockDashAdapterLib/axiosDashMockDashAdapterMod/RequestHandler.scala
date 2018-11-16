package typings
package axiosDashMockDashAdapterLib.axiosDashMockDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler extends js.Object {
  @JSName("replyOnce")
  var replyOnce_Original: axiosDashMockDashAdapterLib.ResponseSpecFunc = js.native
  @JSName("reply")
  var reply_Original: axiosDashMockDashAdapterLib.ResponseSpecFunc = js.native
  def networkError(): scala.Unit = js.native
  def passThrough(): scala.Unit = js.native
  def reply(statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc): js.Any = js.native
  def reply(statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc, data: js.Any): js.Any = js.native
  def reply(
    statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc,
    data: js.Any,
    headers: js.Any
  ): js.Any = js.native
  def reply(statusOrCallback: scala.Double): js.Any = js.native
  def reply(statusOrCallback: scala.Double, data: js.Any): js.Any = js.native
  def reply(statusOrCallback: scala.Double, data: js.Any, headers: js.Any): js.Any = js.native
  def replyOnce(statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc): js.Any = js.native
  def replyOnce(statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc, data: js.Any): js.Any = js.native
  def replyOnce(
    statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc,
    data: js.Any,
    headers: js.Any
  ): js.Any = js.native
  def replyOnce(statusOrCallback: scala.Double): js.Any = js.native
  def replyOnce(statusOrCallback: scala.Double, data: js.Any): js.Any = js.native
  def replyOnce(statusOrCallback: scala.Double, data: js.Any, headers: js.Any): js.Any = js.native
  def timeout(): scala.Unit = js.native
}

