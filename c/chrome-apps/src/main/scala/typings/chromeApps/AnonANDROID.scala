package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.android
import typings.chromeApps.chromeAppsStrings.cros
import typings.chromeApps.chromeAppsStrings.linux
import typings.chromeApps.chromeAppsStrings.mac
import typings.chromeApps.chromeAppsStrings.openbsd
import typings.chromeApps.chromeAppsStrings.win
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonANDROID extends js.Object {
  var ANDROID: android
  var CROS: cros
  var LINUX: linux
  var MAC: mac
  var OPENBSD: openbsd
  var WIN: win
}

object AnonANDROID {
  @scala.inline
  def apply(ANDROID: android, CROS: cros, LINUX: linux, MAC: mac, OPENBSD: openbsd, WIN: win): AnonANDROID = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], CROS = CROS.asInstanceOf[js.Any], LINUX = LINUX.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], OPENBSD = OPENBSD.asInstanceOf[js.Any], WIN = WIN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonANDROID]
  }
}

