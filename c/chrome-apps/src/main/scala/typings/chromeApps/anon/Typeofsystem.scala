package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsystem extends StObject {
  
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
  val cpu: Typeofcpu = js.native
  
  ////////////////////
  // System Display //
  ////////////////////
  /**
    * Use the system.display API to query display metadata.
    * Permissions: 'system.display'
    * @since Chrome 30.
    */
  val display: Typeofdisplay = js.native
  
  ///////////////////
  // System Memory //
  ///////////////////
  /**
    * The chrome.system.memory API.
    * @requires Permissions: 'system.memory'
    * @since Chrome 32.
    */
  val memory: Typeofmemory = js.native
  
  //////////////////////
  // System - Network //
  //////////////////////
  /**
    * The chrome.system.network API.
    * @requires Permissions: 'system.network'
    */
  val network: Typeofnetwork = js.native
  
  /////////////////////////
  // System Power Source //
  /////////////////////////
  /**
    * @requires(CrOS Kiosk) Chrome OS kiosk app.
    * @requires Permissions: 'system.powerSource'
    * @description The chrome.system.powerSource API allows Chrome Kiosk Apps to query the state of connected power sources.
    * @since Latest
    */
  val powerSource: TypeofpowerSource = js.native
  
  ////////////////////
  // System Storage //
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * @requires Permissions: 'system.storage'
    * @since Chrome 30.
    */
  val storage: TypeofstorageEjectDevice = js.native
}
object Typeofsystem {
  
  @scala.inline
  def apply(
    cpu: Typeofcpu,
    display: Typeofdisplay,
    memory: Typeofmemory,
    network: Typeofnetwork,
    powerSource: TypeofpowerSource,
    storage: TypeofstorageEjectDevice
  ): Typeofsystem = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], powerSource = powerSource.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsystem]
  }
  
  @scala.inline
  implicit class TypeofsystemMutableBuilder[Self <: Typeofsystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpu(value: Typeofcpu): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: Typeofdisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: Typeofmemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: Typeofnetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerSource(value: TypeofpowerSource): Self = StObject.set(x, "powerSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: TypeofstorageEjectDevice): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
