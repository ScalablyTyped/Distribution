package typings
package cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  def didChangeAuthorizationStatus(authorizationStatus: java.lang.String): scala.Unit
  def didDetermineStateForRegion(pluginResult: PluginResult): scala.Unit
  def didEnterRegion(pluginResult: PluginResult): scala.Unit
  def didExitRegion(pluginResult: PluginResult): scala.Unit
  def didRangeBeaconsInRegion(pluginResult: PluginResult): scala.Unit
  def didStartMonitoringForRegion(pluginResult: PluginResult): scala.Unit
  def monitoringDidFailForRegionWithError(pluginResult: PluginResult): scala.Unit
  def peripheralManagerDidStartAdvertising(pluginResult: PluginResult): scala.Unit
  def peripheralManagerDidUpdateState(pluginResult: PluginResult): scala.Unit
}

object Delegate {
  @scala.inline
  def apply(
    didChangeAuthorizationStatus: java.lang.String => scala.Unit,
    didDetermineStateForRegion: PluginResult => scala.Unit,
    didEnterRegion: PluginResult => scala.Unit,
    didExitRegion: PluginResult => scala.Unit,
    didRangeBeaconsInRegion: PluginResult => scala.Unit,
    didStartMonitoringForRegion: PluginResult => scala.Unit,
    monitoringDidFailForRegionWithError: PluginResult => scala.Unit,
    peripheralManagerDidStartAdvertising: PluginResult => scala.Unit,
    peripheralManagerDidUpdateState: PluginResult => scala.Unit
  ): Delegate = {
    val __obj = js.Dynamic.literal(didChangeAuthorizationStatus = js.Any.fromFunction1(didChangeAuthorizationStatus), didDetermineStateForRegion = js.Any.fromFunction1(didDetermineStateForRegion), didEnterRegion = js.Any.fromFunction1(didEnterRegion), didExitRegion = js.Any.fromFunction1(didExitRegion), didRangeBeaconsInRegion = js.Any.fromFunction1(didRangeBeaconsInRegion), didStartMonitoringForRegion = js.Any.fromFunction1(didStartMonitoringForRegion), monitoringDidFailForRegionWithError = js.Any.fromFunction1(monitoringDidFailForRegionWithError), peripheralManagerDidStartAdvertising = js.Any.fromFunction1(peripheralManagerDidStartAdvertising), peripheralManagerDidUpdateState = js.Any.fromFunction1(peripheralManagerDidUpdateState))
  
    __obj.asInstanceOf[Delegate]
  }
}

