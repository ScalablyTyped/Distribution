package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cpu extends js.Object {
  // #endregion
  // #region chrome.system.*
  ////////////////
  // System CPU //
  ////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: 'system.cpu'
    * @since Chrome 32.
    */
  val cpuNs: Anon_CallbackGetInfo
  ////////////////////
  // System Display //
  ////////////////////
  /**
    * Use the system.display API to query display metadata.
    * Permissions: 'system.display'
    * @since Chrome 30.
    */
  val displayNs: Anon_Bounds
  ///////////////////
  // System Memory //
  ///////////////////
  /**
    * The chrome.system.memory API.
    * @requires Permissions: 'system.memory'
    * @since Chrome 32.
    */
  val memoryNs: Anon_CallbackGetInfoInfo
  //////////////////////
  // System - Network //
  //////////////////////
  /**
    * The chrome.system.network API.
    * @requires Permissions: 'system.network'
    */
  val networkNs: Anon_CallbackGetNetworkInterfaces
  /////////////////////////
  // System Power Source //
  /////////////////////////
  /**
    * @requires(CrOS Kiosk) Chrome OS kiosk app.
    * @requires Permissions: 'system.powerSource'
    * @description The chrome.system.powerSource API allows Chrome Kiosk Apps to query the state of connected power sources.
    * @since Latest
    */
  val powerSourceNs: Anon_CallbackGetPowerSourceInfo
  ////////////////////
  // System Storage //
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * @requires Permissions: 'system.storage'
    * @since Chrome 30.
    */
  val storageNs: Anon_CallbackEjectDevice
}

object Anon_Cpu {
  @scala.inline
  def apply(
    cpuNs: Anon_CallbackGetInfo,
    displayNs: Anon_Bounds,
    memoryNs: Anon_CallbackGetInfoInfo,
    networkNs: Anon_CallbackGetNetworkInterfaces,
    powerSourceNs: Anon_CallbackGetPowerSourceInfo,
    storageNs: Anon_CallbackEjectDevice
  ): Anon_Cpu = {
    val __obj = js.Dynamic.literal(cpuNs = cpuNs, displayNs = displayNs, memoryNs = memoryNs, networkNs = networkNs, powerSourceNs = powerSourceNs, storageNs = storageNs)
  
    __obj.asInstanceOf[Anon_Cpu]
  }
}

