package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.anon.Plaintext
import typings.chainsafeLibp2pNoise.handshakeMod.NoiseSession
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeInterfaceMod {
  
  trait IHandshake extends StObject {
    
    def decrypt(ciphertext: js.typedarray.Uint8Array, session: NoiseSession): Plaintext
    
    def encrypt(plaintext: js.typedarray.Uint8Array, session: NoiseSession): js.typedarray.Uint8Array
    
    var remoteEarlyData: js.typedarray.Uint8Array
    
    var remotePeer: PeerId
    
    var session: NoiseSession
  }
  object IHandshake {
    
    inline def apply(
      decrypt: (js.typedarray.Uint8Array, NoiseSession) => Plaintext,
      encrypt: (js.typedarray.Uint8Array, NoiseSession) => js.typedarray.Uint8Array,
      remoteEarlyData: js.typedarray.Uint8Array,
      remotePeer: PeerId,
      session: NoiseSession
    ): IHandshake = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), remoteEarlyData = remoteEarlyData.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHandshake]
    }
    
    extension [Self <: IHandshake](x: Self) {
      
      inline def setDecrypt(value: (js.typedarray.Uint8Array, NoiseSession) => Plaintext): Self = StObject.set(x, "decrypt", js.Any.fromFunction2(value))
      
      inline def setEncrypt(value: (js.typedarray.Uint8Array, NoiseSession) => js.typedarray.Uint8Array): Self = StObject.set(x, "encrypt", js.Any.fromFunction2(value))
      
      inline def setRemoteEarlyData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "remoteEarlyData", value.asInstanceOf[js.Any])
      
      inline def setRemotePeer(value: PeerId): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
      
      inline def setSession(value: NoiseSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
