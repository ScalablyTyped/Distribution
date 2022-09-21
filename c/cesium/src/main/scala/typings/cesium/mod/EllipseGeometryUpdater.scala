package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipseGeometryUpdater")
@js.native
open class EllipseGeometryUpdater protected () extends StObject {
  def this(entity: Entity, scene: Scene) = this()
  
  /**
    * Creates the geometry instance which represents the fill of the geometry.
    * @param time - The time to use when retrieving initial attribute values.
    * @returns The geometry instance representing the filled portion of the geometry.
    */
  def createFillGeometryInstance(time: JulianDate): GeometryInstance = js.native
  
  /**
    * Creates the geometry instance which represents the outline of the geometry.
    * @param time - The time to use when retrieving initial attribute values.
    * @returns The geometry instance representing the outline portion of the geometry.
    */
  def createOutlineGeometryInstance(time: JulianDate): GeometryInstance = js.native
  
  /**
    * Gets a value indicating if the geometry should be drawn on terrain.
    */
  val onTerrain: Boolean = js.native
}
