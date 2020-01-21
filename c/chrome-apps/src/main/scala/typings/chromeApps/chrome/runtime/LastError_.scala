package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastError_ extends js.Object {
  /** Details about the error which occurred.  */
  var message: js.UndefOr[String] = js.undefined
}

object LastError_ {
  @scala.inline
  def apply(message: String = null): LastError_ = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastError_]
  }
}

