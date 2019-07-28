package typings.cesium

import typings.cesium.cesiumMod.BoundingSphere
import typings.cesium.cesiumMod.GeometryAttributes
import typings.cesium.cesiumMod.PrimitiveType
import typings.std.Uint16Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: GeometryAttributes
  var boundingSphere: js.UndefOr[BoundingSphere] = js.undefined
  var indices: js.UndefOr[Uint16Array | Uint32Array] = js.undefined
  var primitiveType: js.UndefOr[PrimitiveType] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(
    attributes: GeometryAttributes,
    boundingSphere: BoundingSphere = null,
    indices: Uint16Array | Uint32Array = null,
    primitiveType: PrimitiveType = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes)
    if (boundingSphere != null) __obj.updateDynamic("boundingSphere")(boundingSphere)
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (primitiveType != null) __obj.updateDynamic("primitiveType")(primitiveType)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

