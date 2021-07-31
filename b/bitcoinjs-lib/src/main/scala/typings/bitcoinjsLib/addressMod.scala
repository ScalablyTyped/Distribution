package typings.bitcoinjsLib

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressMod {
  
  @JSImport("bitcoinjs-lib/types/address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromBase58Check(address: String): Base58CheckResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase58Check")(address.asInstanceOf[js.Any]).asInstanceOf[Base58CheckResult]
  
  @scala.inline
  def fromBech32(address: String): Bech32Result = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBech32")(address.asInstanceOf[js.Any]).asInstanceOf[Bech32Result]
  
  @scala.inline
  def fromOutputScript(output: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOutputScript")(output.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def fromOutputScript(output: Buffer, network: Network): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOutputScript")(output.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toBase58Check(hash: Buffer, version: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase58Check")(hash.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toBech32(data: Buffer, version: Double, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBech32")(data.asInstanceOf[js.Any], version.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toOutputScript(address: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toOutputScript")(address.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def toOutputScript(address: String, network: Network): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toOutputScript")(address.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait Base58CheckResult extends StObject {
    
    var hash: Buffer
    
    var version: Double
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
  
  trait Bech32Result extends StObject {
    
    var data: Buffer
    
    var prefix: String
    
    var version: Double
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
