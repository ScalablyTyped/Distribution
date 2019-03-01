package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VendorPropertiesHyphenFallback[TLength]
  extends VendorLonghandPropertiesHyphenFallback[TLength]
     with VendorShorthandPropertiesHyphenFallback[TLength]

object VendorPropertiesHyphenFallback {
  @scala.inline
  def apply[TLength](
    VendorLonghandPropertiesHyphenFallback: VendorLonghandPropertiesHyphenFallback[TLength] = null,
    VendorShorthandPropertiesHyphenFallback: VendorShorthandPropertiesHyphenFallback[TLength] = null
  ): VendorPropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, VendorLonghandPropertiesHyphenFallback)
    js.Dynamic.global.Object.assign(__obj, VendorShorthandPropertiesHyphenFallback)
    __obj.asInstanceOf[VendorPropertiesHyphenFallback[TLength]]
  }
}

