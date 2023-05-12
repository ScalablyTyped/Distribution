package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClient
import typings.awsSdkTypes.distTypesPaginationMod.PaginationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationInterfacesMod {
  
  trait CognitoIdentityPaginationConfiguration
    extends StObject
       with PaginationConfiguration {
    
    @JSName("client")
    var client_CognitoIdentityPaginationConfiguration: CognitoIdentityClient
  }
  object CognitoIdentityPaginationConfiguration {
    
    inline def apply(client: CognitoIdentityClient): CognitoIdentityPaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoIdentityPaginationConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoIdentityPaginationConfiguration] (val x: Self) extends AnyVal {
      
      inline def setClient(value: CognitoIdentityClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
