package typings.bip174

import typings.bip174.srcLibParserMod.PsbtAttributes
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/parser/toBuffer", JSImport.Namespace)
@js.native
object srcLibParserToBufferMod extends js.Object {
  def psbtToBuffer(hasGlobalMapInputsOutputs: PsbtAttributes): Buffer = js.native
  def psbtToKeyVals(hasGlobalMapInputsOutputs: PsbtAttributes): Anon_GlobalKeyVals = js.native
}

