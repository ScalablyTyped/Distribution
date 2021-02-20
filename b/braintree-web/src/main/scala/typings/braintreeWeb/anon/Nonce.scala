package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nonce extends StObject {
  
  var nonce: String = js.native
}
object Nonce {
  
  @scala.inline
  def apply(nonce: String): Nonce = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nonce]
  }
  
  @scala.inline
  implicit class NonceMutableBuilder[Self <: Nonce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
  }
}
