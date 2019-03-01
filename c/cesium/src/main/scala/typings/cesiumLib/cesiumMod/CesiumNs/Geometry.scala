package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  var attributes: GeometryAttributes
  var boundingSphere: BoundingSphere
  var indices: js.Array[_]
  var primitiveType: PrimitiveType
}

object Geometry {
  @scala.inline
  def apply(
    attributes: GeometryAttributes,
    boundingSphere: BoundingSphere,
    indices: js.Array[_],
    primitiveType: PrimitiveType
  ): Geometry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("boundingSphere")(boundingSphere)
    __obj.updateDynamic("indices")(indices)
    __obj.updateDynamic("primitiveType")(primitiveType)
    __obj.asInstanceOf[Geometry]
  }
}

