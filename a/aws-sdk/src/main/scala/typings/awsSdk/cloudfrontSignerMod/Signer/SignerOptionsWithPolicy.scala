package typings.awsSdk.cloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignerOptionsWithPolicy extends js.Object {
  /**
    * A CloudFront JSON policy. Required unless you pass in a url and an expiry time. 
    */
  var policy: String = js.native
}

object SignerOptionsWithPolicy {
  @scala.inline
  def apply(policy: String): SignerOptionsWithPolicy = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerOptionsWithPolicy]
  }
  @scala.inline
  implicit class SignerOptionsWithPolicyOps[Self <: SignerOptionsWithPolicy] (val x: Self) extends AnyVal {
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
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
  
}

