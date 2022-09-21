package typings.cesium

import typings.cesium.anon.DimensionsCartesian3
import typings.cesium.anon.Minimum
import typings.cesium.mod.AxisAlignedBoundingBox
import typings.cesium.mod.BoxOutlineGeometry
import typings.cesium.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxOutlineGeometryMod {
  
  @JSImport("cesium/Source/Core/BoxOutlineGeometry", JSImport.Default)
  @js.native
  open class default protected () extends BoxOutlineGeometry {
    def this(options: Minimum) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/BoxOutlineGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of an outline of a box, including its vertices, indices, and a bounding sphere.
      * @param boxGeometry - A description of the box outline.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(boxGeometry: BoxOutlineGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(boxGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Creates an outline of a cube from the dimensions of an AxisAlignedBoundingBox.
      * @example
      * const aabb = Cesium.AxisAlignedBoundingBox.fromPoints(Cesium.Cartesian3.fromDegreesArray([
      *      -72.0, 40.0,
      *      -70.0, 35.0,
      *      -75.0, 30.0,
      *      -70.0, 30.0,
      *      -68.0, 40.0
      * ]));
      * const box = Cesium.BoxOutlineGeometry.fromAxisAlignedBoundingBox(aabb);
      *
      *
      * @param boundingBox - A description of the AxisAlignedBoundingBox.
      */
    inline def fromAxisAlignedBoundingBox(boundingBox: AxisAlignedBoundingBox): BoxOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAxisAlignedBoundingBox")(boundingBox.asInstanceOf[js.Any]).asInstanceOf[BoxOutlineGeometry]
    
    /**
      * Creates an outline of a cube centered at the origin given its dimensions.
      * @example
      * const box = Cesium.BoxOutlineGeometry.fromDimensions({
      *   dimensions : new Cesium.Cartesian3(500000.0, 500000.0, 500000.0)
      * });
      * const geometry = Cesium.BoxOutlineGeometry.createGeometry(box);
      * @param options - Object with the following properties:
      * @param options.dimensions - The width, depth, and height of the box stored in the x, y, and z coordinates of the <code>Cartesian3</code>, respectively.
      */
    inline def fromDimensions(options: DimensionsCartesian3): BoxOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDimensions")(options.asInstanceOf[js.Any]).asInstanceOf[BoxOutlineGeometry]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: BoxOutlineGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: BoxOutlineGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/BoxOutlineGeometry", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new BoxOutlineGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): BoxOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[BoxOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): BoxOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[BoxOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: BoxOutlineGeometry): BoxOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoxOutlineGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: BoxOutlineGeometry): BoxOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoxOutlineGeometry]
  }
}
