package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.basicMod.uint64
import typings.chainsafeLibp2pNoise.libp2pMod.KeyPair
import typings.chainsafeLibp2pNoise.nonceMod.Nonce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeMod {
  
  trait CipherState extends StObject {
    
    var k: js.typedarray.Uint8Array
    
    var n: Nonce
  }
  object CipherState {
    
    inline def apply(k: js.typedarray.Uint8Array, n: Nonce): CipherState = {
      val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[CipherState]
    }
    
    extension [Self <: CipherState](x: Self) {
      
      inline def setK(value: js.typedarray.Uint8Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setN(value: Nonce): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  trait HandshakeState extends StObject {
    
    var e: js.UndefOr[KeyPair] = js.undefined
    
    var psk: js.typedarray.Uint8Array
    
    var re: js.typedarray.Uint8Array
    
    var rs: js.typedarray.Uint8Array
    
    var s: KeyPair
    
    var ss: SymmetricState
  }
  object HandshakeState {
    
    inline def apply(
      psk: js.typedarray.Uint8Array,
      re: js.typedarray.Uint8Array,
      rs: js.typedarray.Uint8Array,
      s: KeyPair,
      ss: SymmetricState
    ): HandshakeState = {
      val __obj = js.Dynamic.literal(psk = psk.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any], rs = rs.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandshakeState]
    }
    
    extension [Self <: HandshakeState](x: Self) {
      
      inline def setE(value: KeyPair): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setPsk(value: js.typedarray.Uint8Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
      
      inline def setRe(value: js.typedarray.Uint8Array): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
      
      inline def setRs(value: js.typedarray.Uint8Array): Self = StObject.set(x, "rs", value.asInstanceOf[js.Any])
      
      inline def setS(value: KeyPair): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSs(value: SymmetricState): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    }
  }
  
  type Hkdf = js.Tuple3[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array]
  
  trait INoisePayload extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    var identityKey: js.typedarray.Uint8Array
    
    var identitySig: js.typedarray.Uint8Array
  }
  object INoisePayload {
    
    inline def apply(
      data: js.typedarray.Uint8Array,
      identityKey: js.typedarray.Uint8Array,
      identitySig: js.typedarray.Uint8Array
    ): INoisePayload = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], identityKey = identityKey.asInstanceOf[js.Any], identitySig = identitySig.asInstanceOf[js.Any])
      __obj.asInstanceOf[INoisePayload]
    }
    
    extension [Self <: INoisePayload](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIdentityKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identityKey", value.asInstanceOf[js.Any])
      
      inline def setIdentitySig(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identitySig", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageBuffer extends StObject {
    
    var ciphertext: js.typedarray.Uint8Array
    
    @JSName("ne")
    var ne_FMessageBuffer: js.typedarray.Uint8Array
    
    var ns: js.typedarray.Uint8Array
  }
  object MessageBuffer {
    
    inline def apply(ciphertext: js.typedarray.Uint8Array, ne_ : js.typedarray.Uint8Array, ns: js.typedarray.Uint8Array): MessageBuffer = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageBuffer]
    }
    
    extension [Self <: MessageBuffer](x: Self) {
      
      inline def setCiphertext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setNe_(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      inline def setNs(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoiseSession extends StObject {
    
    var cs1: js.UndefOr[CipherState] = js.undefined
    
    var cs2: js.UndefOr[CipherState] = js.undefined
    
    var h: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var hs: HandshakeState
    
    var i: Boolean
    
    var mc: uint64
  }
  object NoiseSession {
    
    inline def apply(hs: HandshakeState, i: Boolean, mc: uint64): NoiseSession = {
      val __obj = js.Dynamic.literal(hs = hs.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], mc = mc.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoiseSession]
    }
    
    extension [Self <: NoiseSession](x: Self) {
      
      inline def setCs1(value: CipherState): Self = StObject.set(x, "cs1", value.asInstanceOf[js.Any])
      
      inline def setCs1Undefined: Self = StObject.set(x, "cs1", js.undefined)
      
      inline def setCs2(value: CipherState): Self = StObject.set(x, "cs2", value.asInstanceOf[js.Any])
      
      inline def setCs2Undefined: Self = StObject.set(x, "cs2", js.undefined)
      
      inline def setH(value: js.typedarray.Uint8Array): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setHs(value: HandshakeState): Self = StObject.set(x, "hs", value.asInstanceOf[js.Any])
      
      inline def setI(value: Boolean): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setMc(value: uint64): Self = StObject.set(x, "mc", value.asInstanceOf[js.Any])
    }
  }
  
  trait SymmetricState extends StObject {
    
    var ck: js.typedarray.Uint8Array
    
    var cs: CipherState
    
    var h: js.typedarray.Uint8Array
  }
  object SymmetricState {
    
    inline def apply(ck: js.typedarray.Uint8Array, cs: CipherState, h: js.typedarray.Uint8Array): SymmetricState = {
      val __obj = js.Dynamic.literal(ck = ck.asInstanceOf[js.Any], cs = cs.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymmetricState]
    }
    
    extension [Self <: SymmetricState](x: Self) {
      
      inline def setCk(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ck", value.asInstanceOf[js.Any])
      
      inline def setCs(value: CipherState): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
      
      inline def setH(value: js.typedarray.Uint8Array): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    }
  }
}
