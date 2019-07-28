package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.added
import typings.chromeDashApps.chromeDashAppsStrings.deleted
import typings.chromeDashApps.chromeDashAppsStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADDED extends js.Object {
  var ADDED: added
  var DELETED: deleted
  var UPDATED: updated
}

object Anon_ADDED {
  @scala.inline
  def apply(ADDED: added, DELETED: deleted, UPDATED: updated): Anon_ADDED = {
    val __obj = js.Dynamic.literal(ADDED = ADDED, DELETED = DELETED, UPDATED = UPDATED)
  
    __obj.asInstanceOf[Anon_ADDED]
  }
}

