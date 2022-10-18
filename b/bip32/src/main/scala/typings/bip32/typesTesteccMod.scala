package typings.bip32

import typings.bip32.typesBip32Mod.TinySecp256k1Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTesteccMod {
  
  @JSImport("bip32/types/testecc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testEcc(ecc: TinySecp256k1Interface): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testEcc")(ecc.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
