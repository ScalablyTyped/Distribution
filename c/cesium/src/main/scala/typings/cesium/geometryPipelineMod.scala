package typings.cesium

import typings.cesium.mod.Geometry
import typings.cesium.mod.GeometryInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryPipelineMod {
  
  object default {
    
    @JSImport("cesium/Source/Core/GeometryPipeline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compresses and packs geometry normal attribute values to save memory.
      * @example
      * geometry = Cesium.GeometryPipeline.compressVertices(geometry);
      * @param geometry - The geometry to modify.
      * @returns The modified <code>geometry</code> argument, with its normals compressed and packed.
      */
    inline def compressVertices(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("compressVertices")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
    
    /**
      * Computes per-vertex normals for a geometry containing <code>TRIANGLES</code> by averaging the normals of
      * all triangles incident to the vertex.  The result is a new <code>normal</code> attribute added to the geometry.
      * This assumes a counter-clockwise winding order.
      * @example
      * Cesium.GeometryPipeline.computeNormal(geometry);
      * @param geometry - The geometry to modify.
      * @returns The modified <code>geometry</code> argument with the computed <code>normal</code> attribute.
      */
    inline def computeNormal(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNormal")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
    
    /**
      * Computes per-vertex tangents and bitangents for a geometry containing <code>TRIANGLES</code>.
      * The result is new <code>tangent</code> and <code>bitangent</code> attributes added to the geometry.
      * This assumes a counter-clockwise winding order.
      * <p>
      * Based on <a href="http://www.terathon.com/code/tangent.html">Computing Tangent Space Basis Vectors
      * for an Arbitrary Mesh</a> by Eric Lengyel.
      * </p>
      * @example
      * Cesium.GeometryPipeline.computeTangentAndBiTangent(geometry);
      * @param geometry - The geometry to modify.
      * @returns The modified <code>geometry</code> argument with the computed <code>tangent</code> and <code>bitangent</code> attributes.
      */
    inline def computeTangentAndBitangent(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTangentAndBitangent")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
    
    /**
      * Creates an object that maps attribute names to unique locations (indices)
      * for matching vertex attributes and shader programs.
      * @example
      * const attributeLocations = Cesium.GeometryPipeline.createAttributeLocations(geometry);
      * // Example output
      * // {
      * //   'position' : 0,
      * //   'normal' : 1
      * // }
      * @param geometry - The geometry, which is not modified, to create the object for.
      * @returns An object with attribute name / index pairs.
      */
    inline def createAttributeLocations(geometry: Geometry): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAttributeLocations")(geometry.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Creates a new {@link Geometry} with <code>LINES</code> representing the provided
      * attribute (<code>attributeName</code>) for the provided geometry.  This is used to
      * visualize vector attributes like normals, tangents, and bitangents.
      * @example
      * const geometry = Cesium.GeometryPipeline.createLineSegmentsForVectors(instance.geometry, 'bitangent', 100000.0);
      * @param geometry - The <code>Geometry</code> instance with the attribute.
      * @param [attributeName = 'normal'] - The name of the attribute.
      * @param [length = 10000.0] - The length of each line segment in meters.  This can be negative to point the vector in the opposite direction.
      * @returns A new <code>Geometry</code> instance with line segments for the vector.
      */
    inline def createLineSegmentsForVectors(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
    inline def createLineSegmentsForVectors(geometry: Geometry, attributeName: String): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def createLineSegmentsForVectors(geometry: Geometry, attributeName: String, length: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def createLineSegmentsForVectors(geometry: Geometry, attributeName: Unit, length: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    
    /**
      * Encodes floating-point geometry attribute values as two separate attributes to improve
      * rendering precision.
      * <p>
      * This is commonly used to create high-precision position vertex attributes.
      * </p>
      * @example
      * geometry = Cesium.GeometryPipeline.encodeAttribute(geometry, 'position3D', 'position3DHigh', 'position3DLow');
      * @param geometry - The geometry to modify.
      * @param attributeName - The name of the attribute.
      * @param attributeHighName - The name of the attribute for the encoded high bits.
      * @param attributeLowName - The name of the attribute for the encoded low bits.
      * @returns The modified <code>geometry</code> argument, with its encoded attribute.
      */
    inline def encodeAttribute(geometry: Geometry, attributeName: String, attributeHighName: String, attributeLowName: String): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAttribute")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeHighName.asInstanceOf[js.Any], attributeLowName.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    
    /**
      * Splits a geometry into multiple geometries, if necessary, to ensure that indices in the
      * <code>indices</code> fit into unsigned shorts.  This is used to meet the WebGL requirements
      * when unsigned int indices are not supported.
      * <p>
      * If the geometry does not have any <code>indices</code>, this function has no effect.
      * </p>
      * @example
      * const geometries = Cesium.GeometryPipeline.fitToUnsignedShortIndices(geometry);
      * @param geometry - The geometry to be split into multiple geometries.
      * @returns An array of geometries, each with indices that fit into unsigned shorts.
      */
    inline def fitToUnsignedShortIndices(geometry: Geometry): js.Array[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("fitToUnsignedShortIndices")(geometry.asInstanceOf[js.Any]).asInstanceOf[js.Array[Geometry]]
    
    /**
      * Projects a geometry's 3D <code>position</code> attribute to 2D, replacing the <code>position</code>
      * attribute with separate <code>position3D</code> and <code>position2D</code> attributes.
      * <p>
      * If the geometry does not have a <code>position</code>, this function has no effect.
      * </p>
      * @example
      * geometry = Cesium.GeometryPipeline.projectTo2D(geometry, 'position', 'position3D', 'position2D');
      * @param geometry - The geometry to modify.
      * @param attributeName - The name of the attribute.
      * @param attributeName3D - The name of the attribute in 3D.
      * @param attributeName2D - The name of the attribute in 2D.
      * @param [projection = new GeographicProjection()] - The projection to use.
      * @returns The modified <code>geometry</code> argument with <code>position3D</code> and <code>position2D</code> attributes.
      */
    inline def projectTo2D(geometry: Geometry, attributeName: String, attributeName3D: String, attributeName2D: String): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeName3D.asInstanceOf[js.Any], attributeName2D.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    inline def projectTo2D(
      geometry: Geometry,
      attributeName: String,
      attributeName3D: String,
      attributeName2D: String,
      projection: Any
    ): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeName3D.asInstanceOf[js.Any], attributeName2D.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    
    /**
      * Reorders a geometry's <code>indices</code> to achieve better performance from the GPU's
      * post vertex-shader cache by using the Tipsify algorithm.  If the geometry <code>primitiveType</code>
      * is not <code>TRIANGLES</code> or the geometry does not have an <code>indices</code>, this function has no effect.
      * @example
      * geometry = Cesium.GeometryPipeline.reorderForPostVertexCache(geometry);
      * @param geometry - The geometry to modify.
      * @param [cacheCapacity = 24] - The number of vertices that can be held in the GPU's vertex cache.
      * @returns The modified <code>geometry</code> argument, with its indices reordered for the post-vertex-shader cache.
      */
    inline def reorderForPostVertexCache(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("reorderForPostVertexCache")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
    inline def reorderForPostVertexCache(geometry: Geometry, cacheCapacity: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderForPostVertexCache")(geometry.asInstanceOf[js.Any], cacheCapacity.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    
    /**
      * Reorders a geometry's attributes and <code>indices</code> to achieve better performance from the GPU's pre-vertex-shader cache.
      * @example
      * geometry = Cesium.GeometryPipeline.reorderForPreVertexCache(geometry);
      * @param geometry - The geometry to modify.
      * @returns The modified <code>geometry</code> argument, with its attributes and indices reordered for the GPU's pre-vertex-shader cache.
      */
    inline def reorderForPreVertexCache(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("reorderForPreVertexCache")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
    
    /**
      * Converts a geometry's triangle indices to line indices.  If the geometry has an <code>indices</code>
      * and its <code>primitiveType</code> is <code>TRIANGLES</code>, <code>TRIANGLE_STRIP</code>,
      * <code>TRIANGLE_FAN</code>, it is converted to <code>LINES</code>; otherwise, the geometry is not changed.
      * <p>
      * This is commonly used to create a wireframe geometry for visual debugging.
      * </p>
      * @example
      * geometry = Cesium.GeometryPipeline.toWireframe(geometry);
      * @param geometry - The geometry to modify.
      * @returns The modified <code>geometry</code> argument, with its triangle indices converted to lines.
      */
    inline def toWireframe(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("toWireframe")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
    
    /**
      * Transforms a geometry instance to world coordinates.  This changes
      * the instance's <code>modelMatrix</code> to {@link Matrix4.IDENTITY} and transforms the
      * following attributes if they are present: <code>position</code>, <code>normal</code>,
      * <code>tangent</code>, and <code>bitangent</code>.
      * @example
      * Cesium.GeometryPipeline.transformToWorldCoordinates(instance);
      * @param instance - The geometry instance to modify.
      * @returns The modified <code>instance</code> argument, with its attributes transforms to world coordinates.
      */
    inline def transformToWorldCoordinates(instance: GeometryInstance): GeometryInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("transformToWorldCoordinates")(instance.asInstanceOf[js.Any]).asInstanceOf[GeometryInstance]
  }
}
