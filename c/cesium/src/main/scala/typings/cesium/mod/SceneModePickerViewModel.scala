package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SceneModePickerViewModel")
@js.native
open class SceneModePickerViewModel protected () extends StObject {
  def this(scene: Scene) = this()
  def this(scene: Scene, duration: Double) = this()
  
  /**
    * Destroys the view model.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets or sets whether the button drop-down is currently visible.  This property is observable.
    */
  var dropDownVisible: Boolean = js.native
  
  /**
    * Gets or sets the the duration of scene mode transition animations in seconds.
    * A value of zero causes the scene to instantly change modes.
    */
  var duration: Double = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the command to morph to 2D.
    */
  var morphTo2D: Command = js.native
  
  /**
    * Gets the command to morph to 3D.
    */
  var morphTo3D: Command = js.native
  
  /**
    * Gets the command to morph to Columbus View.
    */
  var morphToColumbusView: Command = js.native
  
  /**
    * Gets the scene
    */
  var scene: Scene = js.native
  
  /**
    * Gets or sets the current SceneMode.  This property is observable.
    */
  var sceneMode: SceneMode = js.native
  
  /**
    * Gets the currently active tooltip.  This property is observable.
    */
  var selectedTooltip: String = js.native
  
  /**
    * Gets the command to toggle the drop down box.
    */
  var toggleDropDown: Command = js.native
  
  /**
    * Gets or sets the 2D tooltip.  This property is observable.
    */
  var tooltip2D: String = js.native
  
  /**
    * Gets or sets the 3D tooltip.  This property is observable.
    */
  var tooltip3D: String = js.native
  
  /**
    * Gets or sets the Columbus View tooltip.  This property is observable.
    */
  var tooltipColumbusView: String = js.native
}
