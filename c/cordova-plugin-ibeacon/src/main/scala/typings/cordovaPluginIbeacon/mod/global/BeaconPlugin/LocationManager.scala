package typings.cordovaPluginIbeacon.mod.global.BeaconPlugin

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationManager extends js.Object {
  var BeaconRegion: typings.cordovaPluginIbeacon.mod.global.BeaconPlugin.BeaconRegion = js.native
  var Region: typings.cordovaPluginIbeacon.mod.global.BeaconPlugin.Region = js.native
  var delegate: Delegate = js.native
  def appendToDeviceLog(message: String): Promise[String] = js.native
  def disableBluetooth(): Promise[Unit] = js.native
  def disableDebugLogs(): Promise[Unit] = js.native
  def disableDebugNotifications(): Promise[Unit] = js.native
  def enableBluetooth(): Promise[Unit] = js.native
  def enableDebugLogs(): Promise[Unit] = js.native
  def enableDebugNotifications(): Promise[Unit] = js.native
  def getAuthorizationStatus(): Promise[PluginResult] = js.native
  def getMonitoredRegions(): Promise[js.Array[Region]] = js.native
  def getRangedRegions(): Promise[js.Array[Region]] = js.native
  def isAdvertising(): Promise[Boolean] = js.native
  def isAdvertisingAvailable(): Promise[Boolean] = js.native
  def isBluetoothEnabled(): Promise[Boolean] = js.native
  def isMonitoringAvailableForClass(region: Region): Promise[Boolean] = js.native
  def isRangingAvailable(): Promise[Boolean] = js.native
  def onDomDelegateReady(): Promise[Unit] = js.native
  def requestAlwaysAuthorization(): Promise[Unit] = js.native
  def requestStateForRegion(region: Region): Promise[Unit] = js.native
  def requestWhenInUseAuthorization(): Promise[Unit] = js.native
  def startAdvertising(region: Region, measuredPower: Boolean): Promise[Unit] = js.native
  def startMonitoringForRegion(region: Region): Promise[Unit] = js.native
  def startRangingBeaconsInRegion(region: Region): Promise[Unit] = js.native
  def stopAdvertising(): Promise[Unit] = js.native
  def stopMonitoringForRegion(region: Region): Promise[Unit] = js.native
  def stopRangingBeaconsInRegion(region: Region): Promise[Unit] = js.native
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
  @scala.inline
  implicit class LocationManagerOps[Self <: LocationManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeaconRegion(value: BeaconRegion): Self = this.set("BeaconRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: Region): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppendToDeviceLog(value: String => Promise[String]): Self = this.set("appendToDeviceLog", js.Any.fromFunction1(value))
    @scala.inline
    def setDelegate(value: Delegate): Self = this.set("delegate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableBluetooth(value: () => Promise[Unit]): Self = this.set("disableBluetooth", js.Any.fromFunction0(value))
    @scala.inline
    def setDisableDebugLogs(value: () => Promise[Unit]): Self = this.set("disableDebugLogs", js.Any.fromFunction0(value))
    @scala.inline
    def setDisableDebugNotifications(value: () => Promise[Unit]): Self = this.set("disableDebugNotifications", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableBluetooth(value: () => Promise[Unit]): Self = this.set("enableBluetooth", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableDebugLogs(value: () => Promise[Unit]): Self = this.set("enableDebugLogs", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableDebugNotifications(value: () => Promise[Unit]): Self = this.set("enableDebugNotifications", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAuthorizationStatus(value: () => Promise[PluginResult]): Self = this.set("getAuthorizationStatus", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMonitoredRegions(value: () => Promise[js.Array[Region]]): Self = this.set("getMonitoredRegions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRangedRegions(value: () => Promise[js.Array[Region]]): Self = this.set("getRangedRegions", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAdvertising(value: () => Promise[Boolean]): Self = this.set("isAdvertising", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAdvertisingAvailable(value: () => Promise[Boolean]): Self = this.set("isAdvertisingAvailable", js.Any.fromFunction0(value))
    @scala.inline
    def setIsBluetoothEnabled(value: () => Promise[Boolean]): Self = this.set("isBluetoothEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMonitoringAvailableForClass(value: Region => Promise[Boolean]): Self = this.set("isMonitoringAvailableForClass", js.Any.fromFunction1(value))
    @scala.inline
    def setIsRangingAvailable(value: () => Promise[Boolean]): Self = this.set("isRangingAvailable", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDomDelegateReady(value: () => Promise[Unit]): Self = this.set("onDomDelegateReady", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestAlwaysAuthorization(value: () => Promise[Unit]): Self = this.set("requestAlwaysAuthorization", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestStateForRegion(value: Region => Promise[Unit]): Self = this.set("requestStateForRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestWhenInUseAuthorization(value: () => Promise[Unit]): Self = this.set("requestWhenInUseAuthorization", js.Any.fromFunction0(value))
    @scala.inline
    def setStartAdvertising(value: (Region, Boolean) => Promise[Unit]): Self = this.set("startAdvertising", js.Any.fromFunction2(value))
    @scala.inline
    def setStartMonitoringForRegion(value: Region => Promise[Unit]): Self = this.set("startMonitoringForRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setStartRangingBeaconsInRegion(value: Region => Promise[Unit]): Self = this.set("startRangingBeaconsInRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setStopAdvertising(value: () => Promise[Unit]): Self = this.set("stopAdvertising", js.Any.fromFunction0(value))
    @scala.inline
    def setStopMonitoringForRegion(value: Region => Promise[Unit]): Self = this.set("stopMonitoringForRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setStopRangingBeaconsInRegion(value: Region => Promise[Unit]): Self = this.set("stopRangingBeaconsInRegion", js.Any.fromFunction1(value))
  }
  
}

