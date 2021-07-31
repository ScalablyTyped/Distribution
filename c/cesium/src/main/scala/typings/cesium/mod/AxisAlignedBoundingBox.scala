package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "AxisAlignedBoundingBox")
@js.native
class AxisAlignedBoundingBox () extends StObject {
  def this(minimum: Cartesian3) = this()
  def this(minimum: Unit, maximum: Cartesian3) = this()
  def this(minimum: Cartesian3, maximum: Cartesian3) = this()
  def this(minimum: Unit, maximum: Unit, center: Cartesian3) = this()
  def this(minimum: Unit, maximum: Cartesian3, center: Cartesian3) = this()
  def this(minimum: Cartesian3, maximum: Unit, center: Cartesian3) = this()
  def this(minimum: Cartesian3, maximum: Cartesian3, center: Cartesian3) = this()
  
  var center: Cartesian3 = js.native
  
  def clone(result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = js.native
  
  def equals(): Boolean = js.native
  def equals(right: AxisAlignedBoundingBox): Boolean = js.native
  
  def intersect(plane: Cartesian4): Intersect = js.native
  
  var maximum: Cartesian3 = js.native
  
  var minimum: Cartesian3 = js.native
}
object AxisAlignedBoundingBox {
  
  @JSImport("cesium", "AxisAlignedBoundingBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def clone_(box: AxisAlignedBoundingBox): AxisAlignedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any]).asInstanceOf[AxisAlignedBoundingBox]
  @scala.inline
  def clone_(box: AxisAlignedBoundingBox, result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[AxisAlignedBoundingBox]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: AxisAlignedBoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: AxisAlignedBoundingBox): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: AxisAlignedBoundingBox, right: AxisAlignedBoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def fromPoints(positions: js.Array[Cartesian3]): AxisAlignedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[AxisAlignedBoundingBox]
  @scala.inline
  def fromPoints(positions: js.Array[Cartesian3], result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[AxisAlignedBoundingBox]
  
  /* static member */
  @scala.inline
  def intersect(box: AxisAlignedBoundingBox, plane: Cartesian4): Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(box.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Intersect]
}
