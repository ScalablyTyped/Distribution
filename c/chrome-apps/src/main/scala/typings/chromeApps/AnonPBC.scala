package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.PBC
import typings.chromeApps.chromeAppsStrings.PIN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPBC extends js.Object {
  var PBC: typings.chromeApps.chromeAppsStrings.PBC
  var PIN: typings.chromeApps.chromeAppsStrings.PIN
}

object AnonPBC {
  @scala.inline
  def apply(PBC: PBC, PIN: PIN): AnonPBC = {
    val __obj = js.Dynamic.literal(PBC = PBC.asInstanceOf[js.Any], PIN = PIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPBC]
  }
}

