package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SceneModePickerViewModel")
@js.native
class SceneModePickerViewModel protected () extends StObject {
  def this(scene: Scene) = this()
  def this(scene: Scene, duration: Double) = this()
  
  def destroy(): Unit = js.native
  
  var dropDownVisible: Boolean = js.native
  
  var duration: Double = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var morphTo2D: Command = js.native
  
  var morphTo3D: Command = js.native
  
  var morphToColumbusView: Command = js.native
  
  var scene: Scene = js.native
  
  var sceneMode: SceneMode = js.native
  
  var selectedTooltip: String = js.native
  
  var toggleDropDown: Command = js.native
  
  var tooltip2D: String = js.native
  
  var tooltip3D: String = js.native
  
  var tooltipColumbusView: String = js.native
}
