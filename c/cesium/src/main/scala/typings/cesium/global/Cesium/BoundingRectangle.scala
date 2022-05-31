package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.BoundingRectangle")
@js.native
class BoundingRectangle ()
  extends typings.cesium.mod.BoundingRectangle {
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
}
object BoundingRectangle {
  
  @JSGlobal("Cesium.BoundingRectangle")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(rectangle: typings.cesium.mod.BoundingRectangle): typings.cesium.mod.BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  inline def clone_(rectangle: typings.cesium.mod.BoundingRectangle, result: typings.cesium.mod.BoundingRectangle): typings.cesium.mod.BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.BoundingRectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.BoundingRectangle): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.BoundingRectangle, right: typings.cesium.mod.BoundingRectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def expand(rectangle: typings.cesium.mod.BoundingRectangle, point: typings.cesium.mod.Cartesian2): typings.cesium.mod.BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(rectangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  inline def expand(
    rectangle: typings.cesium.mod.BoundingRectangle,
    point: typings.cesium.mod.Cartesian2,
    result: typings.cesium.mod.BoundingRectangle
  ): typings.cesium.mod.BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(rectangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  
  /* static member */
  inline def fromPoints(positions: js.Array[typings.cesium.mod.Cartesian2]): typings.cesium.mod.BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  inline def fromPoints(positions: js.Array[typings.cesium.mod.Cartesian2], result: typings.cesium.mod.BoundingRectangle): typings.cesium.mod.BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  
  /* static member */
  inline def fromRectangle(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.BoundingRectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  inline def fromRectangle(rectangle: typings.cesium.mod.Rectangle, projection: js.Any): typings.cesium.mod.BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  inline def fromRectangle(
    rectangle: typings.cesium.mod.Rectangle,
    projection: js.Any,
    result: typings.cesium.mod.BoundingRectangle
  ): typings.cesium.mod.BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  inline def fromRectangle(
    rectangle: typings.cesium.mod.Rectangle,
    projection: Unit,
    result: typings.cesium.mod.BoundingRectangle
  ): typings.cesium.mod.BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  
  /* static member */
  inline def intersect(left: typings.cesium.mod.BoundingRectangle, right: typings.cesium.mod.BoundingRectangle): typings.cesium.mod.Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Intersect]
  
  /* static member */
  inline def union(left: typings.cesium.mod.BoundingRectangle, right: typings.cesium.mod.BoundingRectangle): typings.cesium.mod.BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingRectangle]
  inline def union(
    left: typings.cesium.mod.BoundingRectangle,
    right: typings.cesium.mod.BoundingRectangle,
    result: typings.cesium.mod.BoundingRectangle
  ): typings.cesium.mod.BoundingRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingRectangle]
}
