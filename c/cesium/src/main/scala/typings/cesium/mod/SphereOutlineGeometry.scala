package typings.cesium.mod

import typings.cesium.anon.SlicePartitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SphereOutlineGeometry")
@js.native
class SphereOutlineGeometry () extends Packable {
  def this(options: SlicePartitions) = this()
}
object SphereOutlineGeometry {
  
  @JSImport("cesium", "SphereOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(sphereGeometry: SphereOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(sphereGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): SphereOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[SphereOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): SphereOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[SphereOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: SphereOutlineGeometry): SphereOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SphereOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: SphereOutlineGeometry): SphereOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SphereOutlineGeometry]
}
