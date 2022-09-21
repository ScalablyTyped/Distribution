package typings.cesium.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Timeline")
@js.native
open class Timeline protected () extends StObject {
  def this(container: Element, clock: Clock) = this()
  
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
    * Resizes the widget to match the container size.
    */
  def resize(): Unit = js.native
  
  /**
    * Sets the view to the provided times.
    * @param startTime - The start time.
    * @param stopTime - The stop time.
    */
  def zoomTo(startTime: JulianDate, stopTime: JulianDate): Unit = js.native
}
