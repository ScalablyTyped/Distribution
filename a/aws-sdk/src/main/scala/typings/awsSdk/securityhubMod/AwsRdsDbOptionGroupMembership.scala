package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbOptionGroupMembership extends js.Object {
  
  /**
    * 
    */
  var OptionGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbOptionGroupMembership {
  
  @scala.inline
  def apply(): AwsRdsDbOptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbOptionGroupMembership]
  }
  
  @scala.inline
  implicit class AwsRdsDbOptionGroupMembershipOps[Self <: AwsRdsDbOptionGroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOptionGroupName(value: NonEmptyString): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupName: Self = this.set("OptionGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
