package typings
package chromeLib.chromeNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browsingData")
@js.native
object ^ extends js.Object {
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet): scala.Unit = js.native
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeAppcache(options: RemovalOptions): scala.Unit = js.native
  def removeAppcache(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeCache(options: RemovalOptions): scala.Unit = js.native
  def removeCache(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeCookies(options: RemovalOptions): scala.Unit = js.native
  def removeCookies(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeDownloads(options: RemovalOptions): scala.Unit = js.native
  def removeDownloads(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeFileSystems(options: RemovalOptions): scala.Unit = js.native
  def removeFileSystems(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeFormData(options: RemovalOptions): scala.Unit = js.native
  def removeFormData(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeHistory(options: RemovalOptions): scala.Unit = js.native
  def removeHistory(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeIndexedDB(options: RemovalOptions): scala.Unit = js.native
  def removeIndexedDB(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeLocalStorage(options: RemovalOptions): scala.Unit = js.native
  def removeLocalStorage(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removePasswords(options: RemovalOptions): scala.Unit = js.native
  def removePasswords(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removePluginData(options: RemovalOptions): scala.Unit = js.native
  def removePluginData(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeWebSQL(options: RemovalOptions): scala.Unit = js.native
  def removeWebSQL(options: RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def settings(callback: js.Function1[/* result */ SettingsCallback, scala.Unit]): scala.Unit = js.native
}

