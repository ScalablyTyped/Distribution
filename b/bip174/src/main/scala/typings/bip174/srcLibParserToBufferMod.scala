package typings.bip174

import typings.bip174.anon.GlobalKeyVals
import typings.bip174.srcLibParserMod.PsbtAttributes
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibParserToBufferMod {
  
  @JSImport("bip174/src/lib/parser/toBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def psbtToBuffer(param0: PsbtAttributes): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("psbtToBuffer")(param0.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def psbtToKeyVals(param0: PsbtAttributes): GlobalKeyVals = ^.asInstanceOf[js.Dynamic].applyDynamic("psbtToKeyVals")(param0.asInstanceOf[js.Any]).asInstanceOf[GlobalKeyVals]
}
