package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSsekmsMod {
  
  type UnmarshalledSSEKMS = _SSEKMS
  
  trait _SSEKMS extends StObject {
    
    /**
      * <p>Specifies the ID of the AWS Key Management Service (KMS) master encryption key to use for encrypting Inventory reports.</p>
      */
    var KeyId: String
  }
  object _SSEKMS {
    
    inline def apply(KeyId: String): _SSEKMS = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[_SSEKMS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _SSEKMS] (val x: Self) extends AnyVal {
      
      inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    }
  }
}
