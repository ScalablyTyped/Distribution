package typings.bip174

import typings.bip174.anon.Decode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object witnessScriptMod {
  
  @JSImport("bip174/src/lib/converter/shared/witnessScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def makeConverter(TYPE_BYTE: Double): Decode = ^.asInstanceOf[js.Dynamic].applyDynamic("makeConverter")(TYPE_BYTE.asInstanceOf[js.Any]).asInstanceOf[Decode]
}
