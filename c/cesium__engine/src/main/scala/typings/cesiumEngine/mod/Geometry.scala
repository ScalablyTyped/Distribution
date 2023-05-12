package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Geometry")
@js.native
open class Geometry protected () extends StObject {
  def this(options: Attributes) = this()
  
  /**
    * Attributes, which make up the geometry's vertices.  Each property in this object corresponds to a
    * {@link GeometryAttribute} containing the attribute's data.
    * <p>
    * Attributes are always stored non-interleaved in a Geometry.
    * </p>
    * <p>
    * There are reserved attribute names with well-known semantics.  The following attributes
    * are created by a Geometry (depending on the provided {@link VertexFormat}.
    * <ul>
    *    <li><code>position</code> - 3D vertex position.  64-bit floating-point (for precision).  3 components per attribute.  See {@link VertexFormat#position}.</li>
    *    <li><code>normal</code> - Normal (normalized), commonly used for lighting.  32-bit floating-point.  3 components per attribute.  See {@link VertexFormat#normal}.</li>
    *    <li><code>st</code> - 2D texture coordinate.  32-bit floating-point.  2 components per attribute.  See {@link VertexFormat#st}.</li>
    *    <li><code>bitangent</code> - Bitangent (normalized), used for tangent-space effects like bump mapping.  32-bit floating-point.  3 components per attribute.  See {@link VertexFormat#bitangent}.</li>
    *    <li><code>tangent</code> - Tangent (normalized), used for tangent-space effects like bump mapping.  32-bit floating-point.  3 components per attribute.  See {@link VertexFormat#tangent}.</li>
    * </ul>
    * </p>
    * <p>
    * The following attribute names are generally not created by a Geometry, but are added
    * to a Geometry by a {@link Primitive} or {@link GeometryPipeline} functions to prepare
    * the geometry for rendering.
    * <ul>
    *    <li><code>position3DHigh</code> - High 32 bits for encoded 64-bit position computed with {@link GeometryPipeline.encodeAttribute}.  32-bit floating-point.  4 components per attribute.</li>
    *    <li><code>position3DLow</code> - Low 32 bits for encoded 64-bit position computed with {@link GeometryPipeline.encodeAttribute}.  32-bit floating-point.  4 components per attribute.</li>
    *    <li><code>position3DHigh</code> - High 32 bits for encoded 64-bit 2D (Columbus view) position computed with {@link GeometryPipeline.encodeAttribute}.  32-bit floating-point.  4 components per attribute.</li>
    *    <li><code>position2DLow</code> - Low 32 bits for encoded 64-bit 2D (Columbus view) position computed with {@link GeometryPipeline.encodeAttribute}.  32-bit floating-point.  4 components per attribute.</li>
    *    <li><code>color</code> - RGBA color (normalized) usually from {@link GeometryInstance#color}.  32-bit floating-point.  4 components per attribute.</li>
    *    <li><code>pickColor</code> - RGBA color used for picking.  32-bit floating-point.  4 components per attribute.</li>
    * </ul>
    * </p>
    * @example
    * geometry.attributes.position = new Cesium.GeometryAttribute({
    *   componentDatatype : Cesium.ComponentDatatype.FLOAT,
    *   componentsPerAttribute : 3,
    *   values : new Float32Array(0)
    * });
    */
  var attributes: GeometryAttributes = js.native
  
  /**
    * An optional bounding sphere that fully encloses the geometry.  This is
    * commonly used for culling.
    */
  var boundingSphere: BoundingSphere = js.native
  
  /**
    * Optional index data that - along with {@link Geometry#primitiveType} -
    * determines the primitives in the geometry.
    */
  var indices: js.Array[Any] = js.native
  
  /**
    * The type of primitives in the geometry.  This is most often {@link PrimitiveType.TRIANGLES},
    * but can varying based on the specific geometry.
    */
  var primitiveType: PrimitiveType = js.native
}
/* static members */
object Geometry {
  
  @JSImport("@cesium/engine", "Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes the number of vertices in a geometry.  The runtime is linear with
    * respect to the number of attributes in a vertex, not the number of vertices.
    * @example
    * const numVertices = Cesium.Geometry.computeNumberOfVertices(geometry);
    * @param geometry - The geometry.
    * @returns The number of vertices in the geometry.
    */
  inline def computeNumberOfVertices(geometry: Geometry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNumberOfVertices")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
}
