package typings.cesium.mod

import typings.cesium.anon.ExtrudedHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CircleOutlineGeometry")
@js.native
class CircleOutlineGeometry protected () extends Packable {
  def this(options: ExtrudedHeight) = this()
}
object CircleOutlineGeometry {
  
  @JSImport("cesium", "CircleOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(circleGeometry: CircleOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(circleGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: CircleOutlineGeometry): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: CircleOutlineGeometry): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
