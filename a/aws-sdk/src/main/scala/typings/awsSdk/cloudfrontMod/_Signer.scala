package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Signer extends js.Object {
  /**
    * An AWS account that is included in the TrustedSigners complex type for this distribution. Valid values include:    self, which is the AWS account used to create the distribution.   An AWS account number.  
    */
  var AwsAccountNumber: js.UndefOr[String] = js.native
  /**
    * A complex type that lists the active CloudFront key pairs, if any, that are associated with AwsAccountNumber.
    */
  var KeyPairIds: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyPairIds] = js.native
}

object _Signer {
  @scala.inline
  def apply(AwsAccountNumber: String = null, KeyPairIds: KeyPairIds = null): _Signer = {
    val __obj = js.Dynamic.literal()
    if (AwsAccountNumber != null) __obj.updateDynamic("AwsAccountNumber")(AwsAccountNumber.asInstanceOf[js.Any])
    if (KeyPairIds != null) __obj.updateDynamic("KeyPairIds")(KeyPairIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Signer]
  }
}

