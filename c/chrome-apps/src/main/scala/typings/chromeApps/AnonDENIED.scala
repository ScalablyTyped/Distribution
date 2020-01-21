package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.denied
import typings.chromeApps.chromeAppsStrings.granted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDENIED extends js.Object {
  var DENIED: denied
  var GRANTED: granted
}

object AnonDENIED {
  @scala.inline
  def apply(DENIED: denied, GRANTED: granted): AnonDENIED = {
    val __obj = js.Dynamic.literal(DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDENIED]
  }
}

