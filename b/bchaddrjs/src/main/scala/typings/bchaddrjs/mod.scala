package typings.bchaddrjs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  class InvalidAddressError () extends Error
  
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
  
  @JSImport("bchaddrjs", "detectAddressFormat")
  @js.native
  def detectAddressFormat(address: String): String = js.native
  
  @JSImport("bchaddrjs", "detectAddressNetwork")
  @js.native
  def detectAddressNetwork(address: String): String = js.native
  
  @JSImport("bchaddrjs", "detectAddressType")
  @js.native
  def detectAddressType(address: String): String = js.native
  
  @JSImport("bchaddrjs", "isBitpayAddress")
  @js.native
  def isBitpayAddress(address: String): Boolean = js.native
  
  @JSImport("bchaddrjs", "isCashAddress")
  @js.native
  def isCashAddress(address: String): Boolean = js.native
  
  @JSImport("bchaddrjs", "isLegacyAddress")
  @js.native
  def isLegacyAddress(address: String): Boolean = js.native
  
  @JSImport("bchaddrjs", "isMainnetAddress")
  @js.native
  def isMainnetAddress(address: String): Boolean = js.native
  
  @JSImport("bchaddrjs", "isP2PKHAddress")
  @js.native
  def isP2PKHAddress(address: String): Boolean = js.native
  
  @JSImport("bchaddrjs", "isP2SHAddress")
  @js.native
  def isP2SHAddress(address: String): Boolean = js.native
  
  @JSImport("bchaddrjs", "isTestnetAddress")
  @js.native
  def isTestnetAddress(address: String): Boolean = js.native
  
  @JSImport("bchaddrjs", "isValidAddress")
  @js.native
  def isValidAddress(input: js.Any): Boolean = js.native
  
  @JSImport("bchaddrjs", "toBitpayAddress")
  @js.native
  def toBitpayAddress(address: String): String = js.native
  
  @JSImport("bchaddrjs", "toCashAddress")
  @js.native
  def toCashAddress(address: String): String = js.native
  
  @JSImport("bchaddrjs", "toLegacyAddress")
  @js.native
  def toLegacyAddress(address: String): String = js.native
}
