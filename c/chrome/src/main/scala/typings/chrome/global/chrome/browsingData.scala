package typings.chrome.global.chrome

import typings.chrome.chrome.browsingData.DataTypeSet
import typings.chrome.chrome.browsingData.RemovalOptions
import typings.chrome.chrome.browsingData.SettingsCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.browsingData.remove")
  @js.native
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet): Unit = js.native
  @JSGlobal("chrome.browsingData.remove")
  @js.native
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeAppcache")
  @js.native
  def removeAppcache(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeAppcache")
  @js.native
  def removeAppcache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeCache")
  @js.native
  def removeCache(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeCache")
  @js.native
  def removeCache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeCookies")
  @js.native
  def removeCookies(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeCookies")
  @js.native
  def removeCookies(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeDownloads")
  @js.native
  def removeDownloads(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeDownloads")
  @js.native
  def removeDownloads(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeFileSystems")
  @js.native
  def removeFileSystems(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeFileSystems")
  @js.native
  def removeFileSystems(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeFormData")
  @js.native
  def removeFormData(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeFormData")
  @js.native
  def removeFormData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeHistory")
  @js.native
  def removeHistory(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeHistory")
  @js.native
  def removeHistory(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeIndexedDB")
  @js.native
  def removeIndexedDB(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeIndexedDB")
  @js.native
  def removeIndexedDB(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeLocalStorage")
  @js.native
  def removeLocalStorage(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeLocalStorage")
  @js.native
  def removeLocalStorage(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removePasswords")
  @js.native
  def removePasswords(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removePasswords")
  @js.native
  def removePasswords(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removePluginData")
  @js.native
  def removePluginData(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removePluginData")
  @js.native
  def removePluginData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.removeWebSQL")
  @js.native
  def removeWebSQL(options: RemovalOptions): Unit = js.native
  @JSGlobal("chrome.browsingData.removeWebSQL")
  @js.native
  def removeWebSQL(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browsingData.settings")
  @js.native
  def settings(callback: js.Function1[/* result */ SettingsCallback, Unit]): Unit = js.native
}
