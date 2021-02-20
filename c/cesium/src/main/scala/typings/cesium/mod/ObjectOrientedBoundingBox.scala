package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ObjectOrientedBoundingBox")
@js.native
class ObjectOrientedBoundingBox () extends StObject {
  def this(rotation: Matrix3) = this()
  def this(rotation: js.UndefOr[scala.Nothing], translation: Cartesian3) = this()
  def this(rotation: Matrix3, translation: Cartesian3) = this()
  def this(rotation: js.UndefOr[scala.Nothing], translation: js.UndefOr[scala.Nothing], scale: Cartesian3) = this()
  def this(rotation: js.UndefOr[scala.Nothing], translation: Cartesian3, scale: Cartesian3) = this()
  def this(rotation: Matrix3, translation: js.UndefOr[scala.Nothing], scale: Cartesian3) = this()
  def this(rotation: Matrix3, translation: Cartesian3, scale: Cartesian3) = this()
  
  def clone(result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  
  def equals(): Boolean = js.native
  def equals(right: ObjectOrientedBoundingBox): Boolean = js.native
  
  var rotation: Matrix3 = js.native
  
  var scale: Cartesian3 = js.native
  
  var translation: Cartesian3 = js.native
}
object ObjectOrientedBoundingBox {
  
  /* static member */
  @JSImport("cesium", "ObjectOrientedBoundingBox.clone")
  @js.native
  def clone_(box: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  @JSImport("cesium", "ObjectOrientedBoundingBox.clone")
  @js.native
  def clone_(box: ObjectOrientedBoundingBox, result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  
  /* static member */
  @JSImport("cesium", "ObjectOrientedBoundingBox.equals")
  @js.native
  def equals_(left: ObjectOrientedBoundingBox, right: ObjectOrientedBoundingBox): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "ObjectOrientedBoundingBox.fromBoundingRectangle")
  @js.native
  def fromBoundingRectangle(boundingRectangle: BoundingRectangle): ObjectOrientedBoundingBox = js.native
  @JSImport("cesium", "ObjectOrientedBoundingBox.fromBoundingRectangle")
  @js.native
  def fromBoundingRectangle(boundingRectangle: BoundingRectangle, rotation: Double): ObjectOrientedBoundingBox = js.native
  
  /* static member */
  @JSImport("cesium", "ObjectOrientedBoundingBox.fromPoints")
  @js.native
  def fromPoints(positions: js.Array[Cartesian3]): ObjectOrientedBoundingBox = js.native
  @JSImport("cesium", "ObjectOrientedBoundingBox.fromPoints")
  @js.native
  def fromPoints(positions: js.Array[Cartesian3], result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  
  /* static member */
  @JSImport("cesium", "ObjectOrientedBoundingBox.intersect")
  @js.native
  def intersect(left: ObjectOrientedBoundingBox, right: ObjectOrientedBoundingBox): Boolean = js.native
}
