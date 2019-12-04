package typings.bitcoinjsDashLib

import typings.bitcoinjsDashLib.typesPaymentsMod.Stack
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/templates/pubkey/output", JSImport.Namespace)
@js.native
object typesTemplatesPubkeyOutputMod extends js.Object {
  @js.native
  object check extends js.Object {
    var toJSON: js.Function0[String] = js.native
    def apply(script: Stack): Boolean = js.native
    def apply(script: Buffer): Boolean = js.native
  }
  
}

