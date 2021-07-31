package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinNonce extends StObject {
  
  var bin: String
  
  var nonce: String
}
object BinNonce {
  
  @scala.inline
  def apply(bin: String, nonce: String): BinNonce = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinNonce]
  }
  
  @scala.inline
  implicit class BinNonceMutableBuilder[Self <: BinNonce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
  }
}
