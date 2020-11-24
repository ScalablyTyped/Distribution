package typings.bandagedbdBdapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bandagedbd/bdapi", "AddonAPI")
@js.native
class AddonAPI () extends js.Object {
  
  /**
    * Disables the given addon.
    * @param name The name/identifier of the addon.
    */
  def disable(name: String): Unit = js.native
  
  /**
    * Enables the given addon
    * @param name The name/identifier of the addon.
    */
  def enable(name: String): Unit = js.native
  
  /**
    * String representing the resolved location of the user's addon folder.
    */
  val folder: String = js.native
  
  /**
    * Gets the "instance" of the given addon.
    * @param name The name/identifier of the addon.
    * @returns For plugins, this is the plugin instance, for themes this is the meta + css.
    */
  def get(name: String): js.Object = js.native
  
  /**
    * Gets all the "instances" of addon type.
    * @returns An array matching the output of get.
    */
  def getAll(): Unit = js.native
  
  /**
    * Checks if the given addon is currently enabled.
    * @param name The name/identifier of the addon.
    * @returns Indicates if the addon is enabled.
    */
  def isEnabled(name: String): Boolean = js.native
  
  /**
    * Toggle the enablement the given addon.
    * @param name The name/identifier of the addon.
    */
  def toggle(name: String): Unit = js.native
}
