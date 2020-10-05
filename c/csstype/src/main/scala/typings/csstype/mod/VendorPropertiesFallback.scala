package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VendorPropertiesFallback[TLength, TTime]
  extends VendorLonghandPropertiesFallback[TLength, TTime]
     with VendorShorthandPropertiesFallback[TLength, TTime]

object VendorPropertiesFallback {
  @scala.inline
  def apply[TLength, TTime](): VendorPropertiesFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorPropertiesFallback[TLength, TTime]]
  }
}

