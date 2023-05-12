package typings.chrome.anon

import typings.chrome.chrome.browsingData.DataTypeSet
import typings.chrome.chrome.browsingData.RemovalOptions
import typings.chrome.chrome.browsingData.SettingsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofbrowsingData extends StObject {
  
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet): js.Promise[Unit] = js.native
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet, callback: js.Function0[Unit]): Unit = js.native
  
  def removeAppcache(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeAppcache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeCache(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeCache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeCacheStorage(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeCacheStorage(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeCookies(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeCookies(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeDownloads(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeDownloads(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeFileSystems(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeFileSystems(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeFormData(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeFormData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeHistory(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeHistory(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeIndexedDB(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeIndexedDB(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeLocalStorage(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeLocalStorage(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removePasswords(options: RemovalOptions): js.Promise[Unit] = js.native
  def removePasswords(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removePluginData(options: RemovalOptions): js.Promise[Unit] = js.native
  def removePluginData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeServiceWorkers(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeServiceWorkers(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeWebSQL(options: RemovalOptions): js.Promise[Unit] = js.native
  def removeWebSQL(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def settings(): js.Promise[SettingsResult] = js.native
  def settings(callback: js.Function1[/* result */ SettingsResult, Unit]): Unit = js.native
}
