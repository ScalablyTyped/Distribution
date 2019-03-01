package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cpu extends js.Object {
  ////////////////////
  // System CPU
  ////////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: "system.cpu"
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
  ////////////////////
  // System Memory
  ////////////////////
  /**
    * The chrome.system.memory API.
    * Permissions:  "system.memory"
    * @since Chrome 32.
    */
  val memoryNs: Anon_CallbackGetInfoInfo
  ////////////////////
  // System Storage
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * Permissions:  "system.storage"
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
    storageNs: Anon_CallbackEjectDevice
  ): Anon_Cpu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cpuNs")(cpuNs)
    __obj.updateDynamic("displayNs")(displayNs)
    __obj.updateDynamic("memoryNs")(memoryNs)
    __obj.updateDynamic("storageNs")(storageNs)
    __obj.asInstanceOf[Anon_Cpu]
  }
}

