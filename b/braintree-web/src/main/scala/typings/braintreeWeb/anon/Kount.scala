package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kount extends StObject {
  
  var client: typings.braintreeWeb.clientMod.Client
  
  var kount: js.UndefOr[Boolean] = js.undefined
  
  var paypal: js.UndefOr[Boolean] = js.undefined
}
object Kount {
  
  @scala.inline
  def apply(client: typings.braintreeWeb.clientMod.Client): Kount = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kount]
  }
  
  @scala.inline
  implicit class KountMutableBuilder[Self <: Kount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKount(value: Boolean): Self = StObject.set(x, "kount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKountUndefined: Self = StObject.set(x, "kount", js.undefined)
    
    @scala.inline
    def setPaypal(value: Boolean): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
  }
}
