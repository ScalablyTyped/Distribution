package typings.cesium.mod

import typings.cesium.anon.MaximumCorner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoxGeometry")
@js.native
class BoxGeometry protected () extends Packable {
  def this(options: MaximumCorner) = this()
}
object BoxGeometry {
  
  /* static member */
  @JSImport("cesium", "BoxGeometry.createGeometry")
  @js.native
  def createGeometry(boxGeometry: BoxGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "BoxGeometry.fromDimensions")
  @js.native
  def fromDimensions(): Unit = js.native
  
  /* static member */
  @JSImport("cesium", "BoxGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): BoxGeometry = js.native
  @JSImport("cesium", "BoxGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: BoxGeometry): BoxGeometry = js.native
  @JSImport("cesium", "BoxGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): BoxGeometry = js.native
  @JSImport("cesium", "BoxGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: BoxGeometry): BoxGeometry = js.native
}
