package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GeometryVisualizer")
@js.native
open class GeometryVisualizer protected () extends StObject {
  def this(scene: Scene, entityCollection: EntityCollection) = this()
  def this(scene: Scene, entityCollection: EntityCollection, primitives: PrimitiveCollection) = this()
  def this(
    scene: Scene,
    entityCollection: EntityCollection,
    primitives: Unit,
    groundPrimitives: PrimitiveCollection
  ) = this()
  def this(
    scene: Scene,
    entityCollection: EntityCollection,
    primitives: PrimitiveCollection,
    groundPrimitives: PrimitiveCollection
  ) = this()
  
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
    * Updates all of the primitives created by this visualizer to match their
    * Entity counterpart at the given time.
    * @param time - The time to update to.
    * @returns True if the visualizer successfully updated to the provided time,
    * false if the visualizer is waiting for asynchronous primitives to be created.
    */
  def update(time: JulianDate): Boolean = js.native
}
