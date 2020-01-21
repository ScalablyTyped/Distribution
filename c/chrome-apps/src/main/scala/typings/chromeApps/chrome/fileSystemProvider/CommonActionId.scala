package typings.chromeApps.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of common actions. 'SHARE' is for sharing files with others.
  * 'SAVE_FOR_OFFLINE' for pinning (saving for offline access).
  * 'OFFLINE_NOT_NECESSARY' for notifying that the file doesn't
  * need to be stored for offline access anymore.
  * Used by onGetActionsRequested and onExecuteActionRequested.
  */
@JSGlobal("chrome.fileSystemProvider.CommonActionId")
@js.native
object CommonActionId extends js.Object {
  var OFFLINE_NOT_NECESSARY: typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY = js.native
  var SAVE_FOR_OFFLINE: typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE = js.native
  var SHARE: typings.chromeApps.chromeAppsStrings.SHARE = js.native
}

