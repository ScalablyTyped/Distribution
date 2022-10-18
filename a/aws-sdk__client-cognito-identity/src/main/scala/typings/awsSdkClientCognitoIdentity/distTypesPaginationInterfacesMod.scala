package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClient
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityMod.CognitoIdentity
import typings.awsSdkTypes.distTypesPaginationMod.PaginationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationInterfacesMod {
  
  trait CognitoIdentityPaginationConfiguration
    extends StObject
       with PaginationConfiguration {
    
    @JSName("client")
    var client_CognitoIdentityPaginationConfiguration: CognitoIdentity | CognitoIdentityClient
  }
  object CognitoIdentityPaginationConfiguration {
    
    inline def apply(client: CognitoIdentity | CognitoIdentityClient): CognitoIdentityPaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoIdentityPaginationConfiguration]
    }
    
    extension [Self <: CognitoIdentityPaginationConfiguration](x: Self) {
      
      inline def setClient(value: CognitoIdentity | CognitoIdentityClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
