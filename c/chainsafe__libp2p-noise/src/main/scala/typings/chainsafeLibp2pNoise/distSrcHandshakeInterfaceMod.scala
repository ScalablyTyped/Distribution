package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.anon.Plaintext
import typings.chainsafeLibp2pNoise.distSrcHandshakeMod.NoiseSession
import typings.chainsafeLibp2pNoise.distSrcProtoPayloadMod.NoiseExtensions
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHandshakeInterfaceMod {
  
  @js.native
  trait IHandshake extends StObject {
    
    def decrypt(ciphertext: js.typedarray.Uint8Array, session: NoiseSession): Plaintext = js.native
    def decrypt(ciphertext: js.typedarray.Uint8Array, session: NoiseSession, dst: js.typedarray.Uint8Array): Plaintext = js.native
    
    def encrypt(plaintext: js.typedarray.Uint8Array, session: NoiseSession): js.typedarray.Uint8Array = js.native
    
    var remoteExtensions: NoiseExtensions = js.native
    
    var remotePeer: PeerId = js.native
    
    var session: NoiseSession = js.native
  }
}
