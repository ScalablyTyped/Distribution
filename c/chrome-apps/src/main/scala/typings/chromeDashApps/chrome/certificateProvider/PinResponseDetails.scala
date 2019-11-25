package typings.chromeDashApps.chrome.certificateProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinResponseDetails extends js.Object {
  var userInput: js.UndefOr[String] = js.undefined
}

object PinResponseDetails {
  @scala.inline
  def apply(userInput: String = null): PinResponseDetails = {
    val __obj = js.Dynamic.literal()
    if (userInput != null) __obj.updateDynamic("userInput")(userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinResponseDetails]
  }
}

