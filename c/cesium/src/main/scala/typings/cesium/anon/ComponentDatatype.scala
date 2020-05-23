package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDatatype extends js.Object {
  var componentDatatype: js.UndefOr[typings.cesium.mod.ComponentDatatype] = js.undefined
  var componentsPerAttribute: js.UndefOr[Double] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object ComponentDatatype {
  @scala.inline
  def apply(
    componentDatatype: typings.cesium.mod.ComponentDatatype = null,
    componentsPerAttribute: js.UndefOr[Double] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null
  ): ComponentDatatype = {
    val __obj = js.Dynamic.literal()
    if (componentDatatype != null) __obj.updateDynamic("componentDatatype")(componentDatatype.asInstanceOf[js.Any])
    if (!js.isUndefined(componentsPerAttribute)) __obj.updateDynamic("componentsPerAttribute")(componentsPerAttribute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDatatype]
  }
}

