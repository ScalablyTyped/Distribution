package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VendorPropertiesFallback[TLength]
  extends VendorLonghandPropertiesFallback[TLength]
     with VendorShorthandPropertiesFallback[TLength]

object VendorPropertiesFallback {
  @scala.inline
  def apply[TLength](
    VendorLonghandPropertiesFallback: VendorLonghandPropertiesFallback[TLength] = null,
    VendorShorthandPropertiesFallback: VendorShorthandPropertiesFallback[TLength] = null
  ): VendorPropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, VendorLonghandPropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, VendorShorthandPropertiesFallback)
    __obj.asInstanceOf[VendorPropertiesFallback[TLength]]
  }
}

