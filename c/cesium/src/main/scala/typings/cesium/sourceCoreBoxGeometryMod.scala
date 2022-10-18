package typings.cesium

import typings.cesium.anon.Dimensions
import typings.cesium.anon.Maximum
import typings.cesium.mod.AxisAlignedBoundingBox
import typings.cesium.mod.BoxGeometry
import typings.cesium.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreBoxGeometryMod {
  
  @JSImport("cesium/Source/Core/BoxGeometry", JSImport.Default)
  @js.native
  open class default protected () extends BoxGeometry {
    def this(options: Maximum) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/BoxGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of a box, including its vertices, indices, and a bounding sphere.
      * @param boxGeometry - A description of the box.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(boxGeometry: BoxGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(boxGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Creates a cube from the dimensions of an AxisAlignedBoundingBox.
      * @example
      * const aabb = Cesium.AxisAlignedBoundingBox.fromPoints(Cesium.Cartesian3.fromDegreesArray([
      *      -72.0, 40.0,
      *      -70.0, 35.0,
      *      -75.0, 30.0,
      *      -70.0, 30.0,
      *      -68.0, 40.0
      * ]));
      * const box = Cesium.BoxGeometry.fromAxisAlignedBoundingBox(aabb);
      * @param boundingBox - A description of the AxisAlignedBoundingBox.
      */
    inline def fromAxisAlignedBoundingBox(boundingBox: AxisAlignedBoundingBox): BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAxisAlignedBoundingBox")(boundingBox.asInstanceOf[js.Any]).asInstanceOf[BoxGeometry]
    
    /**
      * Creates a cube centered at the origin given its dimensions.
      * @example
      * const box = Cesium.BoxGeometry.fromDimensions({
      *   vertexFormat : Cesium.VertexFormat.POSITION_ONLY,
      *   dimensions : new Cesium.Cartesian3(500000.0, 500000.0, 500000.0)
      * });
      * const geometry = Cesium.BoxGeometry.createGeometry(box);
      * @param options - Object with the following properties:
      * @param options.dimensions - The width, depth, and height of the box stored in the x, y, and z coordinates of the <code>Cartesian3</code>, respectively.
      * @param [options.vertexFormat = VertexFormat.DEFAULT] - The vertex attributes to be computed.
      */
    inline def fromDimensions(options: Dimensions): BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDimensions")(options.asInstanceOf[js.Any]).asInstanceOf[BoxGeometry]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: BoxGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: BoxGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/BoxGeometry", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new BoxGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[BoxGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): BoxGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[BoxGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: BoxGeometry): BoxGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoxGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: BoxGeometry): BoxGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoxGeometry]
  }
}
