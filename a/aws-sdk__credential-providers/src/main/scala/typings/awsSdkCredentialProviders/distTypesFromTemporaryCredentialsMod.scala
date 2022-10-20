package typings.awsSdkCredentialProviders

import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import typings.awsSdkCredentialProviders.anon.OmitAssumeRoleCommandInpu
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromTemporaryCredentialsMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromTemporaryCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromTemporaryCredentials(options: FromTemporaryCredentialsOptions): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTemporaryCredentials")(options.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  trait FromTemporaryCredentialsOptions extends StObject {
    
    var clientConfig: js.UndefOr[STSClientConfig] = js.undefined
    
    var clientPlugins: js.UndefOr[js.Array[Pluggable[Any, Any]]] = js.undefined
    
    var masterCredentials: js.UndefOr[Credentials | CredentialProvider] = js.undefined
    
    var mfaCodeProvider: js.UndefOr[js.Function1[/* mfaSerial */ String, js.Promise[String]]] = js.undefined
    
    var params: OmitAssumeRoleCommandInpu
  }
  object FromTemporaryCredentialsOptions {
    
    inline def apply(params: OmitAssumeRoleCommandInpu): FromTemporaryCredentialsOptions = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromTemporaryCredentialsOptions]
    }
    
    extension [Self <: FromTemporaryCredentialsOptions](x: Self) {
      
      inline def setClientConfig(value: STSClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setClientPlugins(value: js.Array[Pluggable[Any, Any]]): Self = StObject.set(x, "clientPlugins", value.asInstanceOf[js.Any])
      
      inline def setClientPluginsUndefined: Self = StObject.set(x, "clientPlugins", js.undefined)
      
      inline def setClientPluginsVarargs(value: (Pluggable[Any, Any])*): Self = StObject.set(x, "clientPlugins", js.Array(value*))
      
      inline def setMasterCredentials(value: Credentials | CredentialProvider): Self = StObject.set(x, "masterCredentials", value.asInstanceOf[js.Any])
      
      inline def setMasterCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "masterCredentials", js.Any.fromFunction0(value))
      
      inline def setMasterCredentialsUndefined: Self = StObject.set(x, "masterCredentials", js.undefined)
      
      inline def setMfaCodeProvider(value: /* mfaSerial */ String => js.Promise[String]): Self = StObject.set(x, "mfaCodeProvider", js.Any.fromFunction1(value))
      
      inline def setMfaCodeProviderUndefined: Self = StObject.set(x, "mfaCodeProvider", js.undefined)
      
      inline def setParams(value: OmitAssumeRoleCommandInpu): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}
