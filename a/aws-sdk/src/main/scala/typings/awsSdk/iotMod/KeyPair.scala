package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPair extends StObject {
  
  /**
    * The private key.
    */
  var PrivateKey: js.UndefOr[typings.awsSdk.iotMod.PrivateKey] = js.native
  
  /**
    * The public key.
    */
  var PublicKey: js.UndefOr[typings.awsSdk.iotMod.PublicKey] = js.native
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
    def setPrivateKey(value: PrivateKey): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyUndefined: Self = StObject.set(x, "PrivateKey", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKey): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
