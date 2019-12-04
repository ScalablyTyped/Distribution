package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.requestSession")
@js.native
object requestSession extends js.Object {
  def apply(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def apply(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit],
    sessionRequest: SessionRequest
  ): Unit = js.native
  def apply(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit],
    sessionRequest: SessionRequest,
    label: String
  ): Unit = js.native
}

