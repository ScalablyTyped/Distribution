package typings.chromeApps.chrome.hid

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  /** Report IDs which belong to the collection and to its children. */
  var reportIds: js.Array[integer]
  /** Page-defined usage identifier. */
  var usage: integer
  /** HID usage page identifier. */
  var usagePage: integer
}

object Collection {
  @scala.inline
  def apply(reportIds: js.Array[integer], usage: integer, usagePage: integer): Collection = {
    val __obj = js.Dynamic.literal(reportIds = reportIds.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Collection]
  }
}

