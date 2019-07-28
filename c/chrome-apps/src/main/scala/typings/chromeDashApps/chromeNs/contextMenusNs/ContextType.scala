package typings.chromeDashApps.chromeNs.contextMenusNs

import typings.chromeDashApps.chromeDashAppsStrings.all
import typings.chromeDashApps.chromeDashAppsStrings.audio
import typings.chromeDashApps.chromeDashAppsStrings.browser_action
import typings.chromeDashApps.chromeDashAppsStrings.editable
import typings.chromeDashApps.chromeDashAppsStrings.frame
import typings.chromeDashApps.chromeDashAppsStrings.image
import typings.chromeDashApps.chromeDashAppsStrings.launcher
import typings.chromeDashApps.chromeDashAppsStrings.link
import typings.chromeDashApps.chromeDashAppsStrings.page
import typings.chromeDashApps.chromeDashAppsStrings.page_action
import typings.chromeDashApps.chromeDashAppsStrings.selection
import typings.chromeDashApps.chromeDashAppsStrings.video
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
  var ALL: all = js.native
  var AUDIO: audio = js.native
  var BROWSER_ACTION: browser_action = js.native
  var EDITABLE: editable = js.native
  var FRAME: frame = js.native
  var IMAGE: image = js.native
  var LAUNCHER: launcher = js.native
  var LINK: link = js.native
  var PAGE: page = js.native
  var PAGE_ACTION: page_action = js.native
  var SELECTION: selection = js.native
  var VIDEO: video = js.native
}

