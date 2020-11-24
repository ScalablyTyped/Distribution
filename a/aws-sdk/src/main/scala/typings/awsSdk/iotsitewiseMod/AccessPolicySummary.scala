package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPolicySummary extends js.Object {
  
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
  implicit class AccessPolicySummaryOps[Self <: AccessPolicySummary] (val x: Self) extends AnyVal {
    
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
    def setId(value: ID): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: Permission): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setLastUpdateDate(value: Timestamp): Self = this.set("lastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateDate: Self = this.set("lastUpdateDate", js.undefined)
  }
}
