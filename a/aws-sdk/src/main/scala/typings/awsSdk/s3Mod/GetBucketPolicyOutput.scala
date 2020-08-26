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
  def apply(): GetBucketPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketPolicyOutput]
  }
  @scala.inline
  implicit class GetBucketPolicyOutputOps[Self <: GetBucketPolicyOutput] (val x: Self) extends AnyVal {
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
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
  
}

