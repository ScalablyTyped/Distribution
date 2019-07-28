package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.changed
import typings.chromeDashApps.chromeDashAppsStrings.created
import typings.chromeDashApps.chromeDashAppsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHANGEDCREATED extends js.Object {
  var CHANGED: changed
  var CREATED: created
  var REMOVED: removed
}

object Anon_CHANGEDCREATED {
  @scala.inline
  def apply(CHANGED: changed, CREATED: created, REMOVED: removed): Anon_CHANGEDCREATED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED, CREATED = CREATED, REMOVED = REMOVED)
  
    __obj.asInstanceOf[Anon_CHANGEDCREATED]
  }
}

