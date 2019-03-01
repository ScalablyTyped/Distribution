package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryInstanceAttribute extends js.Object {
  var componentDatatype: ComponentDatatype
  var componentsPerAttribute: scala.Double
  var normalize: scala.Boolean
  var value: js.Array[scala.Double]
}

object GeometryInstanceAttribute {
  @scala.inline
  def apply(
    componentDatatype: ComponentDatatype,
    componentsPerAttribute: scala.Double,
    normalize: scala.Boolean,
    value: js.Array[scala.Double]
  ): GeometryInstanceAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentDatatype")(componentDatatype)
    __obj.updateDynamic("componentsPerAttribute")(componentsPerAttribute)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GeometryInstanceAttribute]
  }
}

