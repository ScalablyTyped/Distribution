package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowGeometryInstanceAttribute extends js.Object {
  var componentDatatype: ComponentDatatype
  var componentsPerAttribute: scala.Double
  var normalize: scala.Boolean
  var value: stdLib.Uint8Array
}

object ShowGeometryInstanceAttribute {
  @scala.inline
  def apply(
    componentDatatype: ComponentDatatype,
    componentsPerAttribute: scala.Double,
    normalize: scala.Boolean,
    value: stdLib.Uint8Array
  ): ShowGeometryInstanceAttribute = {
    val __obj = js.Dynamic.literal(componentDatatype = componentDatatype, componentsPerAttribute = componentsPerAttribute, normalize = normalize, value = value)
  
    __obj.asInstanceOf[ShowGeometryInstanceAttribute]
  }
}

