package typings.cesium.mod

import typings.cesium.anon.NumberOfVerticalLines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipseOutlineGeometry")
@js.native
class EllipseOutlineGeometry protected () extends Packable {
  def this(options: NumberOfVerticalLines) = this()
}
object EllipseOutlineGeometry {
  
  @JSImport("cesium", "EllipseOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(ellipseGeometry: EllipseOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(ellipseGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): EllipseOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[EllipseOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): EllipseOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[EllipseOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipseOutlineGeometry): EllipseOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipseOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: EllipseOutlineGeometry): EllipseOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipseOutlineGeometry]
}
