package typings.cesium

import typings.cesium.cesiumMod.ComponentDatatype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentDatatypeComponentsPerAttribute extends js.Object {
  var componentDatatype: js.UndefOr[ComponentDatatype] = js.undefined
  var componentsPerAttribute: js.UndefOr[Double] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[js.Array[Double]] = js.undefined
}

object Anon_ComponentDatatypeComponentsPerAttribute {
  @scala.inline
  def apply(
    componentDatatype: ComponentDatatype = null,
    componentsPerAttribute: Int | Double = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    value: js.Array[Double] = null
  ): Anon_ComponentDatatypeComponentsPerAttribute = {
    val __obj = js.Dynamic.literal()
    if (componentDatatype != null) __obj.updateDynamic("componentDatatype")(componentDatatype)
    if (componentsPerAttribute != null) __obj.updateDynamic("componentsPerAttribute")(componentsPerAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ComponentDatatypeComponentsPerAttribute]
  }
}

