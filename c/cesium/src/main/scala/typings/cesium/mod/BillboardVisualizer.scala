package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BillboardVisualizer")
@js.native
open class BillboardVisualizer protected () extends StObject {
  def this(entityCluster: EntityCluster, entityCollection: EntityCollection) = this()
  
  /**
    * Removes and destroys all primitives created by this instance.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Updates the primitives created by this visualizer to match their
    * Entity counterpart at the given time.
    * @param time - The time to update to.
    * @returns This function always returns true.
    */
  def update(time: JulianDate): Boolean = js.native
}
