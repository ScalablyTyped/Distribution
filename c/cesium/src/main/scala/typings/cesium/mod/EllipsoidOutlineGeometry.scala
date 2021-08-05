package typings.cesium.mod

import typings.cesium.anon.MaximumClock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
class EllipsoidOutlineGeometry () extends Packable {
  def this(options: MaximumClock) = this()
}
object EllipsoidOutlineGeometry {
  
  @JSImport("cesium", "EllipsoidOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(ellipsoidGeometry: EllipsoidOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(ellipsoidGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): EllipsoidOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[EllipsoidOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): EllipsoidOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[EllipsoidOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: EllipsoidOutlineGeometry): EllipsoidOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: EllipsoidOutlineGeometry): EllipsoidOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidOutlineGeometry]
}
