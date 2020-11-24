package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _Signer extends js.Object {
  
  /**
    * An AWS account number that contains active CloudFront key pairs that CloudFront can use to verify the signatures of signed URLs and signed cookies. If the AWS account that owns the key pairs is the same account that owns the CloudFront distribution, the value of this field is self.
    */
  var AwsAccountNumber: js.UndefOr[String] = js.native
  
  /**
    * A list of CloudFront key pair identifiers.
    */
  var KeyPairIds: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyPairIds] = js.native
}
object _Signer {
  
  @scala.inline
  def apply(): _Signer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Signer]
  }
  
  @scala.inline
  implicit class _SignerOps[Self <: _Signer] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountNumber(value: String): Self = this.set("AwsAccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountNumber: Self = this.set("AwsAccountNumber", js.undefined)
    
    @scala.inline
    def setKeyPairIds(value: KeyPairIds): Self = this.set("KeyPairIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPairIds: Self = this.set("KeyPairIds", js.undefined)
  }
}
