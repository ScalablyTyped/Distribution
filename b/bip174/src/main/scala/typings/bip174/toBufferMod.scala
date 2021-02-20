package typings.bip174

import typings.bip174.anon.GlobalKeyVals
import typings.bip174.parserMod.PsbtAttributes
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBufferMod {
  
  @JSImport("bip174/src/lib/parser/toBuffer", "psbtToBuffer")
  @js.native
  def psbtToBuffer(hasGlobalMapInputsOutputs: PsbtAttributes): Buffer = js.native
  
  @JSImport("bip174/src/lib/parser/toBuffer", "psbtToKeyVals")
  @js.native
  def psbtToKeyVals(hasGlobalMapInputsOutputs: PsbtAttributes): GlobalKeyVals = js.native
}
