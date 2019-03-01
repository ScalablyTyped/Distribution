package typings
package chromeDashAppsLib.chromeNs.certificateProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinResponseDetails extends js.Object {
  var userInput: js.UndefOr[java.lang.String] = js.undefined
}

object PinResponseDetails {
  @scala.inline
  def apply(userInput: java.lang.String = null): PinResponseDetails = {
    val __obj = js.Dynamic.literal()
    if (userInput != null) __obj.updateDynamic("userInput")(userInput)
    __obj.asInstanceOf[PinResponseDetails]
  }
}

