package typings.chrome.anon

import typings.chrome.chrome.browsingData.DataTypeSet
import typings.chrome.chrome.browsingData.RemovalOptions
import typings.chrome.chrome.browsingData.SettingsCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofbrowsingData extends StObject {
  
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet): Unit = js.native
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet, callback: js.Function0[Unit]): Unit = js.native
  
  def removeAppcache(options: RemovalOptions): Unit = js.native
  def removeAppcache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeCache(options: RemovalOptions): Unit = js.native
  def removeCache(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeCookies(options: RemovalOptions): Unit = js.native
  def removeCookies(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeDownloads(options: RemovalOptions): Unit = js.native
  def removeDownloads(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeFileSystems(options: RemovalOptions): Unit = js.native
  def removeFileSystems(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeFormData(options: RemovalOptions): Unit = js.native
  def removeFormData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeHistory(options: RemovalOptions): Unit = js.native
  def removeHistory(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeIndexedDB(options: RemovalOptions): Unit = js.native
  def removeIndexedDB(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeLocalStorage(options: RemovalOptions): Unit = js.native
  def removeLocalStorage(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removePasswords(options: RemovalOptions): Unit = js.native
  def removePasswords(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removePluginData(options: RemovalOptions): Unit = js.native
  def removePluginData(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def removeWebSQL(options: RemovalOptions): Unit = js.native
  def removeWebSQL(options: RemovalOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def settings(callback: js.Function1[/* result */ SettingsCallback, Unit]): Unit = js.native
}
