package typings.bip174.srcLibParserMod

import typings.bip174.srcLibInterfacesMod.Transaction
import typings.bip174.srcLibParserFromBufferMod.PsbtFromKeyValsArg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/parser", "psbtFromKeyVals")
@js.native
object psbtFromKeyVals extends js.Object {
  def apply(unsignedTx: Transaction, hasGlobalMapKeyValsInputKeyValsOutputKeyVals: PsbtFromKeyValsArg): PsbtAttributes = js.native
}

