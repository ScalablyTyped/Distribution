package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineGeometry")
@js.native
class PolylineGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.ArcType) = this()
}
object PolylineGeometry {
  
  @JSImport("cesium", "PolylineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(polylineGeometry: PolylineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polylineGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): PolylineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PolylineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PolylineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineGeometry): PolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: PolylineGeometry): PolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineGeometry]
}
