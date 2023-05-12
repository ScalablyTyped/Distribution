package typings.cesiumWidgets.mod

import typings.cesiumWidgets.anon.Globe
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "BaseLayerPicker")
@js.native
open class BaseLayerPicker protected () extends StObject {
  def this(container: String, options: Globe) = this()
  def this(container: Element, options: Globe) = this()
  
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
  var viewModel: BaseLayerPickerViewModel = js.native
}
