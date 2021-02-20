package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPolicySummary extends StObject {
  
  /**
    * The date the access policy was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the access policy.
    */
  var id: ID = js.native
  
  /**
    * The identity (an AWS SSO user, an AWS SSO group, or an IAM user).
    */
  var identity: Identity = js.native
  
  /**
    * The date the access policy was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The permissions for the access policy. Note that a project ADMINISTRATOR is also known as a project owner.
    */
  var permission: Permission = js.native
  
  /**
    * The AWS IoT SiteWise Monitor resource (a portal or project).
    */
  var resource: Resource = js.native
}
object AccessPolicySummary {
  
  @scala.inline
  def apply(id: ID, identity: Identity, permission: Permission, resource: Resource): AccessPolicySummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPolicySummary]
  }
  
  @scala.inline
  implicit class AccessPolicySummaryMutableBuilder[Self <: AccessPolicySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDate(value: Timestamp): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
    
    @scala.inline
    def setPermission(value: Permission): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
