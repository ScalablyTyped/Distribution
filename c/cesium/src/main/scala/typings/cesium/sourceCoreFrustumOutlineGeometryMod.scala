package typings.cesium

import typings.cesium.anon.Orientation
import typings.cesium.mod.FrustumOutlineGeometry
import typings.cesium.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreFrustumOutlineGeometryMod {
  
  @JSImport("cesium/Source/Core/FrustumOutlineGeometry", JSImport.Default)
  @js.native
  open class default protected () extends FrustumOutlineGeometry {
    def this(options: Orientation) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/FrustumOutlineGeometry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the geometric representation of a frustum outline, including its vertices, indices, and a bounding sphere.
      * @param frustumGeometry - A description of the frustum.
      * @returns The computed vertices and indices.
      */
    inline def createGeometry(frustumGeometry: FrustumOutlineGeometry): js.UndefOr[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(frustumGeometry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Geometry]]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: FrustumOutlineGeometry, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: FrustumOutlineGeometry, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      */
    inline def unpack(array: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unpack(array: js.Array[Double], startingIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: FrustumOutlineGeometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: FrustumOutlineGeometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
