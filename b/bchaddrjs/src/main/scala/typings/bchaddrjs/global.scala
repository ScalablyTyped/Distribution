package typings.bchaddrjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object bchaddr {
    
    @JSGlobal("bchaddr")
    @js.native
    val ^ : js.Any = js.native
    
    object Format {
      
      @JSGlobal("bchaddr.Format.Bitpay")
      @js.native
      val Bitpay: String = js.native
      
      @JSGlobal("bchaddr.Format.Cashaddr")
      @js.native
      val Cashaddr: String = js.native
      
      @JSGlobal("bchaddr.Format.Legacy")
      @js.native
      val Legacy: String = js.native
    }
    
    @JSGlobal("bchaddr.InvalidAddressError")
    @js.native
    open class InvalidAddressError ()
      extends typings.bchaddrjs.mod.InvalidAddressError
    
    object Network {
      
      @JSGlobal("bchaddr.Network.Mainnet")
      @js.native
      val Mainnet: String = js.native
      
      @JSGlobal("bchaddr.Network.Testnet")
      @js.native
      val Testnet: String = js.native
    }
    
    object Type {
      
      @JSGlobal("bchaddr.Type.P2PKH")
      @js.native
      val P2PKH: String = js.native
      
      @JSGlobal("bchaddr.Type.P2SH")
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
    
    inline def isValidAddress(input: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAddress")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toBitpayAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBitpayAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toCashAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCashAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toLegacyAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLegacyAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
