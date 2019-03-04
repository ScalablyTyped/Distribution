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

object LocationManager {
  @scala.inline
  def apply(
    BeaconRegion: BeaconRegion,
    Region: Region,
    appendToDeviceLog: js.Function1[java.lang.String, qLib.qMod.QNs.Promise[java.lang.String]],
    delegate: Delegate,
    disableBluetooth: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    disableDebugLogs: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    disableDebugNotifications: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    enableBluetooth: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    enableDebugLogs: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    enableDebugNotifications: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    getAuthorizationStatus: js.Function0[qLib.qMod.QNs.Promise[PluginResult]],
    getMonitoredRegions: js.Function0[qLib.qMod.QNs.Promise[js.Array[Region]]],
    getRangedRegions: js.Function0[qLib.qMod.QNs.Promise[js.Array[Region]]],
    isAdvertising: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    isAdvertisingAvailable: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    isBluetoothEnabled: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    isMonitoringAvailableForClass: js.Function1[Region, qLib.qMod.QNs.Promise[scala.Boolean]],
    isRangingAvailable: js.Function0[qLib.qMod.QNs.Promise[scala.Boolean]],
    onDomDelegateReady: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    requestAlwaysAuthorization: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    requestStateForRegion: js.Function1[Region, qLib.qMod.QNs.Promise[scala.Unit]],
    requestWhenInUseAuthorization: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    startAdvertising: js.Function2[Region, scala.Boolean, qLib.qMod.QNs.Promise[scala.Unit]],
    startMonitoringForRegion: js.Function1[Region, qLib.qMod.QNs.Promise[scala.Unit]],
    startRangingBeaconsInRegion: js.Function1[Region, qLib.qMod.QNs.Promise[scala.Unit]],
    stopAdvertising: js.Function0[qLib.qMod.QNs.Promise[scala.Unit]],
    stopMonitoringForRegion: js.Function1[Region, qLib.qMod.QNs.Promise[scala.Unit]],
    stopRangingBeaconsInRegion: js.Function1[Region, qLib.qMod.QNs.Promise[scala.Unit]]
  ): LocationManager = {
    val __obj = js.Dynamic.literal(BeaconRegion = BeaconRegion, Region = Region, appendToDeviceLog = appendToDeviceLog, delegate = delegate, disableBluetooth = disableBluetooth, disableDebugLogs = disableDebugLogs, disableDebugNotifications = disableDebugNotifications, enableBluetooth = enableBluetooth, enableDebugLogs = enableDebugLogs, enableDebugNotifications = enableDebugNotifications, getAuthorizationStatus = getAuthorizationStatus, getMonitoredRegions = getMonitoredRegions, getRangedRegions = getRangedRegions, isAdvertising = isAdvertising, isAdvertisingAvailable = isAdvertisingAvailable, isBluetoothEnabled = isBluetoothEnabled, isMonitoringAvailableForClass = isMonitoringAvailableForClass, isRangingAvailable = isRangingAvailable, onDomDelegateReady = onDomDelegateReady, requestAlwaysAuthorization = requestAlwaysAuthorization, requestStateForRegion = requestStateForRegion, requestWhenInUseAuthorization = requestWhenInUseAuthorization, startAdvertising = startAdvertising, startMonitoringForRegion = startMonitoringForRegion, startRangingBeaconsInRegion = startRangingBeaconsInRegion, stopAdvertising = stopAdvertising, stopMonitoringForRegion = stopMonitoringForRegion, stopRangingBeaconsInRegion = stopRangingBeaconsInRegion)
  
    __obj.asInstanceOf[LocationManager]
  }
}

