package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.denied_
import typings.chromeApps.chromeAppsStrings.granted_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDENIED extends js.Object {
  var DENIED: denied_
  var GRANTED: granted_
}

object AnonDENIED {
  @scala.inline
  def apply(DENIED: denied_, GRANTED: granted_): AnonDENIED = {
    val __obj = js.Dynamic.literal(DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDENIED]
  }
}

