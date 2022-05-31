package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.AxisAlignedBoundingBox")
@js.native
class AxisAlignedBoundingBox ()
  extends typings.cesium.mod.AxisAlignedBoundingBox {
  def this(minimum: typings.cesium.mod.Cartesian3) = this()
  def this(minimum: Unit, maximum: typings.cesium.mod.Cartesian3) = this()
  def this(minimum: typings.cesium.mod.Cartesian3, maximum: typings.cesium.mod.Cartesian3) = this()
  def this(minimum: Unit, maximum: Unit, center: typings.cesium.mod.Cartesian3) = this()
  def this(minimum: Unit, maximum: typings.cesium.mod.Cartesian3, center: typings.cesium.mod.Cartesian3) = this()
  def this(minimum: typings.cesium.mod.Cartesian3, maximum: Unit, center: typings.cesium.mod.Cartesian3) = this()
  def this(
    minimum: typings.cesium.mod.Cartesian3,
    maximum: typings.cesium.mod.Cartesian3,
    center: typings.cesium.mod.Cartesian3
  ) = this()
}
object AxisAlignedBoundingBox {
  
  @JSGlobal("Cesium.AxisAlignedBoundingBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(box: typings.cesium.mod.AxisAlignedBoundingBox): typings.cesium.mod.AxisAlignedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.AxisAlignedBoundingBox]
  inline def clone_(box: typings.cesium.mod.AxisAlignedBoundingBox, result: typings.cesium.mod.AxisAlignedBoundingBox): typings.cesium.mod.AxisAlignedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.AxisAlignedBoundingBox]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.AxisAlignedBoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.AxisAlignedBoundingBox): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.AxisAlignedBoundingBox, right: typings.cesium.mod.AxisAlignedBoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromPoints(positions: js.Array[typings.cesium.mod.Cartesian3]): typings.cesium.mod.AxisAlignedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.AxisAlignedBoundingBox]
  inline def fromPoints(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    result: typings.cesium.mod.AxisAlignedBoundingBox
  ): typings.cesium.mod.AxisAlignedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.AxisAlignedBoundingBox]
  
  /* static member */
  inline def intersect(box: typings.cesium.mod.AxisAlignedBoundingBox, plane: typings.cesium.mod.Cartesian4): typings.cesium.mod.Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(box.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Intersect]
}
