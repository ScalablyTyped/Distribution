package typings.bip174

import typings.bip174.srcLibParserMod.PsbtAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibCombinerMod {
  
  @JSImport("bip174/src/lib/combiner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combine(psbts: js.Array[PsbtAttributes]): PsbtAttributes = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(psbts.asInstanceOf[js.Any]).asInstanceOf[PsbtAttributes]
}
