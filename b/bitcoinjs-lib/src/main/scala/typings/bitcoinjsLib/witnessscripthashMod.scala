package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object witnessscripthashMod {
  
  object input {
    
    object check {
      
      @scala.inline
      def apply(chunks: js.Array[Buffer]): Boolean = ^.asInstanceOf[js.Dynamic].apply(chunks.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      @scala.inline
      def apply(chunks: js.Array[Buffer], allowIncomplete: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(chunks.asInstanceOf[js.Any], allowIncomplete.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
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
      
      @scala.inline
      def apply(script: js.Array[Double | Buffer]): Boolean = ^.asInstanceOf[js.Dynamic].apply(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      @scala.inline
      def apply(script: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].apply(script.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
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
