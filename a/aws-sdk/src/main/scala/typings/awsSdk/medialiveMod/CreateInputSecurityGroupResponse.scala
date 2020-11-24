package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInputSecurityGroupResponse extends js.Object {
  
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.native
}
object CreateInputSecurityGroupResponse {
  
  @scala.inline
  def apply(): CreateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputSecurityGroupResponse]
  }
  
  @scala.inline
  implicit class CreateInputSecurityGroupResponseOps[Self <: CreateInputSecurityGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setSecurityGroup(value: InputSecurityGroup): Self = this.set("SecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroup: Self = this.set("SecurityGroup", js.undefined)
  }
}
