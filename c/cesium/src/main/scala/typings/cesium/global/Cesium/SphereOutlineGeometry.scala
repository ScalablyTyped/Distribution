package typings.cesium.global.Cesium

import typings.cesium.anon.SlicePartitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.SphereOutlineGeometry")
@js.native
class SphereOutlineGeometry ()
  extends typings.cesium.mod.SphereOutlineGeometry {
  def this(options: SlicePartitions) = this()
}
object SphereOutlineGeometry {
  
  @JSGlobal("Cesium.SphereOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(sphereGeometry: typings.cesium.mod.SphereOutlineGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(sphereGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.SphereOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.SphereOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.SphereOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.SphereOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.SphereOutlineGeometry): typings.cesium.mod.SphereOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.SphereOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.SphereOutlineGeometry): typings.cesium.mod.SphereOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.SphereOutlineGeometry]
}
