package typings.cordovaPluginIbeacon.mod._Global_.BeaconPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  def didChangeAuthorizationStatus(authorizationStatus: String): Unit
  def didDetermineStateForRegion(pluginResult: PluginResult): Unit
  def didEnterRegion(pluginResult: PluginResult): Unit
  def didExitRegion(pluginResult: PluginResult): Unit
  def didRangeBeaconsInRegion(pluginResult: PluginResult): Unit
  def didStartMonitoringForRegion(pluginResult: PluginResult): Unit
  def monitoringDidFailForRegionWithError(pluginResult: PluginResult): Unit
  def peripheralManagerDidStartAdvertising(pluginResult: PluginResult): Unit
  def peripheralManagerDidUpdateState(pluginResult: PluginResult): Unit
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
}

