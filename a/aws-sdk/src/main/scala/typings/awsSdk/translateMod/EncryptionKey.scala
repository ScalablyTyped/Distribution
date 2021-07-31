package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionKey extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the encryption key being used to encrypt the custom terminology.
    */
  var Id: EncryptionKeyID
  
  /**
    * The type of encryption key used by Amazon Translate to encrypt custom terminologies.
    */
  var Type: EncryptionKeyType
}
object EncryptionKey {
  
  @scala.inline
  def apply(Id: EncryptionKeyID, Type: EncryptionKeyType): EncryptionKey = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKey]
  }
  
  @scala.inline
  implicit class EncryptionKeyMutableBuilder[Self <: EncryptionKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: EncryptionKeyID): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EncryptionKeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
