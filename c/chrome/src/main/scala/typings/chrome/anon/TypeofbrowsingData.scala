package typings.chrome.anon

import typings.chrome.chrome.browsingData.DataTypeSet
import typings.chrome.chrome.browsingData.RemovalOptions
import typings.chrome.chrome.browsingData.SettingsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofbrowsingData extends StObject {
  
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet): Unit = js.native
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet, callback: js.Function0[Unit]): Unit = js.native
  
  def removeAppcache(options: RemovalOptions): Unit = js.native
  def removeAppcache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeAppcache")
  def removeAppcache_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removeCache(options: RemovalOptions): Unit = js.native
  def removeCache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeCacheStorage(options: RemovalOptions): Unit = js.native
  def removeCacheStorage(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeCacheStorage")
  def removeCacheStorage_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  @JSName("removeCache")
  def removeCache_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removeCookies(options: RemovalOptions): Unit = js.native
  def removeCookies(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeCookies")
  def removeCookies_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  @JSName("removeCookies")
  def removeCookies_Promise(options: RemovalOptions, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def removeDownloads(options: RemovalOptions): Unit = js.native
  def removeDownloads(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeDownloads")
  def removeDownloads_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removeFileSystems(options: RemovalOptions): Unit = js.native
  def removeFileSystems(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeFileSystems")
  def removeFileSystems_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removeFormData(options: RemovalOptions): Unit = js.native
  def removeFormData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeFormData")
  def removeFormData_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removeHistory(options: RemovalOptions): Unit = js.native
  def removeHistory(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeHistory")
  def removeHistory_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removeIndexedDB(options: RemovalOptions): Unit = js.native
  def removeIndexedDB(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeIndexedDB")
  def removeIndexedDB_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removeLocalStorage(options: RemovalOptions): Unit = js.native
  def removeLocalStorage(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeLocalStorage")
  def removeLocalStorage_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removePasswords(options: RemovalOptions): Unit = js.native
  def removePasswords(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removePasswords")
  def removePasswords_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removePluginData(options: RemovalOptions): Unit = js.native
  def removePluginData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removePluginData")
  def removePluginData_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removeServiceWorkers(options: RemovalOptions): Unit = js.native
  def removeServiceWorkers(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeServiceWorkers")
  def removeServiceWorkers_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  def removeWebSQL(options: RemovalOptions): Unit = js.native
  def removeWebSQL(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  @JSName("removeWebSQL")
  def removeWebSQL_Promise(options: RemovalOptions): js.Promise[Unit] = js.native
  
  @JSName("remove")
  def remove_Promise(options: RemovalOptions, dataToRemove: DataTypeSet): js.Promise[Unit] = js.native
  
  def settings(): js.Promise[SettingsResult] = js.native
  def settings(callback: js.Function1[/* result */ SettingsResult, Unit]): Unit = js.native
}
