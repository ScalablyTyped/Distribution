package typings.cesium.mod

import typings.cesium.anon.Granularity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CorridorOutlineGeometry")
@js.native
class CorridorOutlineGeometry protected () extends Packable {
  def this(options: Granularity) = this()
}
object CorridorOutlineGeometry {
  
  @JSImport("cesium", "CorridorOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(corridorOutlineGeometry: CorridorOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(corridorOutlineGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): CorridorOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[CorridorOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): CorridorOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[CorridorOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorOutlineGeometry): CorridorOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CorridorOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: CorridorOutlineGeometry): CorridorOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CorridorOutlineGeometry]
}
