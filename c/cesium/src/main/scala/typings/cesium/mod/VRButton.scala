package typings.cesium.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "VRButton")
@js.native
open class VRButton protected () extends StObject {
  def this(container: String, scene: Scene) = this()
  def this(container: Element, scene: Scene) = this()
  def this(container: String, scene: Scene, vrElement: String) = this()
  def this(container: String, scene: Scene, vrElement: Element) = this()
  def this(container: Element, scene: Scene, vrElement: String) = this()
  def this(container: Element, scene: Scene, vrElement: Element) = this()
  
  /**
    * Gets the parent container.
    */
  var container: Element = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the view model.
    */
  var viewModel: VRButtonViewModel = js.native
}
