package typings.awsSdk.cloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CannedPolicy extends js.Object {
  var `CloudFront-Expires`: Double = js.native
  var `CloudFront-Key-Pair-Id`: String = js.native
  var `CloudFront-Signature`: String = js.native
}

object CannedPolicy {
  @scala.inline
  def apply(`CloudFront-Expires`: Double, `CloudFront-Key-Pair-Id`: String, `CloudFront-Signature`: String): CannedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloudFront-Expires")(`CloudFront-Expires`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CannedPolicy]
  }
}

