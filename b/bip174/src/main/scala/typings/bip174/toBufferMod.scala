package typings.bip174

import typings.bip174.anon.GlobalKeyVals
import typings.bip174.parserMod.PsbtAttributes
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBufferMod {
  
  @JSImport("bip174/src/lib/parser/toBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def psbtToBuffer(hasGlobalMapInputsOutputs: PsbtAttributes): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("psbtToBuffer")(hasGlobalMapInputsOutputs.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def psbtToKeyVals(hasGlobalMapInputsOutputs: PsbtAttributes): GlobalKeyVals = ^.asInstanceOf[js.Dynamic].applyDynamic("psbtToKeyVals")(hasGlobalMapInputsOutputs.asInstanceOf[js.Any]).asInstanceOf[GlobalKeyVals]
}
