package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoundingRectangle")
@js.native
class BoundingRectangle () extends js.Object {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  
  def clone(result: BoundingRectangle): BoundingRectangle = js.native
  
  def equals(): Boolean = js.native
  def equals(right: BoundingRectangle): Boolean = js.native
  
  var height: Double = js.native
  
  def intersect(right: BoundingRectangle): Intersect = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
/* static members */
@JSImport("cesium", "BoundingRectangle")
@js.native
object BoundingRectangle extends js.Object {
  
  def clone(rectangle: BoundingRectangle): BoundingRectangle = js.native
  def clone(rectangle: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = js.native
  
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: BoundingRectangle): Boolean = js.native
  def equals(left: BoundingRectangle): Boolean = js.native
  def equals(left: BoundingRectangle, right: BoundingRectangle): Boolean = js.native
  
  def expand(rectangle: BoundingRectangle, point: Cartesian2): BoundingRectangle = js.native
  def expand(rectangle: BoundingRectangle, point: Cartesian2, result: BoundingRectangle): BoundingRectangle = js.native
  
  def fromPoints(positions: js.Array[Cartesian2]): BoundingRectangle = js.native
  def fromPoints(positions: js.Array[Cartesian2], result: BoundingRectangle): BoundingRectangle = js.native
  
  def fromRectangle(rectangle: Rectangle): BoundingRectangle = js.native
  def fromRectangle(rectangle: Rectangle, projection: js.UndefOr[scala.Nothing], result: BoundingRectangle): BoundingRectangle = js.native
  def fromRectangle(rectangle: Rectangle, projection: js.Any): BoundingRectangle = js.native
  def fromRectangle(rectangle: Rectangle, projection: js.Any, result: BoundingRectangle): BoundingRectangle = js.native
  
  def intersect(left: BoundingRectangle, right: BoundingRectangle): Intersect = js.native
  
  def union(left: BoundingRectangle, right: BoundingRectangle): BoundingRectangle = js.native
  def union(left: BoundingRectangle, right: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = js.native
}
