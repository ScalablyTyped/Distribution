package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshareApplicationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string
  
  /**
    * The AWS Organization ID to unshare the application from.
    */
  var OrganizationId: string
}
object UnshareApplicationRequest {
  
  @scala.inline
  def apply(ApplicationId: string, OrganizationId: string): UnshareApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshareApplicationRequest]
  }
  
  @scala.inline
  implicit class UnshareApplicationRequestMutableBuilder[Self <: UnshareApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: string): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
