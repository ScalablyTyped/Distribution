package typings.cesiumWidgets.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "FullscreenButtonViewModel")
@js.native
open class FullscreenButtonViewModel () extends StObject {
  def this(fullscreenElement: String) = this()
  def this(fullscreenElement: Element) = this()
  def this(fullscreenElement: String, container: String) = this()
  def this(fullscreenElement: String, container: Element) = this()
  def this(fullscreenElement: Unit, container: String) = this()
  def this(fullscreenElement: Unit, container: Element) = this()
  def this(fullscreenElement: Element, container: String) = this()
  def this(fullscreenElement: Element, container: Element) = this()
  
  /**
    * Gets the Command to toggle fullscreen mode.
    */
  var command: Command = js.native
  
  /**
    * Destroys the view model.  Should be called to
    * properly clean up the view model when it is no longer needed.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets or sets the HTML element to place into fullscreen mode when the
    * corresponding button is pressed.
    */
  var fullscreenElement: Element = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets whether or not fullscreen mode is active.  This property is observable.
    */
  var isFullscreen: Boolean = js.native
  
  /**
    * Gets or sets whether or not fullscreen functionality should be enabled.  This property is observable.
    */
  var isFullscreenEnabled: Boolean = js.native
  
  /**
    * Gets the tooltip.  This property is observable.
    */
  var tooltip: String = js.native
}
