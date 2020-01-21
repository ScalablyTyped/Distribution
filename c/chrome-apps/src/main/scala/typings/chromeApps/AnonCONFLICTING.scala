package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.conflicting
import typings.chromeApps.chromeAppsStrings.pending
import typings.chromeApps.chromeAppsStrings.synced
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONFLICTING extends js.Object {
  var CONFLICTING: conflicting
  var PENDING: pending
  var SYNCED: synced
}

object AnonCONFLICTING {
  @scala.inline
  def apply(CONFLICTING: conflicting, PENDING: pending, SYNCED: synced): AnonCONFLICTING = {
    val __obj = js.Dynamic.literal(CONFLICTING = CONFLICTING.asInstanceOf[js.Any], PENDING = PENDING.asInstanceOf[js.Any], SYNCED = SYNCED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCONFLICTING]
  }
}

