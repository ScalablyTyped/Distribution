package typings.bip174

import typings.bip174.anon.Check
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redeemScriptMod {
  
  @JSImport("bip174/src/lib/converter/shared/redeemScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeConverter(TYPE_BYTE: Double): Check = ^.asInstanceOf[js.Dynamic].applyDynamic("makeConverter")(TYPE_BYTE.asInstanceOf[js.Any]).asInstanceOf[Check]
}
