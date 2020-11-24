package typings.bip174

import typings.bip174.anon.GlobalKeyVals
import typings.bip174.parserMod.PsbtAttributes
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/parser/toBuffer", JSImport.Namespace)
@js.native
object toBufferMod extends js.Object {
  
  def psbtToBuffer(hasGlobalMapInputsOutputs: PsbtAttributes): Buffer = js.native
  
  def psbtToKeyVals(hasGlobalMapInputsOutputs: PsbtAttributes): GlobalKeyVals = js.native
}
