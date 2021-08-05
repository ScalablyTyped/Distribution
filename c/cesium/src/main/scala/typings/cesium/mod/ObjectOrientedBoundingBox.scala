package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ObjectOrientedBoundingBox")
@js.native
class ObjectOrientedBoundingBox () extends StObject {
  def this(rotation: Matrix3) = this()
  def this(rotation: Unit, translation: Cartesian3) = this()
  def this(rotation: Matrix3, translation: Cartesian3) = this()
  def this(rotation: Unit, translation: Unit, scale: Cartesian3) = this()
  def this(rotation: Unit, translation: Cartesian3, scale: Cartesian3) = this()
  def this(rotation: Matrix3, translation: Unit, scale: Cartesian3) = this()
  def this(rotation: Matrix3, translation: Cartesian3, scale: Cartesian3) = this()
  
  def clone(result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  
  def equals(): Boolean = js.native
  def equals(right: ObjectOrientedBoundingBox): Boolean = js.native
  
  var rotation: Matrix3 = js.native
  
  var scale: Cartesian3 = js.native
  
  var translation: Cartesian3 = js.native
}
object ObjectOrientedBoundingBox {
  
  @JSImport("cesium", "ObjectOrientedBoundingBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(box: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any]).asInstanceOf[ObjectOrientedBoundingBox]
  inline def clone_(box: ObjectOrientedBoundingBox, result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[ObjectOrientedBoundingBox]
  
  /* static member */
  inline def equals_(left: ObjectOrientedBoundingBox, right: ObjectOrientedBoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromBoundingRectangle(boundingRectangle: BoundingRectangle): ObjectOrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingRectangle")(boundingRectangle.asInstanceOf[js.Any]).asInstanceOf[ObjectOrientedBoundingBox]
  inline def fromBoundingRectangle(boundingRectangle: BoundingRectangle, rotation: Double): ObjectOrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingRectangle")(boundingRectangle.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[ObjectOrientedBoundingBox]
  
  /* static member */
  inline def fromPoints(positions: js.Array[Cartesian3]): ObjectOrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[ObjectOrientedBoundingBox]
  inline def fromPoints(positions: js.Array[Cartesian3], result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[ObjectOrientedBoundingBox]
  
  /* static member */
  inline def intersect(left: ObjectOrientedBoundingBox, right: ObjectOrientedBoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
