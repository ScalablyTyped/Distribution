package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "RectangleGeometry")
@js.native
class RectangleGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.Rectangle) = this()
}
object RectangleGeometry {
  
  /* static member */
  @JSImport("cesium", "RectangleGeometry.createGeometry")
  @js.native
  def createGeometry(rectangleGeometry: RectangleGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "RectangleGeometry.pack")
  @js.native
  def pack(value: BoundingSphere, array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("cesium", "RectangleGeometry.pack")
  @js.native
  def pack(value: BoundingSphere, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "RectangleGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): RectangleGeometry = js.native
  @JSImport("cesium", "RectangleGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: RectangleGeometry): RectangleGeometry = js.native
  @JSImport("cesium", "RectangleGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): RectangleGeometry = js.native
  @JSImport("cesium", "RectangleGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: RectangleGeometry): RectangleGeometry = js.native
}
