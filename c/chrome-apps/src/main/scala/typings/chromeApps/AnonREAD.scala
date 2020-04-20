package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.READ
import typings.chromeApps.chromeAppsStrings.WRITE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonREAD extends js.Object {
  var READ: typings.chromeApps.chromeAppsStrings.READ
  var WRITE: typings.chromeApps.chromeAppsStrings.WRITE
}

object AnonREAD {
  @scala.inline
  def apply(READ: READ, WRITE: WRITE): AnonREAD = {
    val __obj = js.Dynamic.literal(READ = READ.asInstanceOf[js.Any], WRITE = WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonREAD]
  }
}

