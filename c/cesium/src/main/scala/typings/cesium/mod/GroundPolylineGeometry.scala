package typings.cesium.mod

import typings.cesium.anon.Loop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GroundPolylineGeometry")
@js.native
class GroundPolylineGeometry protected () extends Packable {
  def this(options: Loop) = this()
  
  var arcType: ArcType = js.native
  
  var granularity: Boolean = js.native
  
  var loop: Boolean = js.native
  
  var width: Double = js.native
}
object GroundPolylineGeometry {
  
  @JSImport("cesium", "GroundPolylineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def unpack(array: js.Array[Double]): GroundPolylineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[GroundPolylineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): GroundPolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[GroundPolylineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: GroundPolylineGeometry): GroundPolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[GroundPolylineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: GroundPolylineGeometry): GroundPolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[GroundPolylineGeometry]
}
