package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CorridorGeometry")
@js.native
class CorridorGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.CornerType) = this()
}
object CorridorGeometry {
  
  @JSImport("cesium", "CorridorGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(corridorGeometry: CorridorGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(corridorGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): CorridorGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[CorridorGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): CorridorGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[CorridorGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorGeometry): CorridorGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CorridorGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: CorridorGeometry): CorridorGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CorridorGeometry]
}
