package typings
package chromeDashAppsLib.chromeNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FrameOptionsChrome extends js.Object {
  /**
               * Allows the frame color of the window when active to be set. Frame coloring is only available if the frame type is chrome.
               * Frame coloring is only available if the frame type is chrome.
               * @since Frame coloring is new in Chrome 36.
               */
  var activeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Allows the frame color to be set. Frame coloring is only available if the frame type is chrome.
               * @since Frame coloring is new in Chrome 36.
               */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Allows the frame color of the window when inactive to be set differently to the active color. Frame coloring is only available if the frame type is chrome.
               * inactiveColor must be used in conjunction with color.
               * @since Frame coloring is new in Chrome 36.
               */
  var inactiveColor: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Frame type: none or chrome (defaults to chrome).
               *
               * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
               * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
               */
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.chrome
}

