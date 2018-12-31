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

