package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object witnessscripthashMod {
  
  object input {
    
    object check {
      
      @JSImport("bitcoinjs-lib/types/templates/witnessscripthash", "input.check")
      @js.native
      def apply(chunks: js.Array[Buffer]): Boolean = js.native
      @JSImport("bitcoinjs-lib/types/templates/witnessscripthash", "input.check")
      @js.native
      def apply(chunks: js.Array[Buffer], allowIncomplete: Boolean): Boolean = js.native
      @JSImport("bitcoinjs-lib/types/templates/witnessscripthash", "input.check")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bitcoinjs-lib/types/templates/witnessscripthash", "input.check.toJSON")
      @js.native
      def toJSON: js.Function0[String] = js.native
      @scala.inline
      def toJSON_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(x.asInstanceOf[js.Any])
    }
  }
  
  object output {
    
    object check {
      
      @JSImport("bitcoinjs-lib/types/templates/witnessscripthash", "output.check")
      @js.native
      def apply(script: js.Array[Double | Buffer]): Boolean = js.native
      @JSImport("bitcoinjs-lib/types/templates/witnessscripthash", "output.check")
      @js.native
      def apply(script: Buffer): Boolean = js.native
      @JSImport("bitcoinjs-lib/types/templates/witnessscripthash", "output.check")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bitcoinjs-lib/types/templates/witnessscripthash", "output.check.toJSON")
      @js.native
      def toJSON: js.Function0[String] = js.native
      @scala.inline
      def toJSON_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(x.asInstanceOf[js.Any])
    }
  }
}
