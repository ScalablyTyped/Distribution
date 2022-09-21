package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.handshakeMod.CipherState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cs1 extends StObject {
    
    var cs1: CipherState
    
    var cs2: CipherState
  }
  object Cs1 {
    
    inline def apply(cs1: CipherState, cs2: CipherState): Cs1 = {
      val __obj = js.Dynamic.literal(cs1 = cs1.asInstanceOf[js.Any], cs2 = cs2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cs1]
    }
    
    extension [Self <: Cs1](x: Self) {
      
      inline def setCs1(value: CipherState): Self = StObject.set(x, "cs1", value.asInstanceOf[js.Any])
      
      inline def setCs2(value: CipherState): Self = StObject.set(x, "cs2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plaintext extends StObject {
    
    var plaintext: js.typedarray.Uint8Array
    
    var valid: Boolean
  }
  object Plaintext {
    
    inline def apply(plaintext: js.typedarray.Uint8Array, valid: Boolean): Plaintext = {
      val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plaintext]
    }
    
    extension [Self <: Plaintext](x: Self) {
      
      inline def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
