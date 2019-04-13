package typings
package cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationManager extends js.Object {
  var BeaconRegion: cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs.BeaconRegion
  var Region: cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs.Region
  var delegate: Delegate
  def appendToDeviceLog(message: java.lang.String): qLib.qMod.Promise[java.lang.String]
  def disableBluetooth(): qLib.qMod.Promise[scala.Unit]
  def disableDebugLogs(): qLib.qMod.Promise[scala.Unit]
  def disableDebugNotifications(): qLib.qMod.Promise[scala.Unit]
  def enableBluetooth(): qLib.qMod.Promise[scala.Unit]
  def enableDebugLogs(): qLib.qMod.Promise[scala.Unit]
  def enableDebugNotifications(): qLib.qMod.Promise[scala.Unit]
  def getAuthorizationStatus(): qLib.qMod.Promise[PluginResult]
  def getMonitoredRegions(): qLib.qMod.Promise[js.Array[Region]]
  def getRangedRegions(): qLib.qMod.Promise[js.Array[Region]]
  def isAdvertising(): qLib.qMod.Promise[scala.Boolean]
  def isAdvertisingAvailable(): qLib.qMod.Promise[scala.Boolean]
  def isBluetoothEnabled(): qLib.qMod.Promise[scala.Boolean]
  def isMonitoringAvailableForClass(region: Region): qLib.qMod.Promise[scala.Boolean]
  def isRangingAvailable(): qLib.qMod.Promise[scala.Boolean]
  def onDomDelegateReady(): qLib.qMod.Promise[scala.Unit]
  def requestAlwaysAuthorization(): qLib.qMod.Promise[scala.Unit]
  def requestStateForRegion(region: Region): qLib.qMod.Promise[scala.Unit]
  def requestWhenInUseAuthorization(): qLib.qMod.Promise[scala.Unit]
  def startAdvertising(region: Region, measuredPower: scala.Boolean): qLib.qMod.Promise[scala.Unit]
  def startMonitoringForRegion(region: Region): qLib.qMod.Promise[scala.Unit]
  def startRangingBeaconsInRegion(region: Region): qLib.qMod.Promise[scala.Unit]
  def stopAdvertising(): qLib.qMod.Promise[scala.Unit]
  def stopMonitoringForRegion(region: Region): qLib.qMod.Promise[scala.Unit]
  def stopRangingBeaconsInRegion(region: Region): qLib.qMod.Promise[scala.Unit]
}

object LocationManager {
  @scala.inline
  def apply(
    BeaconRegion: BeaconRegion,
    Region: Region,
    appendToDeviceLog: java.lang.String => qLib.qMod.Promise[java.lang.String],
    delegate: Delegate,
    disableBluetooth: () => qLib.qMod.Promise[scala.Unit],
    disableDebugLogs: () => qLib.qMod.Promise[scala.Unit],
    disableDebugNotifications: () => qLib.qMod.Promise[scala.Unit],
    enableBluetooth: () => qLib.qMod.Promise[scala.Unit],
    enableDebugLogs: () => qLib.qMod.Promise[scala.Unit],
    enableDebugNotifications: () => qLib.qMod.Promise[scala.Unit],
    getAuthorizationStatus: () => qLib.qMod.Promise[PluginResult],
    getMonitoredRegions: () => qLib.qMod.Promise[js.Array[Region]],
    getRangedRegions: () => qLib.qMod.Promise[js.Array[Region]],
    isAdvertising: () => qLib.qMod.Promise[scala.Boolean],
    isAdvertisingAvailable: () => qLib.qMod.Promise[scala.Boolean],
    isBluetoothEnabled: () => qLib.qMod.Promise[scala.Boolean],
    isMonitoringAvailableForClass: Region => qLib.qMod.Promise[scala.Boolean],
    isRangingAvailable: () => qLib.qMod.Promise[scala.Boolean],
    onDomDelegateReady: () => qLib.qMod.Promise[scala.Unit],
    requestAlwaysAuthorization: () => qLib.qMod.Promise[scala.Unit],
    requestStateForRegion: Region => qLib.qMod.Promise[scala.Unit],
    requestWhenInUseAuthorization: () => qLib.qMod.Promise[scala.Unit],
    startAdvertising: (Region, scala.Boolean) => qLib.qMod.Promise[scala.Unit],
    startMonitoringForRegion: Region => qLib.qMod.Promise[scala.Unit],
    startRangingBeaconsInRegion: Region => qLib.qMod.Promise[scala.Unit],
    stopAdvertising: () => qLib.qMod.Promise[scala.Unit],
    stopMonitoringForRegion: Region => qLib.qMod.Promise[scala.Unit],
    stopRangingBeaconsInRegion: Region => qLib.qMod.Promise[scala.Unit]
  ): LocationManager = {
    val __obj = js.Dynamic.literal(BeaconRegion = BeaconRegion, Region = Region, appendToDeviceLog = js.Any.fromFunction1(appendToDeviceLog), delegate = delegate, disableBluetooth = js.Any.fromFunction0(disableBluetooth), disableDebugLogs = js.Any.fromFunction0(disableDebugLogs), disableDebugNotifications = js.Any.fromFunction0(disableDebugNotifications), enableBluetooth = js.Any.fromFunction0(enableBluetooth), enableDebugLogs = js.Any.fromFunction0(enableDebugLogs), enableDebugNotifications = js.Any.fromFunction0(enableDebugNotifications), getAuthorizationStatus = js.Any.fromFunction0(getAuthorizationStatus), getMonitoredRegions = js.Any.fromFunction0(getMonitoredRegions), getRangedRegions = js.Any.fromFunction0(getRangedRegions), isAdvertising = js.Any.fromFunction0(isAdvertising), isAdvertisingAvailable = js.Any.fromFunction0(isAdvertisingAvailable), isBluetoothEnabled = js.Any.fromFunction0(isBluetoothEnabled), isMonitoringAvailableForClass = js.Any.fromFunction1(isMonitoringAvailableForClass), isRangingAvailable = js.Any.fromFunction0(isRangingAvailable), onDomDelegateReady = js.Any.fromFunction0(onDomDelegateReady), requestAlwaysAuthorization = js.Any.fromFunction0(requestAlwaysAuthorization), requestStateForRegion = js.Any.fromFunction1(requestStateForRegion), requestWhenInUseAuthorization = js.Any.fromFunction0(requestWhenInUseAuthorization), startAdvertising = js.Any.fromFunction2(startAdvertising), startMonitoringForRegion = js.Any.fromFunction1(startMonitoringForRegion), startRangingBeaconsInRegion = js.Any.fromFunction1(startRangingBeaconsInRegion), stopAdvertising = js.Any.fromFunction0(stopAdvertising), stopMonitoringForRegion = js.Any.fromFunction1(stopMonitoringForRegion), stopRangingBeaconsInRegion = js.Any.fromFunction1(stopRangingBeaconsInRegion))
  
    __obj.asInstanceOf[LocationManager]
  }
}

