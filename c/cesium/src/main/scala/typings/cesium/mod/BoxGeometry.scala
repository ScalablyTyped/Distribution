package typings.cesium.mod

import typings.cesium.anon.MaximumCorner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoxGeometry")
@js.native
class BoxGeometry protected () extends Packable {
  def this(options: MaximumCorner) = this()
}
object BoxGeometry {
  
  @JSImport("cesium", "BoxGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(boxGeometry: BoxGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(boxGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def fromDimensions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDimensions")().asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[BoxGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): BoxGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[BoxGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: BoxGeometry): BoxGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoxGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: BoxGeometry): BoxGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoxGeometry]
}
