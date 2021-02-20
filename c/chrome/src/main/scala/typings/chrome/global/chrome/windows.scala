package typings.chrome.global.chrome

import typings.chrome.chrome.windows.CreateData
import typings.chrome.chrome.windows.GetInfo
import typings.chrome.chrome.windows.UpdateInfo
import typings.chrome.chrome.windows.Window
import typings.chrome.chrome.windows.WindowIdEvent
import typings.chrome.chrome.windows.WindowReferenceEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Windows
////////////////////
/**
  * Use the chrome.windows API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  * Permissions: The chrome.windows API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab objects.
  * @since Chrome 5.
  */
object windows {
  
  @JSGlobal("chrome.windows")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.windows.WINDOW_ID_CURRENT")
  @js.native
  def WINDOW_ID_CURRENT: Double = js.native
  @scala.inline
  def WINDOW_ID_CURRENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW_ID_CURRENT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.windows.WINDOW_ID_NONE")
  @js.native
  def WINDOW_ID_NONE: Double = js.native
  @scala.inline
  def WINDOW_ID_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW_ID_NONE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.windows.create")
  @js.native
  def create(): Unit = js.native
  @JSGlobal("chrome.windows.create")
  @js.native
  def create(callback: js.Function1[/* window */ js.UndefOr[Window], Unit]): Unit = js.native
  @JSGlobal("chrome.windows.create")
  @js.native
  def create(createData: CreateData): Unit = js.native
  @JSGlobal("chrome.windows.create")
  @js.native
  def create(createData: CreateData, callback: js.Function1[/* window */ js.UndefOr[Window], Unit]): Unit = js.native
  
  @JSGlobal("chrome.windows.get")
  @js.native
  def get(windowId: Double, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  @JSGlobal("chrome.windows.get")
  @js.native
  def get(windowId: Double, getInfo: GetInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  
  @JSGlobal("chrome.windows.getAll")
  @js.native
  def getAll(callback: js.Function1[/* windows */ js.Array[Window], Unit]): Unit = js.native
  @JSGlobal("chrome.windows.getAll")
  @js.native
  def getAll(getInfo: GetInfo, callback: js.Function1[/* windows */ js.Array[Window], Unit]): Unit = js.native
  
  @JSGlobal("chrome.windows.getCurrent")
  @js.native
  def getCurrent(callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  @JSGlobal("chrome.windows.getCurrent")
  @js.native
  def getCurrent(getInfo: GetInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  
  @JSGlobal("chrome.windows.getLastFocused")
  @js.native
  def getLastFocused(callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  @JSGlobal("chrome.windows.getLastFocused")
  @js.native
  def getLastFocused(getInfo: GetInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  
  @JSGlobal("chrome.windows.onCreated")
  @js.native
  def onCreated: WindowReferenceEvent = js.native
  @scala.inline
  def onCreated_=(x: WindowReferenceEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.windows.onFocusChanged")
  @js.native
  def onFocusChanged: WindowIdEvent = js.native
  @scala.inline
  def onFocusChanged_=(x: WindowIdEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocusChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.windows.onRemoved")
  @js.native
  def onRemoved: WindowIdEvent = js.native
  @scala.inline
  def onRemoved_=(x: WindowIdEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.windows.remove")
  @js.native
  def remove(windowId: Double): Unit = js.native
  @JSGlobal("chrome.windows.remove")
  @js.native
  def remove(windowId: Double, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.windows.update")
  @js.native
  def update(windowId: Double, updateInfo: UpdateInfo): Unit = js.native
  @JSGlobal("chrome.windows.update")
  @js.native
  def update(windowId: Double, updateInfo: UpdateInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
}
