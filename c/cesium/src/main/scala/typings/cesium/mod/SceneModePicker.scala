package typings.cesium.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SceneModePicker")
@js.native
class SceneModePicker protected () extends StObject {
  def this(container: String, scene: Scene) = this()
  def this(container: Element, scene: Scene) = this()
  def this(container: String, scene: Scene, duration: Double) = this()
  def this(container: Element, scene: Scene, duration: Double) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: SceneModePickerViewModel = js.native
}
