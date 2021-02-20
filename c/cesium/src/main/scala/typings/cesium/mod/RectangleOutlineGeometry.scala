package typings.cesium.mod

import typings.cesium.anon.Rotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "RectangleOutlineGeometry")
@js.native
class RectangleOutlineGeometry protected () extends Packable {
  def this(options: Rotation) = this()
}
object RectangleOutlineGeometry {
  
  /* static member */
  @JSImport("cesium", "RectangleOutlineGeometry.createGeometry")
  @js.native
  def createGeometry(rectangleGeometry: RectangleOutlineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "RectangleOutlineGeometry.pack")
  @js.native
  def pack(value: BoundingSphere, array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("cesium", "RectangleOutlineGeometry.pack")
  @js.native
  def pack(value: BoundingSphere, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "RectangleOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): RectangleOutlineGeometry = js.native
  @JSImport("cesium", "RectangleOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: RectangleGeometry): RectangleOutlineGeometry = js.native
  @JSImport("cesium", "RectangleOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): RectangleOutlineGeometry = js.native
  @JSImport("cesium", "RectangleOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: RectangleGeometry): RectangleOutlineGeometry = js.native
}
