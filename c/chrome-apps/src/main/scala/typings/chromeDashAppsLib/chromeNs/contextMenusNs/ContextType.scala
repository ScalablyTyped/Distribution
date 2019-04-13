package typings
package chromeDashAppsLib.chromeNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The different contexts a menu can appear in.
  * Specifying 'all' is equivalent to the combination of all other contexts except for 'launcher'.
  * The 'launcher' context is only supported by apps and is used to add menu items to the context menu that appears when clicking on the app icon in the launcher/taskbar/dock/etc.
  * Different platforms might put limitations on what is actually supported in a launcher context menu.
  **/
@JSGlobal("chrome.contextMenus.ContextType")
@js.native
object ContextType extends js.Object {
  var ALL: chromeDashAppsLib.chromeDashAppsLibStrings.all = js.native
  var AUDIO: chromeDashAppsLib.chromeDashAppsLibStrings.audio = js.native
  var BROWSER_ACTION: chromeDashAppsLib.chromeDashAppsLibStrings.browser_action = js.native
  var EDITABLE: chromeDashAppsLib.chromeDashAppsLibStrings.editable = js.native
  var FRAME: chromeDashAppsLib.chromeDashAppsLibStrings.frame = js.native
  var IMAGE: chromeDashAppsLib.chromeDashAppsLibStrings.image = js.native
  var LAUNCHER: chromeDashAppsLib.chromeDashAppsLibStrings.launcher = js.native
  var LINK: chromeDashAppsLib.chromeDashAppsLibStrings.link = js.native
  var PAGE: chromeDashAppsLib.chromeDashAppsLibStrings.page = js.native
  var PAGE_ACTION: chromeDashAppsLib.chromeDashAppsLibStrings.page_action = js.native
  var SELECTION: chromeDashAppsLib.chromeDashAppsLibStrings.selection = js.native
  var VIDEO: chromeDashAppsLib.chromeDashAppsLibStrings.video = js.native
}

