package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPairInfo extends StObject {
  
  /**
    * If you used CreateKeyPair to create the key pair, this is the SHA-1 digest of the DER encoded private key. If you used ImportKeyPair to provide AWS the public key, this is the MD5 public key fingerprint as specified in section 4 of RFC4716.
    */
  var KeyFingerprint: js.UndefOr[String] = js.native
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[String] = js.native
  
  /**
    * Any tags applied to the key pair.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object KeyPairInfo {
  
  @scala.inline
  def apply(): KeyPairInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPairInfo]
  }
  
  @scala.inline
  implicit class KeyPairInfoMutableBuilder[Self <: KeyPairInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyFingerprint(value: String): Self = StObject.set(x, "KeyFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFingerprintUndefined: Self = StObject.set(x, "KeyFingerprint", js.undefined)
    
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
