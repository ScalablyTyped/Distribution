package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var client: typings.braintreeWeb.clientMod.Client
}
object Client {
  
  inline def apply(client: typings.braintreeWeb.clientMod.Client): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setClient(value: typings.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
  }
}
