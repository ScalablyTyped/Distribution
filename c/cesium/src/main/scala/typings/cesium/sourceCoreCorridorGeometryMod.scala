package typings.cesium

import typings.cesium.anon.CornerType
import typings.cesium.anon.Width
import typings.cesium.mod.CorridorGeometry
import typings.cesium.mod.Geometry
import typings.cesium.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreCorridorGeometryMod {
  
  @JSImport("cesium/Source/Core/CorridorGeometry", JSImport.Default)
  @js.native
  open class default protected () extends CorridorGeometry {
    def this(options: CornerType) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/CorridorGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the bounding rectangle given the provided options
      * @param options - Object with the following properties:
      * @param options.positions - An array of positions that define the center of the corridor.
      * @param options.width - The distance between the edges of the corridor in meters.
      * @param [options.ellipsoid = Ellipsoid.WGS84] - The ellipsoid to be used as a reference.
      * @param [options.cornerType = CornerType.ROUNDED] - Determines the style of the corners.
      * @param [result] - An object in which to store the result.
      * @returns The result rectangle.
      */
    inline def computeRectangle(options: Width): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRectangle")(options.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
    inline def computeRectangle(options: Width, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRectangle")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    
    /**
      * Computes the geometric representation of a corridor, including its vertices, indices, and a bounding sphere.
      * @param corridorGeometry - A description of the corridor.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(corridorGeometry: CorridorGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(corridorGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: CorridorGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: CorridorGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new CorridorGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): CorridorGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[CorridorGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): CorridorGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[CorridorGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorGeometry): CorridorGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CorridorGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: CorridorGeometry): CorridorGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CorridorGeometry]
  }
}
