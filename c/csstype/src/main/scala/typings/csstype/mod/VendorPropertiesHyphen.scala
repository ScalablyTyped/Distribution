package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VendorPropertiesHyphen[TLength, TTime]
  extends VendorLonghandPropertiesHyphen[TLength, TTime]
     with VendorShorthandPropertiesHyphen[TLength, TTime]

object VendorPropertiesHyphen {
  @scala.inline
  def apply[TLength, TTime](): VendorPropertiesHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorPropertiesHyphen[TLength, TTime]]
  }
}

