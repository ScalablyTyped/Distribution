package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VendorPropertiesHyphen[TLength]
  extends VendorLonghandPropertiesHyphen[TLength]
     with VendorShorthandPropertiesHyphen[TLength]

object VendorPropertiesHyphen {
  @scala.inline
  def apply[TLength](
    VendorLonghandPropertiesHyphen: VendorLonghandPropertiesHyphen[TLength] = null,
    VendorShorthandPropertiesHyphen: VendorShorthandPropertiesHyphen[TLength] = null
  ): VendorPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, VendorLonghandPropertiesHyphen)
    js.Dynamic.global.Object.assign(__obj, VendorShorthandPropertiesHyphen)
    __obj.asInstanceOf[VendorPropertiesHyphen[TLength]]
  }
}

