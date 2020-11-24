package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProtectionGroupResponse extends js.Object {
  
  /**
    * A grouping of protected resources that you and AWS Shield Advanced can monitor as a collective. This resource grouping improves the accuracy of detection and reduces false positives. 
    */
  var ProtectionGroup: typings.awsSdk.shieldMod.ProtectionGroup = js.native
}
object DescribeProtectionGroupResponse {
  
  @scala.inline
  def apply(ProtectionGroup: ProtectionGroup): DescribeProtectionGroupResponse = {
    val __obj = js.Dynamic.literal(ProtectionGroup = ProtectionGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProtectionGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeProtectionGroupResponseOps[Self <: DescribeProtectionGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setProtectionGroup(value: ProtectionGroup): Self = this.set("ProtectionGroup", value.asInstanceOf[js.Any])
  }
}
