package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.changed_
import typings.chromeDashApps.chromeDashAppsStrings.created
import typings.chromeDashApps.chromeDashAppsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHANGEDCREATED extends js.Object {
  var CHANGED: changed_
  var CREATED: created
  var REMOVED: removed
}

object Anon_CHANGEDCREATED {
  @scala.inline
  def apply(CHANGED: changed_, CREATED: created, REMOVED: removed): Anon_CHANGEDCREATED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], CREATED = CREATED.asInstanceOf[js.Any], REMOVED = REMOVED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CHANGEDCREATED]
  }
}

