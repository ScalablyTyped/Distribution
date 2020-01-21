package typings.awsSdk.cloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPolicy extends js.Object {
  var `CloudFront-Key-Pair-Id`: String = js.native
  var `CloudFront-Policy`: String = js.native
  var `CloudFront-Signature`: String = js.native
}

object CustomPolicy {
  @scala.inline
  def apply(`CloudFront-Key-Pair-Id`: String, `CloudFront-Policy`: String, `CloudFront-Signature`: String): CustomPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Policy")(`CloudFront-Policy`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPolicy]
  }
}

