package typings.cesium.mod

import typings.cesium.anon.PolylinePositions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineVolumeGeometry")
@js.native
open class PolylineVolumeGeometry protected () extends StObject {
  def this(options: PolylinePositions) = this()
  
  /**
    * The number of elements used to pack the object into an array.
    */
  var packedLength: Double = js.native
}
/* static members */
object PolylineVolumeGeometry {
  
  @JSImport("cesium", "PolylineVolumeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes the geometric representation of a polyline with a volume, including its vertices, indices, and a bounding sphere.
    * @param polylineVolumeGeometry - A description of the polyline volume.
    * @returns The computed vertices and indices.
    */
  inline def createGeometry(polylineVolumeGeometry: PolylineVolumeGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polylineVolumeGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: PolylineVolumeGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: PolylineVolumeGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new PolylineVolumeGeometry instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): PolylineVolumeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PolylineVolumeGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): PolylineVolumeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PolylineVolumeGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineVolumeGeometry): PolylineVolumeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineVolumeGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: PolylineVolumeGeometry): PolylineVolumeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineVolumeGeometry]
}
