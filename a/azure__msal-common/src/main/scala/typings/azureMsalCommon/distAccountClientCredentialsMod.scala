package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccountClientCredentialsMod {
  
  trait ClientAssertion extends StObject {
    
    var assertion: String
    
    var assertionType: String
  }
  object ClientAssertion {
    
    inline def apply(assertion: String, assertionType: String): ClientAssertion = {
      val __obj = js.Dynamic.literal(assertion = assertion.asInstanceOf[js.Any], assertionType = assertionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientAssertion]
    }
    
    extension [Self <: ClientAssertion](x: Self) {
      
      inline def setAssertion(value: String): Self = StObject.set(x, "assertion", value.asInstanceOf[js.Any])
      
      inline def setAssertionType(value: String): Self = StObject.set(x, "assertionType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientCredentials extends StObject {
    
    var clientAssertion: js.UndefOr[ClientAssertion] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
  }
  object ClientCredentials {
    
    inline def apply(): ClientCredentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientCredentials]
    }
    
    extension [Self <: ClientCredentials](x: Self) {
      
      inline def setClientAssertion(value: ClientAssertion): Self = StObject.set(x, "clientAssertion", value.asInstanceOf[js.Any])
      
      inline def setClientAssertionUndefined: Self = StObject.set(x, "clientAssertion", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    }
  }
}
