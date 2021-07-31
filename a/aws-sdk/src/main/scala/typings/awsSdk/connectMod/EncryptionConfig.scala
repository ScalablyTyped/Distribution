package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  /**
    * The type of encryption.
    */
  var EncryptionType: typings.awsSdk.connectMod.EncryptionType
  
  /**
    * The identifier of the encryption key.
    */
  var KeyId: typings.awsSdk.connectMod.KeyId
}
object EncryptionConfig {
  
  @scala.inline
  def apply(EncryptionType: EncryptionType, KeyId: KeyId): EncryptionConfig = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  @scala.inline
  implicit class EncryptionConfigMutableBuilder[Self <: EncryptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: KeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
  }
}
