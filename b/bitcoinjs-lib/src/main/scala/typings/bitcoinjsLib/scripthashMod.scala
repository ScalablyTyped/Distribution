package typings.bitcoinjsLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/templates/scripthash", JSImport.Namespace)
@js.native
object scripthashMod extends js.Object {
  @js.native
  object input extends js.Object {
    @js.native
    object check extends js.Object {
      var toJSON: js.Function0[String] = js.native
      def apply(script: js.Array[Double | Buffer]): Boolean = js.native
      def apply(script: js.Array[Double | Buffer], allowIncomplete: Boolean): Boolean = js.native
      def apply(script: Buffer): Boolean = js.native
      def apply(script: Buffer, allowIncomplete: Boolean): Boolean = js.native
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

