package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSESpecification extends StObject {
  
  /**
    * Indicates whether server-side encryption is done using an Amazon Web Services managed key or an Amazon Web Services owned key. If enabled (true), server-side encryption type is set to KMS and an Amazon Web Services managed key is used (KMS charges apply). If disabled (false) or not specified, server-side encryption is set to Amazon Web Services owned key.
    */
  var Enabled: js.UndefOr[SSEEnabled] = js.undefined
  
  /**
    * The KMS key that should be used for the KMS encryption. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.KMSMasterKeyId] = js.undefined
  
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses Key Management Service. The key is stored in your account and is managed by KMS (KMS charges apply).  
    */
  var SSEType: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.SSEType] = js.undefined
}
object SSESpecification {
  
  inline def apply(): SSESpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSESpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SSESpecification] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: SSEEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
    
    inline def setSSEType(value: SSEType): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
    
    inline def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
  }
}
