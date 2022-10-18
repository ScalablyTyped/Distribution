package typings.bip32

import typings.bip32.typesBip32Mod.BIP32API
import typings.bip32.typesBip32Mod.TinySecp256k1Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ecc: TinySecp256k1Interface): BIP32API = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ecc.asInstanceOf[js.Any]).asInstanceOf[BIP32API]
  
  inline def BIP32Factory(ecc: TinySecp256k1Interface): BIP32API = ^.asInstanceOf[js.Dynamic].applyDynamic("BIP32Factory")(ecc.asInstanceOf[js.Any]).asInstanceOf[BIP32API]
}
