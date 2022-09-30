package typings.chrome.global.chrome

import typings.chrome.chrome.windows.CreateData
import typings.chrome.chrome.windows.QueryOptions
import typings.chrome.chrome.windows.UpdateInfo
import typings.chrome.chrome.windows.Window
import typings.chrome.chrome.windows.WindowIdEvent
import typings.chrome.chrome.windows.WindowReferenceEvent
import typings.chrome.chromeInts.`-1`
import typings.chrome.chromeInts.`-2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def WINDOW_ID_CURRENT: `-2` = js.native
  inline def WINDOW_ID_CURRENT_=(x: `-2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW_ID_CURRENT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.windows.WINDOW_ID_NONE")
  @js.native
  def WINDOW_ID_NONE: `-1` = js.native
  inline def WINDOW_ID_NONE_=(x: `-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW_ID_NONE")(x.asInstanceOf[js.Any])
  
  inline def create(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Unit]
  inline def create(callback: js.Function1[/* window */ js.UndefOr[Window], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def create(createData: CreateData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def create(createData: CreateData, callback: js.Function1[/* window */ js.UndefOr[Window], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(createData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create_Promise(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[Window]]
  inline def create_Promise(createData: CreateData): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  
  inline def get(windowId: Double): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  inline def get(windowId: Double, callback: js.Function1[/* window */ Window, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(windowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(windowId: Double, queryOptions: QueryOptions): js.Promise[Window] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(windowId.asInstanceOf[js.Any], queryOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Window]]
  inline def get(windowId: Double, queryOptions: QueryOptions, callback: js.Function1[/* window */ Window, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(windowId.asInstanceOf[js.Any], queryOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAll(): js.Promise[js.Array[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[js.Array[Window]]]
  inline def getAll(callback: js.Function1[/* windows */ js.Array[Window], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getAll(queryOptions: QueryOptions): js.Promise[js.Array[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(queryOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Window]]]
  inline def getAll(queryOptions: QueryOptions, callback: js.Function1[/* windows */ js.Array[Window], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(queryOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCurrent(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[js.Promise[Window]]
  inline def getCurrent(callback: js.Function1[/* window */ Window, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getCurrent(queryOptions: QueryOptions): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(queryOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  inline def getCurrent(queryOptions: QueryOptions, callback: js.Function1[/* window */ Window, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(queryOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getLastFocused(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocused")().asInstanceOf[js.Promise[Window]]
  inline def getLastFocused(callback: js.Function1[/* window */ Window, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocused")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getLastFocused(queryOptions: QueryOptions): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocused")(queryOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  inline def getLastFocused(queryOptions: QueryOptions, callback: js.Function1[/* window */ Window, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocused")(queryOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.windows.onBoundsChanged")
  @js.native
  def onBoundsChanged: WindowReferenceEvent = js.native
  inline def onBoundsChanged_=(x: WindowReferenceEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBoundsChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.windows.onCreated")
  @js.native
  def onCreated: WindowReferenceEvent = js.native
  inline def onCreated_=(x: WindowReferenceEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.windows.onFocusChanged")
  @js.native
  def onFocusChanged: WindowIdEvent = js.native
  inline def onFocusChanged_=(x: WindowIdEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocusChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.windows.onRemoved")
  @js.native
  def onRemoved: WindowIdEvent = js.native
  inline def onRemoved_=(x: WindowIdEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  inline def remove(windowId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(windowId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(windowId: Double, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(windowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove_Promise(windowId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def update(windowId: Double, updateInfo: UpdateInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(windowId.asInstanceOf[js.Any], updateInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(windowId: Double, updateInfo: UpdateInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(windowId.asInstanceOf[js.Any], updateInfo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def update_Promise(windowId: Double, updateInfo: UpdateInfo): js.Promise[Window] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(windowId.asInstanceOf[js.Any], updateInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Window]]
}
