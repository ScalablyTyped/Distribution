package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object witnesscommitmentMod {
  
  object output {
    
    @JSImport("bitcoinjs-lib/types/templates/witnesscommitment", "output")
    @js.native
    val ^ : js.Any = js.native
    
    object check {
      
      inline def apply(script: js.Array[Double | Buffer]): Boolean = ^.asInstanceOf[js.Dynamic].apply(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def apply(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].apply(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      @JSImport("bitcoinjs-lib/types/templates/witnesscommitment", "output.check")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bitcoinjs-lib/types/templates/witnesscommitment", "output.check.toJSON")
      @js.native
      def toJSON: js.Function0[String] = js.native
      inline def toJSON_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(x.asInstanceOf[js.Any])
    }
    
    inline def decode(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def encode(commitment: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(commitment.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
}
