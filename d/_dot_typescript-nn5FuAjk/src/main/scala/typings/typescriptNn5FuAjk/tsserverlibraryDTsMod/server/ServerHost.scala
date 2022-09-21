package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.DirectoryWatcherCallback
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FileWatcher
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FileWatcherCallback
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.System
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerHost
  extends StObject
     with System {
  
  def clearImmediate(timeoutId: Any): Unit = js.native
  
  @JSName("clearTimeout")
  def clearTimeout_MServerHost(timeoutId: Any): Unit = js.native
  
  var gc: js.UndefOr[js.Function0[Unit]] = js.native
  
  var require: js.UndefOr[js.Function2[/* initialPath */ String, /* moduleName */ String, RequireResult]] = js.native
  
  def setImmediate(callback: js.Function1[/* repeated */ Any, Unit], args: Any*): Any = js.native
  
  @JSName("setTimeout")
  def setTimeout_MServerHost(callback: js.Function1[/* repeated */ Any, Unit], ms: Double, args: Any*): Any = js.native
  
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
  
  @JSName("watchDirectory")
  def watchDirectory_MServerHost(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
  @JSName("watchDirectory")
  def watchDirectory_MServerHost(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
  @JSName("watchDirectory")
  def watchDirectory_MServerHost(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: WatchOptions): FileWatcher = js.native
  @JSName("watchDirectory")
  def watchDirectory_MServerHost(path: String, callback: DirectoryWatcherCallback, recursive: Unit, options: WatchOptions): FileWatcher = js.native
  
  @JSName("watchFile")
  def watchFile_MServerHost(path: String, callback: FileWatcherCallback): FileWatcher = js.native
  @JSName("watchFile")
  def watchFile_MServerHost(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
  @JSName("watchFile")
  def watchFile_MServerHost(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: WatchOptions): FileWatcher = js.native
  @JSName("watchFile")
  def watchFile_MServerHost(path: String, callback: FileWatcherCallback, pollingInterval: Unit, options: WatchOptions): FileWatcher = js.native
}
