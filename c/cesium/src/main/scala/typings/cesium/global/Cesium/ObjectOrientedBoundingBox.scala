package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.ObjectOrientedBoundingBox")
@js.native
class ObjectOrientedBoundingBox ()
  extends typings.cesium.mod.ObjectOrientedBoundingBox {
  def this(rotation: typings.cesium.mod.Matrix3) = this()
  def this(rotation: Unit, translation: typings.cesium.mod.Cartesian3) = this()
  def this(rotation: typings.cesium.mod.Matrix3, translation: typings.cesium.mod.Cartesian3) = this()
  def this(rotation: Unit, translation: Unit, scale: typings.cesium.mod.Cartesian3) = this()
  def this(rotation: Unit, translation: typings.cesium.mod.Cartesian3, scale: typings.cesium.mod.Cartesian3) = this()
  def this(rotation: typings.cesium.mod.Matrix3, translation: Unit, scale: typings.cesium.mod.Cartesian3) = this()
  def this(
    rotation: typings.cesium.mod.Matrix3,
    translation: typings.cesium.mod.Cartesian3,
    scale: typings.cesium.mod.Cartesian3
  ) = this()
}
object ObjectOrientedBoundingBox {
  
  @JSGlobal("Cesium.ObjectOrientedBoundingBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(box: typings.cesium.mod.ObjectOrientedBoundingBox): typings.cesium.mod.ObjectOrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.ObjectOrientedBoundingBox]
  inline def clone_(
    box: typings.cesium.mod.ObjectOrientedBoundingBox,
    result: typings.cesium.mod.ObjectOrientedBoundingBox
  ): typings.cesium.mod.ObjectOrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.ObjectOrientedBoundingBox]
  
  /* static member */
  inline def equals_(
    left: typings.cesium.mod.ObjectOrientedBoundingBox,
    right: typings.cesium.mod.ObjectOrientedBoundingBox
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromBoundingRectangle(boundingRectangle: typings.cesium.mod.BoundingRectangle): typings.cesium.mod.ObjectOrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingRectangle")(boundingRectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.ObjectOrientedBoundingBox]
  inline def fromBoundingRectangle(boundingRectangle: typings.cesium.mod.BoundingRectangle, rotation: Double): typings.cesium.mod.ObjectOrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingRectangle")(boundingRectangle.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.ObjectOrientedBoundingBox]
  
  /* static member */
  inline def fromPoints(positions: js.Array[typings.cesium.mod.Cartesian3]): typings.cesium.mod.ObjectOrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.ObjectOrientedBoundingBox]
  inline def fromPoints(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    result: typings.cesium.mod.ObjectOrientedBoundingBox
  ): typings.cesium.mod.ObjectOrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.ObjectOrientedBoundingBox]
  
  /* static member */
  inline def intersect(
    left: typings.cesium.mod.ObjectOrientedBoundingBox,
    right: typings.cesium.mod.ObjectOrientedBoundingBox
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
