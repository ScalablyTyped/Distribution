package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "I3SGeometry")
@js.native
open class I3SGeometry () extends StObject {
  
  /**
    * Gets the custom attributes of the geometry.
    */
  val customAttributes: Any = js.native
  
  /**
    * Gets the I3S data for this object.
    */
  val data: Any = js.native
  
  /**
    * Find a triangle touching the point [px, py, pz], then return the vertex closest to the search point
    * @param px - The x component of the point to query
    * @param py - The y component of the point to query
    * @param pz - The z component of the point to query
    * @returns A structure containing the index of the closest point,
    * the squared distance from the queried point to the point that is found,
    * the distance from the queried point to the point that is found,
    * the queried position in local space,
    * the closest position in local space
    */
  def getClosestPointIndexOnTriangle(px: Double, py: Double, pz: Double): Any = js.native
  
  /**
    * Gets the resource for the geometry
    */
  val resource: Resource = js.native
}
