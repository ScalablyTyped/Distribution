package typings.cesium

import typings.cesium.anon.Height
import typings.cesium.anon.Rotation
import typings.cesium.mod.EllipseGeometry
import typings.cesium.mod.Geometry
import typings.cesium.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipseGeometryMod {
  
  @JSImport("cesium/Source/Core/EllipseGeometry", JSImport.Default)
  @js.native
  open class default protected () extends EllipseGeometry {
    def this(options: Height) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/EllipseGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the bounding rectangle based on the provided options
      * @param options - Object with the following properties:
      * @param options.center - The ellipse's center point in the fixed frame.
      * @param options.semiMajorAxis - The length of the ellipse's semi-major axis in meters.
      * @param options.semiMinorAxis - The length of the ellipse's semi-minor axis in meters.
      * @param [options.ellipsoid = Ellipsoid.WGS84] - The ellipsoid the ellipse will be on.
      * @param [options.rotation = 0.0] - The angle of rotation counter-clockwise from north.
      * @param [options.granularity = Math.RADIANS_PER_DEGREE] - The angular distance between points on the ellipse in radians.
      * @param [result] - An object in which to store the result
      * @returns The result rectangle
      */
    inline def computeRectangle(options: Rotation): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRectangle")(options.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
    inline def computeRectangle(options: Rotation, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRectangle")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    
    /**
      * Computes the geometric representation of a ellipse on an ellipsoid, including its vertices, indices, and a bounding sphere.
      * @param ellipseGeometry - A description of the ellipse.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(ellipseGeometry: EllipseGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(ellipseGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: EllipseGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: EllipseGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/EllipseGeometry", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new EllipseGeometry instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): EllipseGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[EllipseGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double): EllipseGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[EllipseGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: EllipseGeometry): EllipseGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipseGeometry]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: EllipseGeometry): EllipseGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipseGeometry]
  }
}
