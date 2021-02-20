package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoundingRectangle")
@js.native
class BoundingRectangle () extends StObject {
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
object BoundingRectangle {
  
  /* static member */
  @JSImport("cesium", "BoundingRectangle.clone")
  @js.native
  def clone_(rectangle: BoundingRectangle): BoundingRectangle = js.native
  @JSImport("cesium", "BoundingRectangle.clone")
  @js.native
  def clone_(rectangle: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = js.native
  
  /* static member */
  @JSImport("cesium", "BoundingRectangle.equals")
  @js.native
  def equals_(): Boolean = js.native
  @JSImport("cesium", "BoundingRectangle.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: BoundingRectangle): Boolean = js.native
  @JSImport("cesium", "BoundingRectangle.equals")
  @js.native
  def equals_(left: BoundingRectangle): Boolean = js.native
  @JSImport("cesium", "BoundingRectangle.equals")
  @js.native
  def equals_(left: BoundingRectangle, right: BoundingRectangle): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "BoundingRectangle.expand")
  @js.native
  def expand(rectangle: BoundingRectangle, point: Cartesian2): BoundingRectangle = js.native
  @JSImport("cesium", "BoundingRectangle.expand")
  @js.native
  def expand(rectangle: BoundingRectangle, point: Cartesian2, result: BoundingRectangle): BoundingRectangle = js.native
  
  /* static member */
  @JSImport("cesium", "BoundingRectangle.fromPoints")
  @js.native
  def fromPoints(positions: js.Array[Cartesian2]): BoundingRectangle = js.native
  @JSImport("cesium", "BoundingRectangle.fromPoints")
  @js.native
  def fromPoints(positions: js.Array[Cartesian2], result: BoundingRectangle): BoundingRectangle = js.native
  
  /* static member */
  @JSImport("cesium", "BoundingRectangle.fromRectangle")
  @js.native
  def fromRectangle(rectangle: Rectangle): BoundingRectangle = js.native
  @JSImport("cesium", "BoundingRectangle.fromRectangle")
  @js.native
  def fromRectangle(rectangle: Rectangle, projection: js.UndefOr[scala.Nothing], result: BoundingRectangle): BoundingRectangle = js.native
  @JSImport("cesium", "BoundingRectangle.fromRectangle")
  @js.native
  def fromRectangle(rectangle: Rectangle, projection: js.Any): BoundingRectangle = js.native
  @JSImport("cesium", "BoundingRectangle.fromRectangle")
  @js.native
  def fromRectangle(rectangle: Rectangle, projection: js.Any, result: BoundingRectangle): BoundingRectangle = js.native
  
  /* static member */
  @JSImport("cesium", "BoundingRectangle.intersect")
  @js.native
  def intersect(left: BoundingRectangle, right: BoundingRectangle): Intersect = js.native
  
  /* static member */
  @JSImport("cesium", "BoundingRectangle.union")
  @js.native
  def union(left: BoundingRectangle, right: BoundingRectangle): BoundingRectangle = js.native
  @JSImport("cesium", "BoundingRectangle.union")
  @js.native
  def union(left: BoundingRectangle, right: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = js.native
}
