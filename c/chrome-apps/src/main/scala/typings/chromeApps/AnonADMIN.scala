package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.admin_
import typings.chromeApps.chromeAppsStrings.development_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.other_
import typings.chromeApps.chromeAppsStrings.sideload_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonADMIN extends js.Object {
  var ADMIN: admin_
  var DEVELOPMENT: development_
  var NORMAL: normal_
  var OTHER: other_
  var SIDELOAD: sideload_
}

object AnonADMIN {
  @scala.inline
  def apply(ADMIN: admin_, DEVELOPMENT: development_, NORMAL: normal_, OTHER: other_, SIDELOAD: sideload_): AnonADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], SIDELOAD = SIDELOAD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonADMIN]
  }
}

