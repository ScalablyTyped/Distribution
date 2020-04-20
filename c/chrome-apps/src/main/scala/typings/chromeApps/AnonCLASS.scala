package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.class_
import typings.chromeApps.chromeAppsStrings.reserved_
import typings.chromeApps.chromeAppsStrings.standard_
import typings.chromeApps.chromeAppsStrings.vendor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCLASS extends js.Object {
  var CLASS: class_
  var RESERVED: reserved_
  var STANDARD: standard_
  var VENDOR: vendor_
}

object AnonCLASS {
  @scala.inline
  def apply(CLASS: class_, RESERVED: reserved_, STANDARD: standard_, VENDOR: vendor_): AnonCLASS = {
    val __obj = js.Dynamic.literal(CLASS = CLASS.asInstanceOf[js.Any], RESERVED = RESERVED.asInstanceOf[js.Any], STANDARD = STANDARD.asInstanceOf[js.Any], VENDOR = VENDOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCLASS]
  }
}

