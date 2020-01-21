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
}

