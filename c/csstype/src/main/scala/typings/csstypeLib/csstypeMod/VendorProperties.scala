package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VendorProperties[TLength]
  extends VendorLonghandProperties[TLength]
     with VendorShorthandProperties[TLength]

object VendorProperties {
  @scala.inline
  def apply[TLength](
    VendorLonghandProperties: VendorLonghandProperties[TLength] = null,
    VendorShorthandProperties: VendorShorthandProperties[TLength] = null
  ): VendorProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, VendorLonghandProperties)
    js.Dynamic.global.Object.assign(__obj, VendorShorthandProperties)
    __obj.asInstanceOf[VendorProperties[TLength]]
  }
}

