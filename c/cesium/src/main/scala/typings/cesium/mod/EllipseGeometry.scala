package typings.cesium.mod

import typings.cesium.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipseGeometry")
@js.native
class EllipseGeometry protected () extends Packable {
  def this(options: Height) = this()
}
object EllipseGeometry {
  
  @JSImport("cesium", "EllipseGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(ellipseGeometry: EllipseGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(ellipseGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): EllipseGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[EllipseGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): EllipseGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[EllipseGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipseGeometry): EllipseGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipseGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: EllipseGeometry): EllipseGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipseGeometry]
}
