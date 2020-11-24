package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProtectionResponse extends js.Object {
  
  /**
    * The Protection object that is described.
    */
  var Protection: js.UndefOr[typings.awsSdk.shieldMod.Protection] = js.native
}
object DescribeProtectionResponse {
  
  @scala.inline
  def apply(): DescribeProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectionResponse]
  }
  
  @scala.inline
  implicit class DescribeProtectionResponseOps[Self <: DescribeProtectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProtection(value: Protection): Self = this.set("Protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtection: Self = this.set("Protection", js.undefined)
  }
}
