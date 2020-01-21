package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketPolicyOutput extends js.Object {
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: js.UndefOr[typings.awsSdk.s3Mod.Policy] = js.native
}

object GetBucketPolicyOutput {
  @scala.inline
  def apply(Policy: Policy = null): GetBucketPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketPolicyOutput]
  }
}

