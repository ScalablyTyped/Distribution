package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedgerEncryptionDescription extends StObject {
  
  /**
    * The current state of encryption at rest for the ledger. This can be one of the following values:    ENABLED: Encryption is fully enabled using the specified key.    UPDATING: The ledger is actively processing the specified key change. Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while the key change is being processed. The amount of time it takes to update a key varies depending on the ledger size.    KMS_KEY_INACCESSIBLE: The specified customer managed KMS key is not accessible, and the ledger is impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a ledger is impaired, it is not accessible and does not accept any read or write requests. An impaired ledger automatically returns to an active state after you restore the grants on the key, or re-enable the key that was disabled. However, deleting a customer managed KMS key is irreversible. After a key is deleted, you can no longer access the ledgers that are protected with that key, and the data becomes unrecoverable permanently.  
    */
  var EncryptionStatus: typings.awsSdk.qldbMod.EncryptionStatus
  
  /**
    * The date and time, in epoch time format, when the KMS key first became inaccessible, in the case of an error. (Epoch time format is the number of seconds that have elapsed since 12:00:00 AM January 1, 1970 UTC.) This parameter is undefined if the KMS key is accessible.
    */
  var InaccessibleKmsKeyDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the customer managed KMS key that the ledger uses for encryption at rest. If this parameter is undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
    */
  var KmsKeyArn: Arn
}
object LedgerEncryptionDescription {
  
  inline def apply(EncryptionStatus: EncryptionStatus, KmsKeyArn: Arn): LedgerEncryptionDescription = {
    val __obj = js.Dynamic.literal(EncryptionStatus = EncryptionStatus.asInstanceOf[js.Any], KmsKeyArn = KmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerEncryptionDescription]
  }
  
  extension [Self <: LedgerEncryptionDescription](x: Self) {
    
    inline def setEncryptionStatus(value: EncryptionStatus): Self = StObject.set(x, "EncryptionStatus", value.asInstanceOf[js.Any])
    
    inline def setInaccessibleKmsKeyDateTime(value: js.Date): Self = StObject.set(x, "InaccessibleKmsKeyDateTime", value.asInstanceOf[js.Any])
    
    inline def setInaccessibleKmsKeyDateTimeUndefined: Self = StObject.set(x, "InaccessibleKmsKeyDateTime", js.undefined)
    
    inline def setKmsKeyArn(value: Arn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
  }
}
