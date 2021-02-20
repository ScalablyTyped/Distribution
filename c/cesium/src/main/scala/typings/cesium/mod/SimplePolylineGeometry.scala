package typings.cesium.mod

import typings.cesium.anon.Colors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SimplePolylineGeometry")
@js.native
class SimplePolylineGeometry protected () extends Packable {
  def this(options: Colors) = this()
}
object SimplePolylineGeometry {
  
  /* static member */
  @JSImport("cesium", "SimplePolylineGeometry.createGeometry")
  @js.native
  def createGeometry(simplePolylineGeometry: SimplePolylineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "SimplePolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): SimplePolylineGeometry = js.native
  @JSImport("cesium", "SimplePolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: SimplePolylineGeometry): SimplePolylineGeometry = js.native
  @JSImport("cesium", "SimplePolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): SimplePolylineGeometry = js.native
  @JSImport("cesium", "SimplePolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: SimplePolylineGeometry): SimplePolylineGeometry = js.native
}
