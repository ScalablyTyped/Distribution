package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsystem extends js.Object {
  ////////////////////
  // System CPU
  ////////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: "system.cpu"
    * @since Chrome 32.
    */
  val cpu: Typeofcpu
  ////////////////////
  // System Display //
  ////////////////////
  /**
    * Use the system.display API to query display metadata.
    * Permissions: 'system.display'
    * @since Chrome 30.
    */
  val display: Typeofdisplay
  ////////////////////
  // System Memory
  ////////////////////
  /**
    * The chrome.system.memory API.
    * Permissions:  "system.memory"
    * @since Chrome 32.
    */
  val memory: Typeofmemory
  ////////////////////
  // System Storage
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * Permissions:  "system.storage"
    * @since Chrome 30.
    */
  val storage: TypeofstorageCallback
}

object Typeofsystem {
  @scala.inline
  def apply(cpu: Typeofcpu, display: Typeofdisplay, memory: Typeofmemory, storage: TypeofstorageCallback): Typeofsystem = {
    val __obj = js.Dynamic.literal(cpu = cpu, display = display, memory = memory, storage = storage)
  
    __obj.asInstanceOf[Typeofsystem]
  }
}

