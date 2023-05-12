package typings.bitcoinjsLib

import typings.bitcoinjsLib.srcTypesMod.TinySecp256k1Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEccLibMod {
  
  @JSImport("bitcoinjs-lib/src/ecc_lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEccLib(): TinySecp256k1Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("getEccLib")().asInstanceOf[TinySecp256k1Interface]
  
  inline def initEccLib(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initEccLib")().asInstanceOf[Unit]
  inline def initEccLib(eccLib: TinySecp256k1Interface): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initEccLib")(eccLib.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
