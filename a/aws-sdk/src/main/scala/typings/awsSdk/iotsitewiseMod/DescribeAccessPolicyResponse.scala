package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccessPolicyResponse extends js.Object {
  
  /**
    * The ARN of the access policy, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId} 
    */
  var accessPolicyArn: ARN = js.native
  
  /**
    * The date the access policy was created, in Unix epoch time.
    */
  var accessPolicyCreationDate: Timestamp = js.native
  
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID = js.native
  
  /**
    * The identity (AWS SSO user, AWS SSO group, or IAM user) to which this access policy applies.
    */
  var accessPolicyIdentity: Identity = js.native
  
  /**
    * The date the access policy was last updated, in Unix epoch time.
    */
  var accessPolicyLastUpdateDate: Timestamp = js.native
  
  /**
    * The access policy permission. Note that a project ADMINISTRATOR is also known as a project owner.
    */
  var accessPolicyPermission: Permission = js.native
  
  /**
    * The AWS IoT SiteWise Monitor resource (portal or project) to which this access policy provides access.
    */
  var accessPolicyResource: Resource = js.native
}
object DescribeAccessPolicyResponse {
  
  @scala.inline
  def apply(
    accessPolicyArn: ARN,
    accessPolicyCreationDate: Timestamp,
    accessPolicyId: ID,
    accessPolicyIdentity: Identity,
    accessPolicyLastUpdateDate: Timestamp,
    accessPolicyPermission: Permission,
    accessPolicyResource: Resource
  ): DescribeAccessPolicyResponse = {
    val __obj = js.Dynamic.literal(accessPolicyArn = accessPolicyArn.asInstanceOf[js.Any], accessPolicyCreationDate = accessPolicyCreationDate.asInstanceOf[js.Any], accessPolicyId = accessPolicyId.asInstanceOf[js.Any], accessPolicyIdentity = accessPolicyIdentity.asInstanceOf[js.Any], accessPolicyLastUpdateDate = accessPolicyLastUpdateDate.asInstanceOf[js.Any], accessPolicyPermission = accessPolicyPermission.asInstanceOf[js.Any], accessPolicyResource = accessPolicyResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPolicyResponse]
  }
  
  @scala.inline
  implicit class DescribeAccessPolicyResponseOps[Self <: DescribeAccessPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setAccessPolicyArn(value: ARN): Self = this.set("accessPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyCreationDate(value: Timestamp): Self = this.set("accessPolicyCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyId(value: ID): Self = this.set("accessPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyIdentity(value: Identity): Self = this.set("accessPolicyIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyLastUpdateDate(value: Timestamp): Self = this.set("accessPolicyLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyPermission(value: Permission): Self = this.set("accessPolicyPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyResource(value: Resource): Self = this.set("accessPolicyResource", value.asInstanceOf[js.Any])
  }
}
