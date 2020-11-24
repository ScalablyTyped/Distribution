package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGroupCertificateAuthorityRequest extends js.Object {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}
object CreateGroupCertificateAuthorityRequest {
  
  @scala.inline
  def apply(GroupId: string): CreateGroupCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit class CreateGroupCertificateAuthorityRequestOps[Self <: CreateGroupCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: string): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientToken(value: string): Self = this.set("AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmznClientToken: Self = this.set("AmznClientToken", js.undefined)
  }
}
