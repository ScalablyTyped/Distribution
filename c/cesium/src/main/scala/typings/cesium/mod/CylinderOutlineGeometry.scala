package typings.cesium.mod

import typings.cesium.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
class CylinderOutlineGeometry protected () extends Packable {
  def this(options: Length) = this()
}
object CylinderOutlineGeometry {
  
  @JSImport("cesium", "CylinderOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(cylinderGeometry: CylinderOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(cylinderGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): CylinderOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[CylinderOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): CylinderOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[CylinderOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: CylinderOutlineGeometry): CylinderOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CylinderOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: CylinderOutlineGeometry): CylinderOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CylinderOutlineGeometry]
}
