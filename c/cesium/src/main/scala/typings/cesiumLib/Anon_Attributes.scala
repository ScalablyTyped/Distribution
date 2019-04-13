package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: cesiumLib.cesiumMod.GeometryAttributes
  var boundingSphere: js.UndefOr[cesiumLib.cesiumMod.BoundingSphere] = js.undefined
  var indices: js.UndefOr[stdLib.Uint16Array | stdLib.Uint32Array] = js.undefined
  var primitiveType: js.UndefOr[cesiumLib.cesiumMod.PrimitiveType] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(
    attributes: cesiumLib.cesiumMod.GeometryAttributes,
    boundingSphere: cesiumLib.cesiumMod.BoundingSphere = null,
    indices: stdLib.Uint16Array | stdLib.Uint32Array = null,
    primitiveType: cesiumLib.cesiumMod.PrimitiveType = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes)
    if (boundingSphere != null) __obj.updateDynamic("boundingSphere")(boundingSphere)
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (primitiveType != null) __obj.updateDynamic("primitiveType")(primitiveType)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

