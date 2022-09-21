package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionAtRestOptions extends StObject {
  
  /**
    * The option to enable encryption at rest.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The KMS key ID for encryption at rest options.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.opensearchMod.KmsKeyId] = js.undefined
}
object EncryptionAtRestOptions {
  
  inline def apply(): EncryptionAtRestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionAtRestOptions]
  }
  
  extension [Self <: EncryptionAtRestOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
