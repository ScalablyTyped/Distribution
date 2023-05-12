package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSESpecification extends StObject {
  
  /**
    * <p>Indicates whether server-side encryption is done using an Amazon Web Services managed
    *             key or an Amazon Web Services owned key. If enabled (true), server-side encryption type
    *             is set to <code>KMS</code> and an Amazon Web Services managed key is used (KMS charges apply). If disabled (false) or not specified, server-side
    *             encryption is set to Amazon Web Services owned key.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p>The KMS key that should be used for the KMS encryption.
    *             To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN.
    *             Note that you should only provide this parameter if the key is different from the
    *             default DynamoDB key <code>alias/aws/dynamodb</code>.</p>
    */
  var KMSMasterKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Server-side encryption type. The only supported value is:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>KMS</code> - Server-side encryption that uses Key Management Service. The
    *                     key is stored in your account and is managed by KMS (KMS charges apply).</p>
    *             </li>
    *          </ul>
    */
  var SSEType: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.SSEType | String] = js.undefined
}
object SSESpecification {
  
  inline def apply(): SSESpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSESpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SSESpecification] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setKMSMasterKeyId(value: String): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
    
    inline def setSSEType(value: SSEType | String): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
    
    inline def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
  }
}
