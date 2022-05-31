package typings.cesium.global.Cesium

import typings.cesium.anon.ExtrudedHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.CircleOutlineGeometry")
@js.native
class CircleOutlineGeometry protected ()
  extends typings.cesium.mod.CircleOutlineGeometry {
  def this(options: ExtrudedHeight) = this()
}
object CircleOutlineGeometry {
  
  @JSGlobal("Cesium.CircleOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(circleGeometry: typings.cesium.mod.CircleOutlineGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(circleGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def unpack(array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.CircleOutlineGeometry): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.CircleOutlineGeometry): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
