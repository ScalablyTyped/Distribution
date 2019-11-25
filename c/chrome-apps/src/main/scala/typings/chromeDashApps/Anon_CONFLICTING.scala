package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.conflicting
import typings.chromeDashApps.chromeDashAppsStrings.pending
import typings.chromeDashApps.chromeDashAppsStrings.synced
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CONFLICTING extends js.Object {
  var CONFLICTING: conflicting
  var PENDING: pending
  var SYNCED: synced
}

object Anon_CONFLICTING {
  @scala.inline
  def apply(CONFLICTING: conflicting, PENDING: pending, SYNCED: synced): Anon_CONFLICTING = {
    val __obj = js.Dynamic.literal(CONFLICTING = CONFLICTING.asInstanceOf[js.Any], PENDING = PENDING.asInstanceOf[js.Any], SYNCED = SYNCED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CONFLICTING]
  }
}

