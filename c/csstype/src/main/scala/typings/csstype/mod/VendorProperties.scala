package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VendorProperties[TLength, TTime]
  extends VendorLonghandProperties[TLength, TTime]
     with VendorShorthandProperties[TLength, TTime]

object VendorProperties {
  @scala.inline
  def apply[TLength, TTime](): VendorProperties[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorProperties[TLength, TTime]]
  }
}

