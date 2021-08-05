package typings.awsSdk

import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.errorMod.AWSError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialProviderChainMod {
  
  @JSImport("aws-sdk/lib/credentials/credential_provider_chain", "CredentialProviderChain")
  @js.native
  /**
    * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
    */
  class CredentialProviderChain () extends StObject {
    def this(providers: js.Array[provider]) = this()
    
    /**
      * Returns a list of credentials objects or functions that return credentials objects. If the provider is a function, the function will be executed lazily when the provider needs to be checked for valid credentials. By default, this object will be set to the defaultProviders.
      */
    var providers: js.Array[Credentials | provider] = js.native
    
    /**
      * Resolves the provider chain by searching for the first set of credentials in providers.
      */
    def resolve(callback: js.Function2[/* err */ AWSError | Null, /* credentials */ js.UndefOr[Credentials], Unit]): CredentialProviderChain = js.native
    
    /**
      * Return a Promise on resolve() function
      */
    def resolvePromise(): js.Promise[Credentials] = js.native
  }
  /* static members */
  object CredentialProviderChain {
    
    @JSImport("aws-sdk/lib/credentials/credential_provider_chain", "CredentialProviderChain")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/credentials/credential_provider_chain", "CredentialProviderChain.defaultProviders")
    @js.native
    def defaultProviders: js.Array[provider] = js.native
    inline def defaultProviders_=(x: js.Array[provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
  }
  
  type provider = js.Function0[Credentials]
}
