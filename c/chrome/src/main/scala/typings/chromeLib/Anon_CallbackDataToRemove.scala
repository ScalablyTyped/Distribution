package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackDataToRemove extends js.Object {
  def remove(
    options: chromeLib.chromeNs.browsingDataNs.RemovalOptions,
    dataToRemove: chromeLib.chromeNs.browsingDataNs.DataTypeSet
  ): scala.Unit = js.native
  def remove(
    options: chromeLib.chromeNs.browsingDataNs.RemovalOptions,
    dataToRemove: chromeLib.chromeNs.browsingDataNs.DataTypeSet,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def removeAppcache(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeAppcache(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeCache(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeCache(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeCookies(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeCookies(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeDownloads(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeDownloads(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeFileSystems(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeFileSystems(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeFormData(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeFormData(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeHistory(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeHistory(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeIndexedDB(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeIndexedDB(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeLocalStorage(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeLocalStorage(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removePasswords(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removePasswords(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removePluginData(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removePluginData(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeWebSQL(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions): scala.Unit = js.native
  def removeWebSQL(options: chromeLib.chromeNs.browsingDataNs.RemovalOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def settings(
    callback: js.Function1[/* result */ chromeLib.chromeNs.browsingDataNs.SettingsCallback, scala.Unit]
  ): scala.Unit = js.native
}

