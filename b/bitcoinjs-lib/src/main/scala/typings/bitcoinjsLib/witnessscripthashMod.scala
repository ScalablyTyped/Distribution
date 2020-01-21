package typings.bitcoinjsLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/templates/witnessscripthash", JSImport.Namespace)
@js.native
object witnessscripthashMod extends js.Object {
  @js.native
  object input extends js.Object {
    @js.native
    object check extends js.Object {
      var toJSON: js.Function0[String] = js.native
      def apply(chunks: js.Array[Buffer]): Boolean = js.native
      def apply(chunks: js.Array[Buffer], allowIncomplete: Boolean): Boolean = js.native
    }
    
  }
  
  @js.native
  object output extends js.Object {
    @js.native
    object check extends js.Object {
      var toJSON: js.Function0[String] = js.native
      def apply(script: js.Array[Double | Buffer]): Boolean = js.native
      def apply(script: Buffer): Boolean = js.native
    }
    
  }
  
}

