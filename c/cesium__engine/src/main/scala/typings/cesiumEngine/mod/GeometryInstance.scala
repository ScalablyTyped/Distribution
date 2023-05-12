package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GeometryInstance")
@js.native
open class GeometryInstance protected () extends StObject {
  def this(options: typings.cesiumEngine.anon.Geometry) = this()
  
  /**
    * Per-instance attributes like {@link ColorGeometryInstanceAttribute} or {@link ShowGeometryInstanceAttribute}.
    * {@link Geometry} attributes varying per vertex; these attributes are constant for the entire instance.
    */
  var attributes: Any = js.native
  
  /**
    * The geometry being instanced.
    */
  var geometry: Geometry = js.native
  
  /**
    * User-defined object returned when the instance is picked or used to get/set per-instance attributes.
    */
  var id: Any = js.native
  
  /**
    * The 4x4 transformation matrix that transforms the geometry from model to world coordinates.
    * When this is the identity matrix, the geometry is drawn in world coordinates, i.e., Earth's WGS84 coordinates.
    * Local reference frames can be used by providing a different transformation matrix, like that returned
    * by {@link Transforms.eastNorthUpToFixedFrame}.
    */
  var modelMatrix: Matrix4 = js.native
}
