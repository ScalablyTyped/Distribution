package typings.cesium.mod

import typings.cesium.anon.Loop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /* static member */
  @JSImport("cesium", "GroundPolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): GroundPolylineGeometry = js.native
  @JSImport("cesium", "GroundPolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: GroundPolylineGeometry): GroundPolylineGeometry = js.native
  @JSImport("cesium", "GroundPolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): GroundPolylineGeometry = js.native
  @JSImport("cesium", "GroundPolylineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: GroundPolylineGeometry): GroundPolylineGeometry = js.native
}
