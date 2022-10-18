package typings.bip174

import typings.bip174.anon.CanAddToArray
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterSharedBip32DerivationMod {
  
  @JSImport("bip174/src/lib/converter/shared/bip32Derivation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeConverter(TYPE_BYTE: Double): CanAddToArray = ^.asInstanceOf[js.Dynamic].applyDynamic("makeConverter")(TYPE_BYTE.asInstanceOf[js.Any]).asInstanceOf[CanAddToArray]
  inline def makeConverter(TYPE_BYTE: Double, isValidPubkey: js.Function1[/* pubkey */ Buffer, Boolean]): CanAddToArray = (^.asInstanceOf[js.Dynamic].applyDynamic("makeConverter")(TYPE_BYTE.asInstanceOf[js.Any], isValidPubkey.asInstanceOf[js.Any])).asInstanceOf[CanAddToArray]
}
