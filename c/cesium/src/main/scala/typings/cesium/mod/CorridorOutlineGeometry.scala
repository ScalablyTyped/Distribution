package typings.cesium.mod

import typings.cesium.anon.Granularity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CorridorOutlineGeometry")
@js.native
class CorridorOutlineGeometry protected () extends Packable {
  def this(options: Granularity) = this()
}
object CorridorOutlineGeometry {
  
  /* static member */
  @JSImport("cesium", "CorridorOutlineGeometry.createGeometry")
  @js.native
  def createGeometry(corridorOutlineGeometry: CorridorOutlineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "CorridorOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): CorridorOutlineGeometry = js.native
  @JSImport("cesium", "CorridorOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: CorridorOutlineGeometry): CorridorOutlineGeometry = js.native
  @JSImport("cesium", "CorridorOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CorridorOutlineGeometry = js.native
  @JSImport("cesium", "CorridorOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorOutlineGeometry): CorridorOutlineGeometry = js.native
}
