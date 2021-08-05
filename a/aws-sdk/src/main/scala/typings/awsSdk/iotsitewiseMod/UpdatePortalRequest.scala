package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortalRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The AWS administrator's contact email address.
    */
  var portalContactEmail: Email
  
  /**
    * A new description for the portal.
    */
  var portalDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the portal to update.
    */
  var portalId: ID
  
  var portalLogoImage: js.UndefOr[Image] = js.undefined
  
  /**
    * A new friendly name for the portal.
    */
  var portalName: Name
  
  /**
    * The ARN of a service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more information, see Using service roles for AWS IoT SiteWise Monitor in the AWS IoT SiteWise User Guide.
    */
  var roleArn: ARN
}
object UpdatePortalRequest {
  
  inline def apply(portalContactEmail: Email, portalId: ID, portalName: Name, roleArn: ARN): UpdatePortalRequest = {
    val __obj = js.Dynamic.literal(portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalId = portalId.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalRequest]
  }
  
  extension [Self <: UpdatePortalRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setPortalContactEmail(value: Email): Self = StObject.set(x, "portalContactEmail", value.asInstanceOf[js.Any])
    
    inline def setPortalDescription(value: Description): Self = StObject.set(x, "portalDescription", value.asInstanceOf[js.Any])
    
    inline def setPortalDescriptionUndefined: Self = StObject.set(x, "portalDescription", js.undefined)
    
    inline def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
    
    inline def setPortalLogoImage(value: Image): Self = StObject.set(x, "portalLogoImage", value.asInstanceOf[js.Any])
    
    inline def setPortalLogoImageUndefined: Self = StObject.set(x, "portalLogoImage", js.undefined)
    
    inline def setPortalName(value: Name): Self = StObject.set(x, "portalName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: ARN): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
