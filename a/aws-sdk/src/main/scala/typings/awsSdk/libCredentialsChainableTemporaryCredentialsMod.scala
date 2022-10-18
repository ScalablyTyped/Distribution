package typings.awsSdk

import typings.awsSdk.clientsStsMod.AssumeRoleRequest
import typings.awsSdk.clientsStsMod.ClientConfiguration
import typings.awsSdk.clientsStsMod.GetSessionTokenRequest
import typings.awsSdk.clientsStsMod.^
import typings.awsSdk.libCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsChainableTemporaryCredentialsMod {
  
  @js.native
  trait ChainableTemporaryCredentials extends Credentials {
    
    /**
      * The STS service instance used to get and refresh temporary credentials from AWS STS.
      */
    val service: ^ = js.native
  }
  // Needed to expose interfaces on the class
  object ChainableTemporaryCredentials {
    
    trait ChainableTemporaryCredentialsOptions extends StObject {
      
      var masterCredentials: js.UndefOr[Credentials] = js.undefined
      
      var params: js.UndefOr[AssumeRoleRequest | GetSessionTokenRequest] = js.undefined
      
      var stsConfig: js.UndefOr[ClientConfiguration] = js.undefined
      
      var tokenCodeFn: js.UndefOr[
            js.Function2[
              /* serialNumber */ String, 
              /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit], 
              Unit
            ]
          ] = js.undefined
    }
    object ChainableTemporaryCredentialsOptions {
      
      inline def apply(): ChainableTemporaryCredentialsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChainableTemporaryCredentialsOptions]
      }
      
      extension [Self <: ChainableTemporaryCredentialsOptions](x: Self) {
        
        inline def setMasterCredentials(value: Credentials): Self = StObject.set(x, "masterCredentials", value.asInstanceOf[js.Any])
        
        inline def setMasterCredentialsUndefined: Self = StObject.set(x, "masterCredentials", js.undefined)
        
        inline def setParams(value: AssumeRoleRequest | GetSessionTokenRequest): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setStsConfig(value: ClientConfiguration): Self = StObject.set(x, "stsConfig", value.asInstanceOf[js.Any])
        
        inline def setStsConfigUndefined: Self = StObject.set(x, "stsConfig", js.undefined)
        
        inline def setTokenCodeFn(
          value: (/* serialNumber */ String, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit]) => Unit
        ): Self = StObject.set(x, "tokenCodeFn", js.Any.fromFunction2(value))
        
        inline def setTokenCodeFnUndefined: Self = StObject.set(x, "tokenCodeFn", js.undefined)
      }
    }
  }
}
