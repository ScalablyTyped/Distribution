package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "RectangleGeometry")
@js.native
class RectangleGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.Rectangle) = this()
}
object RectangleGeometry {
  
  @JSImport("cesium", "RectangleGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(rectangleGeometry: RectangleGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(rectangleGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def pack(value: BoundingSphere, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: BoundingSphere, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): RectangleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[RectangleGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): RectangleGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[RectangleGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: RectangleGeometry): RectangleGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[RectangleGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: RectangleGeometry): RectangleGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[RectangleGeometry]
}
