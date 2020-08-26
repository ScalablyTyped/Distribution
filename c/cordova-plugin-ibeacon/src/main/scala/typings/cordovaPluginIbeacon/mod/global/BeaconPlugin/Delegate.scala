package typings.cordovaPluginIbeacon.mod.global.BeaconPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delegate extends js.Object {
  def didChangeAuthorizationStatus(authorizationStatus: String): Unit = js.native
  def didDetermineStateForRegion(pluginResult: PluginResult): Unit = js.native
  def didEnterRegion(pluginResult: PluginResult): Unit = js.native
  def didExitRegion(pluginResult: PluginResult): Unit = js.native
  def didRangeBeaconsInRegion(pluginResult: PluginResult): Unit = js.native
  def didStartMonitoringForRegion(pluginResult: PluginResult): Unit = js.native
  def monitoringDidFailForRegionWithError(pluginResult: PluginResult): Unit = js.native
  def peripheralManagerDidStartAdvertising(pluginResult: PluginResult): Unit = js.native
  def peripheralManagerDidUpdateState(pluginResult: PluginResult): Unit = js.native
}

object Delegate {
  @scala.inline
  def apply(
    didChangeAuthorizationStatus: String => Unit,
    didDetermineStateForRegion: PluginResult => Unit,
    didEnterRegion: PluginResult => Unit,
    didExitRegion: PluginResult => Unit,
    didRangeBeaconsInRegion: PluginResult => Unit,
    didStartMonitoringForRegion: PluginResult => Unit,
    monitoringDidFailForRegionWithError: PluginResult => Unit,
    peripheralManagerDidStartAdvertising: PluginResult => Unit,
    peripheralManagerDidUpdateState: PluginResult => Unit
  ): Delegate = {
    val __obj = js.Dynamic.literal(didChangeAuthorizationStatus = js.Any.fromFunction1(didChangeAuthorizationStatus), didDetermineStateForRegion = js.Any.fromFunction1(didDetermineStateForRegion), didEnterRegion = js.Any.fromFunction1(didEnterRegion), didExitRegion = js.Any.fromFunction1(didExitRegion), didRangeBeaconsInRegion = js.Any.fromFunction1(didRangeBeaconsInRegion), didStartMonitoringForRegion = js.Any.fromFunction1(didStartMonitoringForRegion), monitoringDidFailForRegionWithError = js.Any.fromFunction1(monitoringDidFailForRegionWithError), peripheralManagerDidStartAdvertising = js.Any.fromFunction1(peripheralManagerDidStartAdvertising), peripheralManagerDidUpdateState = js.Any.fromFunction1(peripheralManagerDidUpdateState))
    __obj.asInstanceOf[Delegate]
  }
  @scala.inline
  implicit class DelegateOps[Self <: Delegate] (val x: Self) extends AnyVal {
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
    def setDidChangeAuthorizationStatus(value: String => Unit): Self = this.set("didChangeAuthorizationStatus", js.Any.fromFunction1(value))
    @scala.inline
    def setDidDetermineStateForRegion(value: PluginResult => Unit): Self = this.set("didDetermineStateForRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setDidEnterRegion(value: PluginResult => Unit): Self = this.set("didEnterRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setDidExitRegion(value: PluginResult => Unit): Self = this.set("didExitRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setDidRangeBeaconsInRegion(value: PluginResult => Unit): Self = this.set("didRangeBeaconsInRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setDidStartMonitoringForRegion(value: PluginResult => Unit): Self = this.set("didStartMonitoringForRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setMonitoringDidFailForRegionWithError(value: PluginResult => Unit): Self = this.set("monitoringDidFailForRegionWithError", js.Any.fromFunction1(value))
    @scala.inline
    def setPeripheralManagerDidStartAdvertising(value: PluginResult => Unit): Self = this.set("peripheralManagerDidStartAdvertising", js.Any.fromFunction1(value))
    @scala.inline
    def setPeripheralManagerDidUpdateState(value: PluginResult => Unit): Self = this.set("peripheralManagerDidUpdateState", js.Any.fromFunction1(value))
  }
  
}

