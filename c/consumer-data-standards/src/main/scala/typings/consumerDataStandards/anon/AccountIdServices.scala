package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountIdServices
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Tokenised ID of the account. In accordance with [CDR ID permanence](#id-permanence) requirements
    */
  var accountId: String
  
  /**
    * List of services that are part of the account
    */
  var services: js.Array[Service]
}
object AccountIdServices {
  
  inline def apply(accountId: String, services: js.Array[Service]): AccountIdServices = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountIdServices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountIdServices] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setServices(value: js.Array[Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
