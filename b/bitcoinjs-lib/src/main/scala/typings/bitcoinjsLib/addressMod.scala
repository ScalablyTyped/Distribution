package typings.bitcoinjsLib

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressMod {
  
  @JSImport("bitcoinjs-lib/types/address", "fromBase58Check")
  @js.native
  def fromBase58Check(address: String): Base58CheckResult = js.native
  
  @JSImport("bitcoinjs-lib/types/address", "fromBech32")
  @js.native
  def fromBech32(address: String): Bech32Result = js.native
  
  @JSImport("bitcoinjs-lib/types/address", "fromOutputScript")
  @js.native
  def fromOutputScript(output: Buffer): String = js.native
  @JSImport("bitcoinjs-lib/types/address", "fromOutputScript")
  @js.native
  def fromOutputScript(output: Buffer, network: Network): String = js.native
  
  @JSImport("bitcoinjs-lib/types/address", "toBase58Check")
  @js.native
  def toBase58Check(hash: Buffer, version: Double): String = js.native
  
  @JSImport("bitcoinjs-lib/types/address", "toBech32")
  @js.native
  def toBech32(data: Buffer, version: Double, prefix: String): String = js.native
  
  @JSImport("bitcoinjs-lib/types/address", "toOutputScript")
  @js.native
  def toOutputScript(address: String): Buffer = js.native
  @JSImport("bitcoinjs-lib/types/address", "toOutputScript")
  @js.native
  def toOutputScript(address: String, network: Network): Buffer = js.native
  
  @js.native
  trait Base58CheckResult extends StObject {
    
    var hash: Buffer = js.native
    
    var version: Double = js.native
  }
  object Base58CheckResult {
    
    @scala.inline
    def apply(hash: Buffer, version: Double): Base58CheckResult = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base58CheckResult]
    }
    
    @scala.inline
    implicit class Base58CheckResultMutableBuilder[Self <: Base58CheckResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bech32Result extends StObject {
    
    var data: Buffer = js.native
    
    var prefix: String = js.native
    
    var version: Double = js.native
  }
  object Bech32Result {
    
    @scala.inline
    def apply(data: Buffer, prefix: String, version: Double): Bech32Result = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bech32Result]
    }
    
    @scala.inline
    implicit class Bech32ResultMutableBuilder[Self <: Bech32Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
