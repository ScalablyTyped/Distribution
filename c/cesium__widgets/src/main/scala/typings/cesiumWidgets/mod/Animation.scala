package typings.cesiumWidgets.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "Animation")
@js.native
open class Animation protected () extends StObject {
  def this(container: String, viewModel: AnimationViewModel) = this()
  def this(container: Element, viewModel: AnimationViewModel) = this()
  
  /**
    * Updates the widget to reflect any modified CSS rules for theming.
    * @example
    * //Switch to the cesium-lighter theme.
    * document.body.className = 'cesium-lighter';
    * animation.applyThemeChanges();
    */
  def applyThemeChanges(): Unit = js.native
  
  /**
    * Gets the parent container.
    */
  val container: Element = js.native
  
  /**
    * Destroys the animation widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Resizes the widget to match the container size.
    * This function should be called whenever the container size is changed.
    */
  def resize(): Unit = js.native
  
  /**
    * Gets the view model.
    */
  val viewModel: AnimationViewModel = js.native
}
