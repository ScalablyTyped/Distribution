package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ACTIVE
import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.KMS
import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.NONE
import typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.UPDATING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEncryptionConfigMod {
  
  trait EncryptionConfig extends StObject {
    
    /**
      * <p>The ID of the customer master key (CMK) used for encryption, if applicable.</p>
      */
    var KeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a combination of the new and old settings.</p>
      */
    var Status: js.UndefOr[UPDATING | ACTIVE | String] = js.undefined
    
    /**
      * <p>The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for default encryption.</p>
      */
    var Type: js.UndefOr[NONE | KMS | String] = js.undefined
  }
  object EncryptionConfig {
    
    inline def apply(): EncryptionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptionConfig] (val x: Self) extends AnyVal {
      
      inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
      
      inline def setStatus(value: UPDATING | ACTIVE | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
      
      inline def setType(value: NONE | KMS | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  type UnmarshalledEncryptionConfig = EncryptionConfig
}
