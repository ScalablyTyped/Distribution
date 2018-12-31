package typings
package cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationManager extends js.Object {
  var BeaconRegion: BeaconRegion
  var Region: Region
  var delegate: Delegate
  def appendToDeviceLog(message: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String]
  def disableBluetooth(): qLib.qMod.QNs.Promise[scala.Unit]
  def disableDebugLogs(): qLib.qMod.QNs.Promise[scala.Unit]
  def disableDebugNotifications(): qLib.qMod.QNs.Promise[scala.Unit]
  def enableBluetooth(): qLib.qMod.QNs.Promise[scala.Unit]
  def enableDebugLogs(): qLib.qMod.QNs.Promise[scala.Unit]
  def enableDebugNotifications(): qLib.qMod.QNs.Promise[scala.Unit]
  def getAuthorizationStatus(): qLib.qMod.QNs.Promise[PluginResult]
  def getMonitoredRegions(): qLib.qMod.QNs.Promise[js.Array[Region]]
  def getRangedRegions(): qLib.qMod.QNs.Promise[js.Array[Region]]
  def isAdvertising(): qLib.qMod.QNs.Promise[scala.Boolean]
  def isAdvertisingAvailable(): qLib.qMod.QNs.Promise[scala.Boolean]
  def isBluetoothEnabled(): qLib.qMod.QNs.Promise[scala.Boolean]
  def isMonitoringAvailableForClass(region: Region): qLib.qMod.QNs.Promise[scala.Boolean]
  def isRangingAvailable(): qLib.qMod.QNs.Promise[scala.Boolean]
  def onDomDelegateReady(): qLib.qMod.QNs.Promise[scala.Unit]
  def requestAlwaysAuthorization(): qLib.qMod.QNs.Promise[scala.Unit]
  def requestStateForRegion(region: Region): qLib.qMod.QNs.Promise[scala.Unit]
  def requestWhenInUseAuthorization(): qLib.qMod.QNs.Promise[scala.Unit]
  def startAdvertising(region: Region, measuredPower: scala.Boolean): qLib.qMod.QNs.Promise[scala.Unit]
  def startMonitoringForRegion(region: Region): qLib.qMod.QNs.Promise[scala.Unit]
  def startRangingBeaconsInRegion(region: Region): qLib.qMod.QNs.Promise[scala.Unit]
  def stopAdvertising(): qLib.qMod.QNs.Promise[scala.Unit]
  def stopMonitoringForRegion(region: Region): qLib.qMod.QNs.Promise[scala.Unit]
  def stopRangingBeaconsInRegion(region: Region): qLib.qMod.QNs.Promise[scala.Unit]
}

