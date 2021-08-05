package typings.bip174

import typings.bip174.anon.CanAddToArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bip32DerivationMod {
  
  @JSImport("bip174/src/lib/converter/shared/bip32Derivation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeConverter(TYPE_BYTE: Double): CanAddToArray = ^.asInstanceOf[js.Dynamic].applyDynamic("makeConverter")(TYPE_BYTE.asInstanceOf[js.Any]).asInstanceOf[CanAddToArray]
}
