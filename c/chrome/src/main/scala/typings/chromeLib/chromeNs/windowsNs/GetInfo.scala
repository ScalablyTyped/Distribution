package typings
package chromeLib.chromeNs.windowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInfo extends js.Object {
  /**
    * Optional.
    * If true, the windows.Window object will have a tabs property that contains a list of the tabs.Tab objects. The Tab objects only contain the url, title and favIconUrl properties if the extension's manifest file includes the "tabs" permission.
    */
  var populate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set, the windows.Window returned will be filtered based on its type. If unset the default filter is set to ['app', 'normal', 'panel', 'popup'], with 'app' and 'panel' window types limited to the extension's own windows.
    * Each one of: "normal", "popup", "panel", "app", or "devtools"
    * @since Chrome 46. Warning: this is the current Beta channel.
    */
  var windowTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

