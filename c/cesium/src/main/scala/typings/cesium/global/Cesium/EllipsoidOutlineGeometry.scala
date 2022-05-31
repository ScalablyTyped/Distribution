package typings.cesium.global.Cesium

import typings.cesium.anon.MaximumClock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.EllipsoidOutlineGeometry")
@js.native
class EllipsoidOutlineGeometry ()
  extends typings.cesium.mod.EllipsoidOutlineGeometry {
  def this(options: MaximumClock) = this()
}
object EllipsoidOutlineGeometry {
  
  @JSGlobal("Cesium.EllipsoidOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(ellipsoidGeometry: typings.cesium.mod.EllipsoidOutlineGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(ellipsoidGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.EllipsoidOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.EllipsoidOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.EllipsoidOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.EllipsoidOutlineGeometry]
  inline def unpack(
    array: js.Array[Double],
    startingIndex: Double,
    result: typings.cesium.mod.EllipsoidOutlineGeometry
  ): typings.cesium.mod.EllipsoidOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.EllipsoidOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.EllipsoidOutlineGeometry): typings.cesium.mod.EllipsoidOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.EllipsoidOutlineGeometry]
}
