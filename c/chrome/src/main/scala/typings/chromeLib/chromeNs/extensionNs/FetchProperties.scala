package typings
package chromeLib.chromeNs.extensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FetchProperties extends js.Object {
  /** Optional. The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values: 'tab', 'notification', 'popup'.  */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The window to restrict the search to. If omitted, returns all views.  */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

