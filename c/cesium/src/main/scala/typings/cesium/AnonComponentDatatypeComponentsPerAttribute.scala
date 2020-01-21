package typings.cesium

import typings.cesium.mod.ComponentDatatype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentDatatypeComponentsPerAttribute extends js.Object {
  var componentDatatype: js.UndefOr[ComponentDatatype] = js.undefined
  var componentsPerAttribute: js.UndefOr[Double] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonComponentDatatypeComponentsPerAttribute {
  @scala.inline
  def apply(
    componentDatatype: ComponentDatatype = null,
    componentsPerAttribute: Int | Double = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    value: js.Array[Double] = null
  ): AnonComponentDatatypeComponentsPerAttribute = {
    val __obj = js.Dynamic.literal()
    if (componentDatatype != null) __obj.updateDynamic("componentDatatype")(componentDatatype.asInstanceOf[js.Any])
    if (componentsPerAttribute != null) __obj.updateDynamic("componentsPerAttribute")(componentsPerAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentDatatypeComponentsPerAttribute]
  }
}

