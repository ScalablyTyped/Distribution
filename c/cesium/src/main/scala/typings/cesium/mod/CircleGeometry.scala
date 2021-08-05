package typings.cesium.mod

import typings.cesium.anon.Center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CircleGeometry")
@js.native
class CircleGeometry protected () extends Packable {
  def this(options: Center) = this()
}
object CircleGeometry {
  
  @JSImport("cesium", "CircleGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(circleGeometry: CircleGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(circleGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def unpack(array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: CircleGeometry): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: CircleGeometry): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
