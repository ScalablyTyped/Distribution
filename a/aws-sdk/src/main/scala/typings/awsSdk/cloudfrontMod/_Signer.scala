package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Signer extends StObject {
  
  /**
    * An AWS account number that contains active CloudFront key pairs that CloudFront can use to verify the signatures of signed URLs and signed cookies. If the AWS account that owns the key pairs is the same account that owns the CloudFront distribution, the value of this field is self.
    */
  var AwsAccountNumber: js.UndefOr[String] = js.undefined
  
  /**
    * A list of CloudFront key pair identifiers.
    */
  var KeyPairIds: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyPairIds] = js.undefined
}
object _Signer {
  
  @scala.inline
  def apply(): _Signer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Signer]
  }
  
  @scala.inline
  implicit class _SignerMutableBuilder[Self <: _Signer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountNumber(value: String): Self = StObject.set(x, "AwsAccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountNumberUndefined: Self = StObject.set(x, "AwsAccountNumber", js.undefined)
    
    @scala.inline
    def setKeyPairIds(value: KeyPairIds): Self = StObject.set(x, "KeyPairIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairIdsUndefined: Self = StObject.set(x, "KeyPairIds", js.undefined)
  }
}
