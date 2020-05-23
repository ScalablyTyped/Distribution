package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The AWS SSO identity (user or group) to which this access policy applies.
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
}

