package typings.bip174.srcLibParserFromBufferMod

import typings.bip174.srcLibInterfacesMod.TransactionFromBuffer
import typings.bip174.srcLibParserMod.PsbtAttributes
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/parser/fromBuffer", "psbtFromBuffer")
@js.native
object psbtFromBuffer extends js.Object {
  def apply(buffer: Buffer, txGetter: TransactionFromBuffer): PsbtAttributes = js.native
}

