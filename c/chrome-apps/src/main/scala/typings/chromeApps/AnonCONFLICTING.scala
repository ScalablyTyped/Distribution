package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.conflicting_
import typings.chromeApps.chromeAppsStrings.pending_
import typings.chromeApps.chromeAppsStrings.synced_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONFLICTING extends js.Object {
  var CONFLICTING: conflicting_
  var PENDING: pending_
  var SYNCED: synced_
}

object AnonCONFLICTING {
  @scala.inline
  def apply(CONFLICTING: conflicting_, PENDING: pending_, SYNCED: synced_): AnonCONFLICTING = {
    val __obj = js.Dynamic.literal(CONFLICTING = CONFLICTING.asInstanceOf[js.Any], PENDING = PENDING.asInstanceOf[js.Any], SYNCED = SYNCED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCONFLICTING]
  }
}

