package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcProtoPayloadMod.NoiseExtensions
import typings.chainsafeLibp2pNoise.distSrcProtoPayloadMod.NoiseHandshakePayload
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHandshakePayload(libp2pPublicKey: js.typedarray.Uint8Array, signedPayload: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createHandshakePayload")(libp2pPublicKey.asInstanceOf[js.Any], signedPayload.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def createHandshakePayload(
    libp2pPublicKey: js.typedarray.Uint8Array,
    signedPayload: js.typedarray.Uint8Array,
    extensions: NoiseExtensions
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createHandshakePayload")(libp2pPublicKey.asInstanceOf[js.Any], signedPayload.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decodePayload(payload: js.typedarray.Uint8Array): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePayload")(payload.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
  
  inline def getHandshakePayload(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandshakePayload")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getPayload(localPeer: PeerId, staticPublicKey: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(localPeer.asInstanceOf[js.Any], staticPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def getPayload(localPeer: PeerId, staticPublicKey: js.typedarray.Uint8Array, extensions: NoiseExtensions): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(localPeer.asInstanceOf[js.Any], staticPublicKey.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def getPeerIdFromPayload(payload: NoiseHandshakePayload): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeerIdFromPayload")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  inline def isValidPublicKey(pk: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublicKey")(pk.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def signPayload(peerId: PeerId, payload: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("signPayload")(peerId.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def verifySignedPayload(noiseStaticKey: js.typedarray.Uint8Array, payload: NoiseHandshakePayload, remotePeer: PeerId): js.Promise[PeerId] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignedPayload")(noiseStaticKey.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], remotePeer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PeerId]]
}
