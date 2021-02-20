package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineGeometry")
@js.native
class PolylineGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.ArcType) = this()
}
object PolylineGeometry {
  
  /* static member */
  @JSImport("cesium", "PolylineGeometry.createGeometry")
  @js.native
  def createGeometry(polylineGeometry: PolylineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "PolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): PolylineGeometry = js.native
  @JSImport("cesium", "PolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: PolylineGeometry): PolylineGeometry = js.native
  @JSImport("cesium", "PolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineGeometry = js.native
  @JSImport("cesium", "PolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineGeometry): PolylineGeometry = js.native
}
