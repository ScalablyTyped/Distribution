package typings.bchaddrjs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bchaddrjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Format {
    
    @JSImport("bchaddrjs", "Format.Bitpay")
    @js.native
    val Bitpay: String = js.native
    
    @JSImport("bchaddrjs", "Format.Cashaddr")
    @js.native
    val Cashaddr: String = js.native
    
    @JSImport("bchaddrjs", "Format.Legacy")
    @js.native
    val Legacy: String = js.native
  }
  
  @JSImport("bchaddrjs", "InvalidAddressError")
  @js.native
  class InvalidAddressError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  object Network {
    
    @JSImport("bchaddrjs", "Network.Mainnet")
    @js.native
    val Mainnet: String = js.native
    
    @JSImport("bchaddrjs", "Network.Testnet")
    @js.native
    val Testnet: String = js.native
  }
  
  object Type {
    
    @JSImport("bchaddrjs", "Type.P2PKH")
    @js.native
    val P2PKH: String = js.native
    
    @JSImport("bchaddrjs", "Type.P2SH")
    @js.native
    val P2SH: String = js.native
  }
  
  inline def detectAddressFormat(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectAddressFormat")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def detectAddressNetwork(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectAddressNetwork")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def detectAddressType(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectAddressType")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBitpayAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBitpayAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCashAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCashAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLegacyAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMainnetAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMainnetAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isP2PKHAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isP2PKHAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isP2SHAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isP2SHAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTestnetAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTestnetAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidAddress(input: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAddress")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toBitpayAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBitpayAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toCashAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCashAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toLegacyAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLegacyAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
}
