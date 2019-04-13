package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentDatatype extends js.Object {
  var componentDatatype: js.UndefOr[cesiumLib.cesiumMod.ComponentDatatype] = js.undefined
  var componentsPerAttribute: js.UndefOr[scala.Double] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var values: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_ComponentDatatype {
  @scala.inline
  def apply(
    componentDatatype: cesiumLib.cesiumMod.ComponentDatatype = null,
    componentsPerAttribute: scala.Int | scala.Double = null,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    values: js.Array[scala.Double] = null
  ): Anon_ComponentDatatype = {
    val __obj = js.Dynamic.literal()
    if (componentDatatype != null) __obj.updateDynamic("componentDatatype")(componentDatatype)
    if (componentsPerAttribute != null) __obj.updateDynamic("componentsPerAttribute")(componentsPerAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Anon_ComponentDatatype]
  }
}

