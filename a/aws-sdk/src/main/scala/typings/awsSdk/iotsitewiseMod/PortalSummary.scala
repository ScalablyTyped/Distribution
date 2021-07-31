package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalSummary extends StObject {
  
  /**
    * The date the portal was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The portal's description.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the portal.
    */
  var id: ID
  
  /**
    * The date the portal was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the portal.
    */
  var name: Name
  
  /**
    * The ARN of the service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more information, see Using service roles for AWS IoT SiteWise Monitor in the AWS IoT SiteWise User Guide.
    */
  var roleArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The URL for the AWS IoT SiteWise Monitor portal. You can use this URL to access portals that use AWS SSO for authentication. For portals that use IAM for authentication, you must use the CreatePresignedPortalUrl operation to create a URL that you can use to access the portal.
    */
  var startUrl: Url
  
  var status: PortalStatus
}
object PortalSummary {
  
  @scala.inline
  def apply(id: ID, name: Name, startUrl: Url, status: PortalStatus): PortalSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startUrl = startUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalSummary]
  }
  
  @scala.inline
  implicit class PortalSummaryMutableBuilder[Self <: PortalSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDate(value: Timestamp): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: ARN): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setStartUrl(value: Url): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PortalStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
