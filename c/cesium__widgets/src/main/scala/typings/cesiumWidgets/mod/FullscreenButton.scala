package typings.cesiumWidgets.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "FullscreenButton")
@js.native
open class FullscreenButton protected () extends StObject {
  def this(container: String) = this()
  def this(container: Element) = this()
  def this(container: String, fullscreenElement: String) = this()
  def this(container: String, fullscreenElement: Element) = this()
  def this(container: Element, fullscreenElement: String) = this()
  def this(container: Element, fullscreenElement: Element) = this()
  
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
  var viewModel: FullscreenButtonViewModel = js.native
}
