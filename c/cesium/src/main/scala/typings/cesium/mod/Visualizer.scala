package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Visualizer")
@js.native
open class Visualizer () extends StObject {
  
  /**
    * Removes all visualization and cleans up any resources associated with this instance.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Updates the visualization to the provided time.
    * @param time - The time.
    * @returns True if the display was updated to the provided time,
    * false if the visualizer is waiting for an asynchronous operation to
    * complete before data can be updated.
    */
  def update(time: JulianDate): Boolean = js.native
}
