package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionKey extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the encryption key being used to encrypt this object.
    */
  var Id: EncryptionKeyID
  
  /**
    * The type of encryption key used by Amazon Translate to encrypt this object.
    */
  var Type: EncryptionKeyType
}
object EncryptionKey {
  
  inline def apply(Id: EncryptionKeyID, Type: EncryptionKeyType): EncryptionKey = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKey]
  }
  
  extension [Self <: EncryptionKey](x: Self) {
    
    inline def setId(value: EncryptionKeyID): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setType(value: EncryptionKeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
