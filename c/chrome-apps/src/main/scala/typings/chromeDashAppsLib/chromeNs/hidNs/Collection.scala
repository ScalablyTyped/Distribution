package typings
package chromeDashAppsLib.chromeNs.hidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  /** Report IDs which belong to the collection and to its children. */
  var reportIds: js.Array[chromeDashAppsLib.chromeNs.integer]
  /** Page-defined usage identifier. */
  var usage: chromeDashAppsLib.chromeNs.integer
  /** HID usage page identifier. */
  var usagePage: chromeDashAppsLib.chromeNs.integer
}

object Collection {
  @scala.inline
  def apply(
    reportIds: js.Array[chromeDashAppsLib.chromeNs.integer],
    usage: chromeDashAppsLib.chromeNs.integer,
    usagePage: chromeDashAppsLib.chromeNs.integer
  ): Collection = {
    val __obj = js.Dynamic.literal(reportIds = reportIds, usage = usage, usagePage = usagePage)
  
    __obj.asInstanceOf[Collection]
  }
}

