package typings
package axiosDashMockDashAdapterLib.axiosDashMockDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler extends js.Object {
  @JSName("networkErrorOnce")
  var networkErrorOnce_Original: axiosDashMockDashAdapterLib.ResponseSpecFunc = js.native
  @JSName("replyOnce")
  var replyOnce_Original: axiosDashMockDashAdapterLib.ResponseSpecFunc = js.native
  @JSName("reply")
  var reply_Original: axiosDashMockDashAdapterLib.ResponseSpecFunc = js.native
  @JSName("timeoutOnce")
  var timeoutOnce_Original: axiosDashMockDashAdapterLib.ResponseSpecFunc = js.native
  def networkError(): MockAdapter = js.native
  def networkErrorOnce(statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc): js.Any = js.native
  def networkErrorOnce(statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc, data: js.Any): js.Any = js.native
  def networkErrorOnce(
    statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc,
    data: js.Any,
    headers: js.Any
  ): js.Any = js.native
  def networkErrorOnce(statusOrCallback: scala.Double): js.Any = js.native
  def networkErrorOnce(statusOrCallback: scala.Double, data: js.Any): js.Any = js.native
  def networkErrorOnce(statusOrCallback: scala.Double, data: js.Any, headers: js.Any): js.Any = js.native
  def passThrough(): MockAdapter = js.native
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
  def timeout(): MockAdapter = js.native
  def timeoutOnce(statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc): js.Any = js.native
  def timeoutOnce(statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc, data: js.Any): js.Any = js.native
  def timeoutOnce(
    statusOrCallback: axiosDashMockDashAdapterLib.CallbackResponseSpecFunc,
    data: js.Any,
    headers: js.Any
  ): js.Any = js.native
  def timeoutOnce(statusOrCallback: scala.Double): js.Any = js.native
  def timeoutOnce(statusOrCallback: scala.Double, data: js.Any): js.Any = js.native
  def timeoutOnce(statusOrCallback: scala.Double, data: js.Any, headers: js.Any): js.Any = js.native
}

