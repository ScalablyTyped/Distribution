package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptSignatureMod {
  
  @JSImport("bitcoinjs-lib/types/script_signature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: Buffer): ScriptSignature = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[ScriptSignature]
  
  inline def encode(signature: Buffer, hashType: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(signature.asInstanceOf[js.Any], hashType.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait ScriptSignature extends StObject {
    
    var hashType: Double
    
    var signature: Buffer
  }
  object ScriptSignature {
    
    inline def apply(hashType: Double, signature: Buffer): ScriptSignature = {
      val __obj = js.Dynamic.literal(hashType = hashType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptSignature]
    }
    
    extension [Self <: ScriptSignature](x: Self) {
      
      inline def setHashType(value: Double): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
