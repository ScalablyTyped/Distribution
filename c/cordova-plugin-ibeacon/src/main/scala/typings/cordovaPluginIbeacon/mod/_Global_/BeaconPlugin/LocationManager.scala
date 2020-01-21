package typings.cordovaPluginIbeacon.mod._Global_.BeaconPlugin

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationManager extends js.Object {
  var BeaconRegion: typings.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.BeaconRegion
  var Region: typings.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.Region
  var delegate: Delegate
  def appendToDeviceLog(message: String): Promise[String]
  def disableBluetooth(): Promise[Unit]
  def disableDebugLogs(): Promise[Unit]
  def disableDebugNotifications(): Promise[Unit]
  def enableBluetooth(): Promise[Unit]
  def enableDebugLogs(): Promise[Unit]
  def enableDebugNotifications(): Promise[Unit]
  def getAuthorizationStatus(): Promise[PluginResult]
  def getMonitoredRegions(): Promise[js.Array[Region]]
  def getRangedRegions(): Promise[js.Array[Region]]
  def isAdvertising(): Promise[Boolean]
  def isAdvertisingAvailable(): Promise[Boolean]
  def isBluetoothEnabled(): Promise[Boolean]
  def isMonitoringAvailableForClass(region: Region): Promise[Boolean]
  def isRangingAvailable(): Promise[Boolean]
  def onDomDelegateReady(): Promise[Unit]
  def requestAlwaysAuthorization(): Promise[Unit]
  def requestStateForRegion(region: Region): Promise[Unit]
  def requestWhenInUseAuthorization(): Promise[Unit]
  def startAdvertising(region: Region, measuredPower: Boolean): Promise[Unit]
  def startMonitoringForRegion(region: Region): Promise[Unit]
  def startRangingBeaconsInRegion(region: Region): Promise[Unit]
  def stopAdvertising(): Promise[Unit]
  def stopMonitoringForRegion(region: Region): Promise[Unit]
  def stopRangingBeaconsInRegion(region: Region): Promise[Unit]
}

object LocationManager {
  @scala.inline
  def apply(
    BeaconRegion: BeaconRegion,
    Region: Region,
    appendToDeviceLog: String => Promise[String],
    delegate: Delegate,
    disableBluetooth: () => Promise[Unit],
    disableDebugLogs: () => Promise[Unit],
    disableDebugNotifications: () => Promise[Unit],
    enableBluetooth: () => Promise[Unit],
    enableDebugLogs: () => Promise[Unit],
    enableDebugNotifications: () => Promise[Unit],
    getAuthorizationStatus: () => Promise[PluginResult],
    getMonitoredRegions: () => Promise[js.Array[Region]],
    getRangedRegions: () => Promise[js.Array[Region]],
    isAdvertising: () => Promise[Boolean],
    isAdvertisingAvailable: () => Promise[Boolean],
    isBluetoothEnabled: () => Promise[Boolean],
    isMonitoringAvailableForClass: Region => Promise[Boolean],
    isRangingAvailable: () => Promise[Boolean],
    onDomDelegateReady: () => Promise[Unit],
    requestAlwaysAuthorization: () => Promise[Unit],
    requestStateForRegion: Region => Promise[Unit],
    requestWhenInUseAuthorization: () => Promise[Unit],
    startAdvertising: (Region, Boolean) => Promise[Unit],
    startMonitoringForRegion: Region => Promise[Unit],
    startRangingBeaconsInRegion: Region => Promise[Unit],
    stopAdvertising: () => Promise[Unit],
    stopMonitoringForRegion: Region => Promise[Unit],
    stopRangingBeaconsInRegion: Region => Promise[Unit]
  ): LocationManager = {
    val __obj = js.Dynamic.literal(BeaconRegion = BeaconRegion.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], appendToDeviceLog = js.Any.fromFunction1(appendToDeviceLog), delegate = delegate.asInstanceOf[js.Any], disableBluetooth = js.Any.fromFunction0(disableBluetooth), disableDebugLogs = js.Any.fromFunction0(disableDebugLogs), disableDebugNotifications = js.Any.fromFunction0(disableDebugNotifications), enableBluetooth = js.Any.fromFunction0(enableBluetooth), enableDebugLogs = js.Any.fromFunction0(enableDebugLogs), enableDebugNotifications = js.Any.fromFunction0(enableDebugNotifications), getAuthorizationStatus = js.Any.fromFunction0(getAuthorizationStatus), getMonitoredRegions = js.Any.fromFunction0(getMonitoredRegions), getRangedRegions = js.Any.fromFunction0(getRangedRegions), isAdvertising = js.Any.fromFunction0(isAdvertising), isAdvertisingAvailable = js.Any.fromFunction0(isAdvertisingAvailable), isBluetoothEnabled = js.Any.fromFunction0(isBluetoothEnabled), isMonitoringAvailableForClass = js.Any.fromFunction1(isMonitoringAvailableForClass), isRangingAvailable = js.Any.fromFunction0(isRangingAvailable), onDomDelegateReady = js.Any.fromFunction0(onDomDelegateReady), requestAlwaysAuthorization = js.Any.fromFunction0(requestAlwaysAuthorization), requestStateForRegion = js.Any.fromFunction1(requestStateForRegion), requestWhenInUseAuthorization = js.Any.fromFunction0(requestWhenInUseAuthorization), startAdvertising = js.Any.fromFunction2(startAdvertising), startMonitoringForRegion = js.Any.fromFunction1(startMonitoringForRegion), startRangingBeaconsInRegion = js.Any.fromFunction1(startRangingBeaconsInRegion), stopAdvertising = js.Any.fromFunction0(stopAdvertising), stopMonitoringForRegion = js.Any.fromFunction1(stopMonitoringForRegion), stopRangingBeaconsInRegion = js.Any.fromFunction1(stopRangingBeaconsInRegion))
  
    __obj.asInstanceOf[LocationManager]
  }
}

