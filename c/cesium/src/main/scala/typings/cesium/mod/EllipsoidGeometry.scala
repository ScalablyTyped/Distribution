package typings.cesium.mod

import typings.cesium.anon.InnerRadii
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidGeometry")
@js.native
class EllipsoidGeometry () extends Packable {
  def this(options: InnerRadii) = this()
}
object EllipsoidGeometry {
  
  @JSImport("cesium", "EllipsoidGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(ellipsoidGeometry: EllipsoidGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(ellipsoidGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): EllipsoidGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[EllipsoidGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): EllipsoidGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[EllipsoidGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipsoidGeometry): EllipsoidGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: EllipsoidGeometry): EllipsoidGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidGeometry]
}
