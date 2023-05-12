package typings.cesiumWidgets.mod

import typings.cesiumEngine.mod.Scene
import typings.cesiumEngine.mod.SceneMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "ProjectionPickerViewModel")
@js.native
open class ProjectionPickerViewModel protected () extends StObject {
  def this(scene: Scene) = this()
  
  /**
    * Destroys the view model.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets or sets whether the button drop-down is currently visible.  This property is observable.
    */
  var dropDownVisible: Boolean = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets whether the scene is currently using an orthographic projection.
    */
  var isOrthographicProjection: Command = js.native
  
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
    * Gets the command to switch to orthographic projection.
    */
  var switchToOrthographic: Command = js.native
  
  /**
    * Gets the command to switch to a perspective projection.
    */
  var switchToPerspective: Command = js.native
  
  /**
    * Gets the command to toggle the drop down box.
    */
  var toggleDropDown: Command = js.native
  
  /**
    * Gets or sets the orthographic projection tooltip.  This property is observable.
    */
  var tooltipOrthographic: String = js.native
  
  /**
    * Gets or sets the perspective projection tooltip.  This property is observable.
    */
  var tooltipPerspective: String = js.native
}
