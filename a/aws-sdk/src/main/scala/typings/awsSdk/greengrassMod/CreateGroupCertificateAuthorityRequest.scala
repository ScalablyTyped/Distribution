package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupCertificateAuthorityRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
}
object CreateGroupCertificateAuthorityRequest {
  
  @scala.inline
  def apply(GroupId: string): CreateGroupCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit class CreateGroupCertificateAuthorityRequestMutableBuilder[Self <: CreateGroupCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
