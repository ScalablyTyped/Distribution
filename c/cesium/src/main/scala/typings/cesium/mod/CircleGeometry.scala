package typings.cesium.mod

import typings.cesium.anon.Center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CircleGeometry")
@js.native
class CircleGeometry protected () extends Packable {
  def this(options: Center) = this()
}
object CircleGeometry {
  
  /* static member */
  @JSImport("cesium", "CircleGeometry.createGeometry")
  @js.native
  def createGeometry(circleGeometry: CircleGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "CircleGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("cesium", "CircleGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: CircleGeometry): js.Array[Double] = js.native
  @JSImport("cesium", "CircleGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  @JSImport("cesium", "CircleGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CircleGeometry): js.Array[Double] = js.native
}
