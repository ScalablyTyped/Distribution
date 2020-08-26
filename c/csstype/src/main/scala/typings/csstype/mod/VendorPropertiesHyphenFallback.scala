package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VendorPropertiesHyphenFallback[TLength, TTime]
  extends VendorLonghandPropertiesHyphenFallback[TLength, TTime]
     with VendorShorthandPropertiesHyphenFallback[TLength, TTime]

object VendorPropertiesHyphenFallback {
  @scala.inline
  def apply[TLength, TTime](): VendorPropertiesHyphenFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorPropertiesHyphenFallback[TLength, TTime]]
  }
}

