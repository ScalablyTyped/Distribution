package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.connected_
import typings.chromeApps.chromeAppsStrings.failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONNECTEDFAILURE extends js.Object {
  var CONNECTED: connected_
  var FAILURE: failure
}

object AnonCONNECTEDFAILURE {
  @scala.inline
  def apply(CONNECTED: connected_, FAILURE: failure): AnonCONNECTEDFAILURE = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], FAILURE = FAILURE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCONNECTEDFAILURE]
  }
}

