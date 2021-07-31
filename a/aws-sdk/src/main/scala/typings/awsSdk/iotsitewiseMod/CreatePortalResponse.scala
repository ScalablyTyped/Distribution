package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePortalResponse extends StObject {
  
  /**
    * The ARN of the portal, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId} 
    */
  var portalArn: ARN
  
  /**
    * The ID of the created portal.
    */
  var portalId: ID
  
  /**
    * The URL for the AWS IoT SiteWise Monitor portal. You can use this URL to access portals that use AWS SSO for authentication. For portals that use IAM for authentication, you must use the CreatePresignedPortalUrl operation to create a URL that you can use to access the portal.
    */
  var portalStartUrl: Url
  
  /**
    * The status of the portal, which contains a state (CREATING after successfully calling this operation) and any error message.
    */
  var portalStatus: PortalStatus
  
  /**
    * The associated AWS SSO application ID, if the portal uses AWS SSO.
    */
  var ssoApplicationId: SSOApplicationId
}
object CreatePortalResponse {
  
  @scala.inline
  def apply(
    portalArn: ARN,
    portalId: ID,
    portalStartUrl: Url,
    portalStatus: PortalStatus,
    ssoApplicationId: SSOApplicationId
  ): CreatePortalResponse = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], portalId = portalId.asInstanceOf[js.Any], portalStartUrl = portalStartUrl.asInstanceOf[js.Any], portalStatus = portalStatus.asInstanceOf[js.Any], ssoApplicationId = ssoApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortalResponse]
  }
  
  @scala.inline
  implicit class CreatePortalResponseMutableBuilder[Self <: CreatePortalResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalStartUrl(value: Url): Self = StObject.set(x, "portalStartUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalStatus(value: PortalStatus): Self = StObject.set(x, "portalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsoApplicationId(value: SSOApplicationId): Self = StObject.set(x, "ssoApplicationId", value.asInstanceOf[js.Any])
  }
}
