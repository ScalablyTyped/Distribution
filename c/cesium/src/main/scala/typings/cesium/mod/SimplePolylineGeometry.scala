package typings.cesium.mod

import typings.cesium.anon.Colors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SimplePolylineGeometry")
@js.native
class SimplePolylineGeometry protected () extends Packable {
  def this(options: Colors) = this()
}
object SimplePolylineGeometry {
  
  @JSImport("cesium", "SimplePolylineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(simplePolylineGeometry: SimplePolylineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(simplePolylineGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): SimplePolylineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[SimplePolylineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): SimplePolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[SimplePolylineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: SimplePolylineGeometry): SimplePolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SimplePolylineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: SimplePolylineGeometry): SimplePolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SimplePolylineGeometry]
}
