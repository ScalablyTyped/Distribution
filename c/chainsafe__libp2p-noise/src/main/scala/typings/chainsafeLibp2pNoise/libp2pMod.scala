package typings.chainsafeLibp2pNoise

import typings.libp2pInterfaceConnectionEncrypter.mod.ConnectionEncrypter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pMod {
  
  @js.native
  trait INoiseConnection
    extends StObject
       with ConnectionEncrypter {
    
    var remoteEarlyData: js.UndefOr[js.Function0[js.typedarray.Uint8Array]] = js.native
  }
  
  trait KeyPair extends StObject {
    
    var privateKey: js.typedarray.Uint8Array
    
    var publicKey: js.typedarray.Uint8Array
  }
  object KeyPair {
    
    inline def apply(privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): KeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPair]
    }
    
    extension [Self <: KeyPair](x: Self) {
      
      inline def setPrivateKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
