package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoxOutlineGeometry")
@js.native
class BoxOutlineGeometry () extends Packable
object BoxOutlineGeometry {
  
  @JSImport("cesium", "BoxOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(boxGeometry: BoxOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(boxGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def fromDimensions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDimensions")().asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): BoxOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[BoxOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): BoxOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[BoxOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: BoxOutlineGeometry): BoxOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoxOutlineGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: BoxOutlineGeometry): BoxOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoxOutlineGeometry]
}
