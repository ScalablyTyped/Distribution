package typings.cesium.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "VRButtonViewModel")
@js.native
open class VRButtonViewModel protected () extends StObject {
  def this(scene: Scene) = this()
  def this(scene: Scene, vrElement: String) = this()
  def this(scene: Scene, vrElement: Element) = this()
  
  /**
    * Gets the Command to toggle VR mode.
    */
  var command: Command = js.native
  
  /**
    * Destroys the view model.  Should be called to
    * properly clean up the view model when it is no longer needed.
    */
  def destroy(): Unit = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets or sets whether or not VR functionality should be enabled.
    */
  var isVREnabled: Boolean = js.native
  
  /**
    * Gets whether or not VR mode is active.
    */
  var isVRMode: Boolean = js.native
  
  /**
    * Gets the tooltip.  This property is observable.
    */
  var tooltip: String = js.native
  
  /**
    * Gets or sets the HTML element to place into VR mode when the
    * corresponding button is pressed.
    */
  var vrElement: Element = js.native
}
