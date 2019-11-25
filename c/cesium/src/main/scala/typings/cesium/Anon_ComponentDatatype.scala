package typings.cesium

import typings.cesium.cesiumMod.ComponentDatatype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentDatatype extends js.Object {
  var componentDatatype: js.UndefOr[ComponentDatatype] = js.undefined
  var componentsPerAttribute: js.UndefOr[Double] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object Anon_ComponentDatatype {
  @scala.inline
  def apply(
    componentDatatype: ComponentDatatype = null,
    componentsPerAttribute: Int | Double = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null
  ): Anon_ComponentDatatype = {
    val __obj = js.Dynamic.literal()
    if (componentDatatype != null) __obj.updateDynamic("componentDatatype")(componentDatatype.asInstanceOf[js.Any])
    if (componentsPerAttribute != null) __obj.updateDynamic("componentsPerAttribute")(componentsPerAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComponentDatatype]
  }
}

