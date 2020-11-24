package typings.bitcoinjsLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/templates/witnessscripthash/output", JSImport.Namespace)
@js.native
object witnessscripthashOutputMod extends js.Object {
  
  @js.native
  object check extends js.Object {
    
    def apply(script: js.Array[Double | Buffer]): Boolean = js.native
    def apply(script: Buffer): Boolean = js.native
    
    var toJSON: js.Function0[String] = js.native
  }
}
