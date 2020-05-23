package typings.bitcoinjsLib

import typings.bitcoinjsLib.anon.Typeofcheck
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/templates/nulldata", JSImport.Namespace)
@js.native
object nulldataMod extends js.Object {
  @js.native
  object check extends js.Object {
    var toJSON: js.Function0[String] = js.native
    def apply(script: js.Array[Double | Buffer]): Boolean = js.native
    def apply(script: Buffer): Boolean = js.native
  }
  
  @js.native
  object output extends js.Object {
    @JSName("check")
    var check_Original: (js.Function1[/* script */ Buffer | (js.Array[Double | Buffer]), Boolean]) with Typeofcheck = js.native
    def check(script: js.Array[Double | Buffer]): Boolean = js.native
    def check(script: Buffer): Boolean = js.native
  }
  
}

