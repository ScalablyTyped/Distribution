package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentDatatypeComponentsPerAttribute extends js.Object {
  var componentDatatype: js.UndefOr[cesiumLib.cesiumMod.ComponentDatatype] = js.undefined
  var componentsPerAttribute: js.UndefOr[scala.Double] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_ComponentDatatypeComponentsPerAttribute {
  @scala.inline
  def apply(
    componentDatatype: cesiumLib.cesiumMod.ComponentDatatype = null,
    componentsPerAttribute: scala.Int | scala.Double = null,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.Array[scala.Double] = null
  ): Anon_ComponentDatatypeComponentsPerAttribute = {
    val __obj = js.Dynamic.literal()
    if (componentDatatype != null) __obj.updateDynamic("componentDatatype")(componentDatatype)
    if (componentsPerAttribute != null) __obj.updateDynamic("componentsPerAttribute")(componentsPerAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ComponentDatatypeComponentsPerAttribute]
  }
}

