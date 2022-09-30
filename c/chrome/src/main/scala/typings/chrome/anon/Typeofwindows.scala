package typings.chrome.anon

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

@js.native
trait Typeofwindows extends StObject {
  
  var WINDOW_ID_CURRENT: `-2` = js.native
  
  var WINDOW_ID_NONE: `-1` = js.native
  
  def create(): Unit = js.native
  def create(callback: js.Function1[/* window */ js.UndefOr[this.type], Unit]): Unit = js.native
  def create(createData: CreateData): Unit = js.native
  def create(createData: CreateData, callback: js.Function1[/* window */ js.UndefOr[this.type], Unit]): Unit = js.native
  @JSName("create")
  def create_Promise(): js.Promise[Window] = js.native
  @JSName("create")
  def create_Promise(createData: CreateData): js.Promise[Window] = js.native
  
  def get(windowId: Double): js.Promise[Window] = js.native
  def get(windowId: Double, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  def get(windowId: Double, queryOptions: QueryOptions): js.Promise[Window] = js.native
  def get(windowId: Double, queryOptions: QueryOptions, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  
  def getAll(): js.Promise[js.Array[Window]] = js.native
  def getAll(callback: js.Function1[/* windows */ js.Array[this.type], Unit]): Unit = js.native
  def getAll(queryOptions: QueryOptions): js.Promise[js.Array[Window]] = js.native
  def getAll(queryOptions: QueryOptions, callback: js.Function1[/* windows */ js.Array[this.type], Unit]): Unit = js.native
  
  def getCurrent(): js.Promise[Window] = js.native
  def getCurrent(callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  def getCurrent(queryOptions: QueryOptions): js.Promise[Window] = js.native
  def getCurrent(queryOptions: QueryOptions, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  
  def getLastFocused(): js.Promise[Window] = js.native
  def getLastFocused(callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  def getLastFocused(queryOptions: QueryOptions): js.Promise[Window] = js.native
  def getLastFocused(queryOptions: QueryOptions, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  
  var onBoundsChanged: WindowReferenceEvent = js.native
  
  var onCreated: WindowReferenceEvent = js.native
  
  var onFocusChanged: WindowIdEvent = js.native
  
  var onRemoved: WindowIdEvent = js.native
  
  def remove(windowId: Double): Unit = js.native
  def remove(windowId: Double, callback: js.Function): Unit = js.native
  @JSName("remove")
  def remove_Promise(windowId: Double): js.Promise[Unit] = js.native
  
  def update(windowId: Double, updateInfo: UpdateInfo): Unit = js.native
  def update(windowId: Double, updateInfo: UpdateInfo, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  @JSName("update")
  def update_Promise(windowId: Double, updateInfo: UpdateInfo): js.Promise[Window] = js.native
}
