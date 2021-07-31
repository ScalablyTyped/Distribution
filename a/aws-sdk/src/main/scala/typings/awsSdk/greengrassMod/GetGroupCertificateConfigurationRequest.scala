package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupCertificateConfigurationRequest extends StObject {
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
}
object GetGroupCertificateConfigurationRequest {
  
  @scala.inline
  def apply(GroupId: string): GetGroupCertificateConfigurationRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupCertificateConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetGroupCertificateConfigurationRequestMutableBuilder[Self <: GetGroupCertificateConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
