package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var client: typings.braintreeWeb.modulesClientMod.Client
}
object Client {
  
  inline def apply(client: typings.braintreeWeb.modulesClientMod.Client): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    inline def setClient(value: typings.braintreeWeb.modulesClientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
  }
}
