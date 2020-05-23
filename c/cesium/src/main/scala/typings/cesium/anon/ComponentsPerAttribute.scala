package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentsPerAttribute extends js.Object {
  var componentDatatype: js.UndefOr[typings.cesium.mod.ComponentDatatype] = js.undefined
  var componentsPerAttribute: js.UndefOr[Double] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[js.Array[Double]] = js.undefined
}

object ComponentsPerAttribute {
  @scala.inline
  def apply(
    componentDatatype: typings.cesium.mod.ComponentDatatype = null,
    componentsPerAttribute: js.UndefOr[Double] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    value: js.Array[Double] = null
  ): ComponentsPerAttribute = {
    val __obj = js.Dynamic.literal()
    if (componentDatatype != null) __obj.updateDynamic("componentDatatype")(componentDatatype.asInstanceOf[js.Any])
    if (!js.isUndefined(componentsPerAttribute)) __obj.updateDynamic("componentsPerAttribute")(componentsPerAttribute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsPerAttribute]
  }
}

