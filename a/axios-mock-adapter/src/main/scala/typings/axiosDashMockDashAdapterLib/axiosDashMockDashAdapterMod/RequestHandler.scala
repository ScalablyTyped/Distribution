package typings
package axiosDashMockDashAdapterLib.axiosDashMockDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler extends js.Object {
  @JSName("replyOnce")
  var replyOnce_Original: ResponseSpecFunc = js.native
  @JSName("reply")
  var reply_Original: ResponseSpecFunc = js.native
  def networkError(): scala.Unit = js.native
  def networkErrorOnce(): scala.Unit = js.native
  def passThrough(): MockAdapter = js.native
  def reply(statusOrCallback: CallbackResponseSpecFunc): MockAdapter = js.native
  def reply(statusOrCallback: CallbackResponseSpecFunc, data: js.Any): MockAdapter = js.native
  def reply(statusOrCallback: CallbackResponseSpecFunc, data: js.Any, headers: js.Any): MockAdapter = js.native
  def reply(statusOrCallback: scala.Double): MockAdapter = js.native
  def reply(statusOrCallback: scala.Double, data: js.Any): MockAdapter = js.native
  def reply(statusOrCallback: scala.Double, data: js.Any, headers: js.Any): MockAdapter = js.native
  def replyOnce(statusOrCallback: CallbackResponseSpecFunc): MockAdapter = js.native
  def replyOnce(statusOrCallback: CallbackResponseSpecFunc, data: js.Any): MockAdapter = js.native
  def replyOnce(statusOrCallback: CallbackResponseSpecFunc, data: js.Any, headers: js.Any): MockAdapter = js.native
  def replyOnce(statusOrCallback: scala.Double): MockAdapter = js.native
  def replyOnce(statusOrCallback: scala.Double, data: js.Any): MockAdapter = js.native
  def replyOnce(statusOrCallback: scala.Double, data: js.Any, headers: js.Any): MockAdapter = js.native
  def timeout(): scala.Unit = js.native
  def timeoutOnce(): scala.Unit = js.native
}

