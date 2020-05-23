package typings.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.initialize")
@js.native
object initialize extends js.Object {
  def apply(
    apiConfig: typings.chrome.chrome.cast.ApiConfig,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
  ): Unit = js.native
}

