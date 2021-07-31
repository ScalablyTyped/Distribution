package typings.buildOutputScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Builds a P2PKH Bitcoin transaction output script from an array of P2PKH addresses and amounts.
    * Will also work with any Bitcoin derived cryptocurrencies with a single byte pubkey hash address prefix.
    *
    * The output script is returned as a hex string and can be passed directly in to ledgerjs.
    *
    * @param outputs An array of one or more output objects.
    * @returns A (hex string) P2PKH transaction output script.
    */
  @scala.inline
  def apply(outputs: Array[Output]): String = ^.asInstanceOf[js.Dynamic].apply(outputs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("build-output-script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Output extends StObject {
    
    /**
      * A valid P2PKH address.
      */
    var address: String
    
    /**
      * Value to send to `address` in satoshis.
      */
    var value: Double
  }
  object Output {
    
    @scala.inline
    def apply(address: String, value: Double): Output = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
