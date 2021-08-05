package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoundingRectangle")
@js.native
class BoundingRectangle () extends StObject {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Unit, width: Double) = this()
  def this(x: Unit, y: Double, width: Double) = this()
  def this(x: Unit, y: Unit, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Unit, height: Double) = this()
  def this(x: Double, y: Unit, width: Double, height: Double) = this()
  def this(x: Double, y: Unit, width: Unit, height: Double) = this()
  def this(x: Unit, y: Double, width: Double, height: Double) = this()
  def this(x: Unit, y: Double, width: Unit, height: Double) = this()
  def this(x: Unit, y: Unit, width: Double, height: Double) = this()
  def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  
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
  
  @JSImport("cesium", "BoundingRectangle")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(rectangle: BoundingRectangle): BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingRectangle]
  inline def clone_(rectangle: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: BoundingRectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: BoundingRectangle): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: BoundingRectangle, right: BoundingRectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def expand(rectangle: BoundingRectangle, point: Cartesian2): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(rectangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def expand(rectangle: BoundingRectangle, point: Cartesian2, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(rectangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  
  /* static member */
  inline def fromPoints(positions: js.Array[Cartesian2]): BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[BoundingRectangle]
  inline def fromPoints(positions: js.Array[Cartesian2], result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  
  /* static member */
  inline def fromRectangle(rectangle: Rectangle): BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingRectangle]
  inline def fromRectangle(rectangle: Rectangle, projection: js.Any): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def fromRectangle(rectangle: Rectangle, projection: js.Any, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def fromRectangle(rectangle: Rectangle, projection: Unit, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  
  /* static member */
  inline def intersect(left: BoundingRectangle, right: BoundingRectangle): Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Intersect]
  
  /* static member */
  inline def union(left: BoundingRectangle, right: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
  inline def union(left: BoundingRectangle, right: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingRectangle]
}
