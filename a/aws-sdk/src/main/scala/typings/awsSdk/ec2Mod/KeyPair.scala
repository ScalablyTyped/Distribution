package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPair extends StObject {
  
  /**
    * The SHA-1 digest of the DER encoded private key.
    */
  var KeyFingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * An unencrypted PEM encoded RSA private key.
    */
  var KeyMaterial: js.UndefOr[SensitiveUserData] = js.undefined
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags applied to the key pair.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object KeyPair {
  
  @scala.inline
  def apply(): KeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPair]
  }
  
  @scala.inline
  implicit class KeyPairMutableBuilder[Self <: KeyPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyFingerprint(value: String): Self = StObject.set(x, "KeyFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFingerprintUndefined: Self = StObject.set(x, "KeyFingerprint", js.undefined)
    
    @scala.inline
    def setKeyMaterial(value: SensitiveUserData): Self = StObject.set(x, "KeyMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMaterialUndefined: Self = StObject.set(x, "KeyMaterial", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    @scala.inline
    def setKeyPairId(value: String): Self = StObject.set(x, "KeyPairId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairIdUndefined: Self = StObject.set(x, "KeyPairId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
