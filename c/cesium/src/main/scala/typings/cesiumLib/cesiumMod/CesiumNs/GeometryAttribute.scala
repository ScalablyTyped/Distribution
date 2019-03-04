package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryAttribute extends js.Object {
  var componentDatatype: ComponentDatatype
  var componentsPerAttribute: scala.Double
  var normalize: scala.Boolean
  var values: js.Array[_]
}

object GeometryAttribute {
  @scala.inline
  def apply(
    componentDatatype: ComponentDatatype,
    componentsPerAttribute: scala.Double,
    normalize: scala.Boolean,
    values: js.Array[_]
  ): GeometryAttribute = {
    val __obj = js.Dynamic.literal(componentDatatype = componentDatatype, componentsPerAttribute = componentsPerAttribute, normalize = normalize, values = values)
  
    __obj.asInstanceOf[GeometryAttribute]
  }
}

