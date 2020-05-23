package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPolicyResponse extends js.Object {
  /**
    * The ARN of the access policy, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId} 
    */
  var accessPolicyArn: ARN = js.native
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID = js.native
}

object CreateAccessPolicyResponse {
  @scala.inline
  def apply(accessPolicyArn: ARN, accessPolicyId: ID): CreateAccessPolicyResponse = {
    val __obj = js.Dynamic.literal(accessPolicyArn = accessPolicyArn.asInstanceOf[js.Any], accessPolicyId = accessPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPolicyResponse]
  }
}

