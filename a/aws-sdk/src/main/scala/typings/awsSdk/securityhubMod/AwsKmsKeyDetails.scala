package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsKmsKeyDetails extends StObject {
  
  /**
    * The twelve-digit account ID of the AWS account that owns the CMK.
    */
  var AWSAccountId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the CMK was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreationDate: js.UndefOr[Double] = js.native
  
  /**
    * A description of the key.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The globally unique identifier for the CMK.
    */
  var KeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
    */
  var KeyManager: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The state of the CMK.
    */
  var KeyState: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source of the CMK's key material. When this value is AWS_KMS, AWS KMS created the key material. When this value is EXTERNAL, the key material was imported from your existing key management infrastructure or the CMK lacks key material. When this value is AWS_CLOUDHSM, the key material was created in the AWS CloudHSM cluster associated with a custom key store.
    */
  var Origin: js.UndefOr[NonEmptyString] = js.native
}
object AwsKmsKeyDetails {
  
  @scala.inline
  def apply(): AwsKmsKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsKmsKeyDetails]
  }
  
  @scala.inline
  implicit class AwsKmsKeyDetailsMutableBuilder[Self <: AwsKmsKeyDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAWSAccountId(value: NonEmptyString): Self = StObject.set(x, "AWSAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWSAccountIdUndefined: Self = StObject.set(x, "AWSAccountId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setKeyId(value: NonEmptyString): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setKeyManager(value: NonEmptyString): Self = StObject.set(x, "KeyManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyManagerUndefined: Self = StObject.set(x, "KeyManager", js.undefined)
    
    @scala.inline
    def setKeyState(value: NonEmptyString): Self = StObject.set(x, "KeyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyStateUndefined: Self = StObject.set(x, "KeyState", js.undefined)
    
    @scala.inline
    def setOrigin(value: NonEmptyString): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
  }
}
