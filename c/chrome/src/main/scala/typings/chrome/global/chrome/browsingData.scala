package typings.chrome.global.chrome

import typings.chrome.chrome.browsingData.DataTypeSet
import typings.chrome.chrome.browsingData.RemovalOptions
import typings.chrome.chrome.browsingData.SettingsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Browsing Data
////////////////////
/**
  * Use the chrome.browsingData API to remove browsing data from a user's local profile.
  * Availability: Since Chrome 19.
  * Permissions:  "browsingData"
  */
object browsingData {
  
  @JSGlobal("chrome.browsingData")
  @js.native
  val ^ : js.Any = js.native
  
  inline def remove(options: RemovalOptions, dataToRemove: DataTypeSet): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(options.asInstanceOf[js.Any], dataToRemove.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def remove(options: RemovalOptions, dataToRemove: DataTypeSet, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(options.asInstanceOf[js.Any], dataToRemove.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeAppcache(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAppcache")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeAppcache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAppcache")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeCache(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCache")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeCache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCache")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeCacheStorage(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCacheStorage")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeCacheStorage(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCacheStorage")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeCookies(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCookies")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeCookies(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCookies")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeDownloads(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDownloads")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeDownloads(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDownloads")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeFileSystems(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFileSystems")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeFileSystems(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFileSystems")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeFormData(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFormData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeFormData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFormData")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeHistory(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHistory")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeHistory(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeHistory")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeIndexedDB(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeIndexedDB")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeIndexedDB(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIndexedDB")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeLocalStorage(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLocalStorage")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeLocalStorage(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLocalStorage")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removePasswords(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removePasswords")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removePasswords(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removePasswords")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removePluginData(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removePluginData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removePluginData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removePluginData")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeServiceWorkers(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeServiceWorkers")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeServiceWorkers(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeServiceWorkers")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeWebSQL(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeWebSQL")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeWebSQL(options: RemovalOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWebSQL")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def settings(): js.Promise[SettingsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")().asInstanceOf[js.Promise[SettingsResult]]
  inline def settings(callback: js.Function1[/* result */ SettingsResult, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
