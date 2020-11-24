package typings.bitcoinjsLib

import typings.bitcoinjsLib.anon.Typeofcheck
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/templates/nulldata", JSImport.Namespace)
@js.native
object nulldataMod extends js.Object {
  
  @js.native
  object check extends js.Object {
    
    def apply(script: js.Array[Double | Buffer]): Boolean = js.native
    def apply(script: Buffer): Boolean = js.native
    
    var toJSON: js.Function0[String] = js.native
  }
  
  @js.native
  object output extends js.Object {
    
    def check(script: js.Array[Double | Buffer]): Boolean = js.native
    def check(script: Buffer): Boolean = js.native
    @JSName("check")
    var check_Original: (js.Function1[/* script */ Buffer | (js.Array[Double | Buffer]), Boolean]) with Typeofcheck = js.native
  }
}
