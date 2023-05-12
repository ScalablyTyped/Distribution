package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GroundPolylineGeometry")
@js.native
open class GroundPolylineGeometry protected () extends StObject {
  def this(options: typings.cesiumEngine.anon.ArcType) = this()
  
  /**
    * The type of path the polyline must follow. Valid options are {@link ArcType.GEODESIC} and {@link ArcType.RHUMB}.
    */
  var arcType: ArcType = js.native
  
  /**
    * The distance interval used for interpolating options.points. Zero indicates no interpolation.
    * Default of 9999.0 allows centimeter accuracy with 32 bit floating point.
    */
  var granularity: Boolean = js.native
  
  /**
    * Whether during geometry creation a line segment will be added between the last and first line positions to make this Polyline a loop.
    * If the geometry has two positions this parameter will be ignored.
    */
  var loop: Boolean = js.native
  
  /**
    * The screen space width in pixels.
    */
  var width: Double = js.native
}
/* static members */
object GroundPolylineGeometry {
  
  @JSImport("@cesium/engine", "GroundPolylineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: PolygonGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: PolygonGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    */
  inline def unpack(array: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonGeometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: PolygonGeometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
