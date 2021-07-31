package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ProjectionPickerViewModel")
@js.native
class ProjectionPickerViewModel protected () extends StObject {
  def this(scene: Scene) = this()
  
  def destroy(): Unit = js.native
  
  var dropDownVisible: Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var isOrthographicProjection: Command = js.native
  
  var scene: Scene = js.native
  
  var sceneMode: SceneMode = js.native
  
  var selectedTooltip: String = js.native
  
  var switchToOrthographic: Command = js.native
  
  var switchToPerspective: Command = js.native
  
  var toggleDropdown: Command = js.native
  
  var tooltipOrthographic: String = js.native
  
  var tooltipPerspective: String = js.native
}
