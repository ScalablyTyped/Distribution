package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsystem extends StObject {
  
  ////////////////////
  // System CPU
  ////////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: "system.cpu"
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
  
  ////////////////////
  // System Memory
  ////////////////////
  /**
    * The chrome.system.memory API.
    * Permissions:  "system.memory"
    * @since Chrome 32.
    */
  val memory: Typeofmemory = js.native
  
  ////////////////////
  // System Storage
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * Permissions:  "system.storage"
    * @since Chrome 30.
    */
  val storage: TypeofstorageEjectDevice = js.native
}
object Typeofsystem {
  
  @scala.inline
  def apply(cpu: Typeofcpu, display: Typeofdisplay, memory: Typeofmemory, storage: TypeofstorageEjectDevice): Typeofsystem = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
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
    def setStorage(value: TypeofstorageEjectDevice): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
