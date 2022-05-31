package typings.cesium.global.Cesium

import typings.cesium.anon.InnerRadii
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.EllipsoidGeometry")
@js.native
class EllipsoidGeometry ()
  extends typings.cesium.mod.EllipsoidGeometry {
  def this(options: InnerRadii) = this()
}
object EllipsoidGeometry {
  
  @JSGlobal("Cesium.EllipsoidGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(ellipsoidGeometry: typings.cesium.mod.EllipsoidGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(ellipsoidGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.EllipsoidGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.EllipsoidGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.EllipsoidGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.EllipsoidGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.EllipsoidGeometry): typings.cesium.mod.EllipsoidGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.EllipsoidGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.EllipsoidGeometry): typings.cesium.mod.EllipsoidGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.EllipsoidGeometry]
}
