package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLedgerRequest extends StObject {
  
  /**
    * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature is enabled (true) by default. If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it by calling the UpdateLedger operation to set the flag to false.
    */
  var DeletionProtection: js.UndefOr[typings.awsSdk.qldbMod.DeletionProtection] = js.undefined
  
  /**
    * The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more information, see Encryption at rest in the Amazon QLDB Developer Guide. Use one of the following options to specify this parameter:    AWS_OWNED_KMS_KEY: Use an KMS key that is owned and managed by Amazon Web Services on your behalf.    Undefined: Make no changes to the KMS key of the ledger.    A valid symmetric customer managed KMS key: Use the specified KMS key in your account that you create, own, and manage. Amazon QLDB does not support asymmetric keys. For more information, see Using symmetric and asymmetric keys in the Key Management Service Developer Guide.   To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a key in a different Amazon Web Services account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    For more information, see Key identifiers (KeyId) in the Key Management Service Developer Guide.
    */
  var KmsKey: js.UndefOr[typings.awsSdk.qldbMod.KmsKey] = js.undefined
  
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
}
object UpdateLedgerRequest {
  
  inline def apply(Name: LedgerName): UpdateLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLedgerRequest]
  }
  
  extension [Self <: UpdateLedgerRequest](x: Self) {
    
    inline def setDeletionProtection(value: DeletionProtection): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setKmsKey(value: KmsKey): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "KmsKey", js.undefined)
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
