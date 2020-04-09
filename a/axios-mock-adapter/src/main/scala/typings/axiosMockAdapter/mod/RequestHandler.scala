package typings.axiosMockAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler extends js.Object {
  @JSName("replyOnce")
  var replyOnce_Original: ResponseSpecFunc = js.native
  @JSName("reply")
  var reply_Original: ResponseSpecFunc = js.native
  def abortRequest(): MockAdapter = js.native
  def abortRequestOnce(): MockAdapter = js.native
  def networkError(): MockAdapter = js.native
  def networkErrorOnce(): MockAdapter = js.native
  def passThrough(): MockAdapter = js.native
  def reply[T](statusOrCallback: Double): MockAdapter = js.native
  def reply[T](statusOrCallback: Double, data: T): MockAdapter = js.native
  def reply[T](statusOrCallback: Double, data: T, headers: js.Any): MockAdapter = js.native
  def reply[T](statusOrCallback: CallbackResponseSpecFunc): MockAdapter = js.native
  def reply[T](statusOrCallback: CallbackResponseSpecFunc, data: T): MockAdapter = js.native
  def reply[T](statusOrCallback: CallbackResponseSpecFunc, data: T, headers: js.Any): MockAdapter = js.native
  def replyOnce[T](statusOrCallback: Double): MockAdapter = js.native
  def replyOnce[T](statusOrCallback: Double, data: T): MockAdapter = js.native
  def replyOnce[T](statusOrCallback: Double, data: T, headers: js.Any): MockAdapter = js.native
  def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc): MockAdapter = js.native
  def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc, data: T): MockAdapter = js.native
  def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc, data: T, headers: js.Any): MockAdapter = js.native
  def timeout(): MockAdapter = js.native
  def timeoutOnce(): MockAdapter = js.native
}

