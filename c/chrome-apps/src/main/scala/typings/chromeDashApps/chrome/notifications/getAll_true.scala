package typings.chromeDashApps.chrome.notifications

import org.scalablytyped.runtime.StringDictionary
import typings.chromeDashApps.chromeDashAppsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.getAll")
@js.native
object getAll_true extends js.Object {
  /**
    * Retrieves all the active notifications.
    * @since Chrome 29.
    * @param callback Returns the set of notification_ids currently in the system.
    * Get list of notifications ids using Object.keys();
    * @example
    * getAll((result) => {
    *  console.log('Active notifications:', Object.keys(result));
    * });
    */
  def apply(callback: js.Function1[/* notifications */ StringDictionary[`true`], Unit]): Unit = js.native
}

