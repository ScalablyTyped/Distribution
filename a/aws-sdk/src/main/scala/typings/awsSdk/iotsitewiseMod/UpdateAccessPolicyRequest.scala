package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAccessPolicyRequest extends StObject {
  
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID = js.native
  
  /**
    * The identity for this access policy. Choose an AWS SSO user, an AWS SSO group, or an IAM user.
    */
  var accessPolicyIdentity: Identity = js.native
  
  /**
    * The permission level for this access policy. Note that a project ADMINISTRATOR is also known as a project owner.
    */
  var accessPolicyPermission: Permission = js.native
  
  /**
    * The AWS IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
    */
  var accessPolicyResource: Resource = js.native
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
}
object UpdateAccessPolicyRequest {
  
  @scala.inline
  def apply(
    accessPolicyId: ID,
    accessPolicyIdentity: Identity,
    accessPolicyPermission: Permission,
    accessPolicyResource: Resource
  ): UpdateAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any], accessPolicyIdentity = accessPolicyIdentity.asInstanceOf[js.Any], accessPolicyPermission = accessPolicyPermission.asInstanceOf[js.Any], accessPolicyResource = accessPolicyResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccessPolicyRequest]
  }
  
  @scala.inline
  implicit class UpdateAccessPolicyRequestMutableBuilder[Self <: UpdateAccessPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicyId(value: ID): Self = StObject.set(x, "accessPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyIdentity(value: Identity): Self = StObject.set(x, "accessPolicyIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyPermission(value: Permission): Self = StObject.set(x, "accessPolicyPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyResource(value: Resource): Self = StObject.set(x, "accessPolicyResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
