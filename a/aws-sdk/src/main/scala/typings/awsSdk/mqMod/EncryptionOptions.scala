package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionOptions extends StObject {
  
  /**
    * The symmetric customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt your data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
    */
  var KmsKeyId: js.UndefOr[string] = js.native
  
  /**
    * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS).
    */
  var UseAwsOwnedKey: boolean = js.native
}
object EncryptionOptions {
  
  @scala.inline
  def apply(UseAwsOwnedKey: boolean): EncryptionOptions = {
    val __obj = js.Dynamic.literal(UseAwsOwnedKey = UseAwsOwnedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionOptions]
  }
  
  @scala.inline
  implicit class EncryptionOptionsMutableBuilder[Self <: EncryptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: string): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setUseAwsOwnedKey(value: boolean): Self = StObject.set(x, "UseAwsOwnedKey", value.asInstanceOf[js.Any])
  }
}
