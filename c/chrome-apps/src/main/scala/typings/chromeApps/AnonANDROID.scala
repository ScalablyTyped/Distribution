package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.android_
import typings.chromeApps.chromeAppsStrings.cros_
import typings.chromeApps.chromeAppsStrings.linux_
import typings.chromeApps.chromeAppsStrings.mac_
import typings.chromeApps.chromeAppsStrings.openbsd_
import typings.chromeApps.chromeAppsStrings.win_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonANDROID extends js.Object {
  var ANDROID: android_
  var CROS: cros_
  var LINUX: linux_
  var MAC: mac_
  var OPENBSD: openbsd_
  var WIN: win_
}

object AnonANDROID {
  @scala.inline
  def apply(ANDROID: android_, CROS: cros_, LINUX: linux_, MAC: mac_, OPENBSD: openbsd_, WIN: win_): AnonANDROID = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], CROS = CROS.asInstanceOf[js.Any], LINUX = LINUX.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], OPENBSD = OPENBSD.asInstanceOf[js.Any], WIN = WIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonANDROID]
  }
}

