package typings.bip174.fromBufferMod

import typings.bip174.interfacesMod.Transaction
import typings.bip174.parserMod.PsbtAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/parser/fromBuffer", "psbtFromKeyVals")
@js.native
object psbtFromKeyVals extends js.Object {
  
  def apply(unsignedTx: Transaction, hasGlobalMapKeyValsInputKeyValsOutputKeyVals: PsbtFromKeyValsArg): PsbtAttributes = js.native
}
