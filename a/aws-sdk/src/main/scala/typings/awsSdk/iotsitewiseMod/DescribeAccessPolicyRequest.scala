package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccessPolicyRequest extends js.Object {
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID = js.native
}

object DescribeAccessPolicyRequest {
  @scala.inline
  def apply(accessPolicyId: ID): DescribeAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPolicyRequest]
  }
}

