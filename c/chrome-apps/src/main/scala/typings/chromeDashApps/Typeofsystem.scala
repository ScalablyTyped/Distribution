package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsystem extends js.Object {
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
  val cpuNs: Typeofcpu
  ////////////////////
  // System Display //
  ////////////////////
  /**
    * Use the system.display API to query display metadata.
    * Permissions: 'system.display'
    * @since Chrome 30.
    */
  val displayNs: Typeofdisplay
  ///////////////////
  // System Memory //
  ///////////////////
  /**
    * The chrome.system.memory API.
    * @requires Permissions: 'system.memory'
    * @since Chrome 32.
    */
  val memoryNs: Typeofmemory
  //////////////////////
  // System - Network //
  //////////////////////
  /**
    * The chrome.system.network API.
    * @requires Permissions: 'system.network'
    */
  val networkNs: Typeofnetwork
  /////////////////////////
  // System Power Source //
  /////////////////////////
  /**
    * @requires(CrOS Kiosk) Chrome OS kiosk app.
    * @requires Permissions: 'system.powerSource'
    * @description The chrome.system.powerSource API allows Chrome Kiosk Apps to query the state of connected power sources.
    * @since Latest
    */
  val powerSourceNs: TypeofpowerSource
  ////////////////////
  // System Storage //
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * @requires Permissions: 'system.storage'
    * @since Chrome 30.
    */
  val storageNs: TypeofstorageCallback
}

object Typeofsystem {
  @scala.inline
  def apply(
    cpuNs: Typeofcpu,
    displayNs: Typeofdisplay,
    memoryNs: Typeofmemory,
    networkNs: Typeofnetwork,
    powerSourceNs: TypeofpowerSource,
    storageNs: TypeofstorageCallback
  ): Typeofsystem = {
    val __obj = js.Dynamic.literal(cpuNs = cpuNs, displayNs = displayNs, memoryNs = memoryNs, networkNs = networkNs, powerSourceNs = powerSourceNs, storageNs = storageNs)
  
    __obj.asInstanceOf[Typeofsystem]
  }
}

