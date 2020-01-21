package typings.cesium

import typings.cesium.mod.BoundingSphere
import typings.cesium.mod.GeometryAttributes
import typings.cesium.mod.PrimitiveType
import typings.std.Uint16Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: GeometryAttributes
  var boundingSphere: js.UndefOr[BoundingSphere] = js.undefined
  var indices: js.UndefOr[Uint16Array | Uint32Array] = js.undefined
  var primitiveType: js.UndefOr[PrimitiveType] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(
    attributes: GeometryAttributes,
    boundingSphere: BoundingSphere = null,
    indices: Uint16Array | Uint32Array = null,
    primitiveType: PrimitiveType = null
  ): AnonAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    if (boundingSphere != null) __obj.updateDynamic("boundingSphere")(boundingSphere.asInstanceOf[js.Any])
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (primitiveType != null) __obj.updateDynamic("primitiveType")(primitiveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

