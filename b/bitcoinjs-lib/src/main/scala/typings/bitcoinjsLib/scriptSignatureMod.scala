package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptSignatureMod {
  
  @JSImport("bitcoinjs-lib/types/script_signature", "decode")
  @js.native
  def decode(buffer: Buffer): ScriptSignature = js.native
  
  @JSImport("bitcoinjs-lib/types/script_signature", "encode")
  @js.native
  def encode(signature: Buffer, hashType: Double): Buffer = js.native
  
  @js.native
  trait ScriptSignature extends StObject {
    
    var hashType: Double = js.native
    
    var signature: Buffer = js.native
  }
  object ScriptSignature {
    
    @scala.inline
    def apply(hashType: Double, signature: Buffer): ScriptSignature = {
      val __obj = js.Dynamic.literal(hashType = hashType.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptSignature]
    }
    
    @scala.inline
    implicit class ScriptSignatureMutableBuilder[Self <: ScriptSignature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashType(value: Double): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
