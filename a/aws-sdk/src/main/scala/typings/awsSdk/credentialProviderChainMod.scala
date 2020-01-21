package typings.awsSdk

import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.errorMod.AWSError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/credential_provider_chain", JSImport.Namespace)
@js.native
object credentialProviderChainMod extends js.Object {
  @js.native
  /**
    * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
    */
  class CredentialProviderChain () extends js.Object {
    def this(providers: js.Array[provider]) = this()
    /**
      * Returns a list of credentials objects or functions that return credentials objects. If the provider is a function, the function will be executed lazily when the provider needs to be checked for valid credentials. By default, this object will be set to the defaultProviders.
      */
    var providers: js.Array[Credentials | provider] = js.native
    /**
      * Resolves the provider chain by searching for the first set of credentials in providers.
      */
    def resolve(callback: js.Function2[/* err */ AWSError, /* credentials */ Credentials, Unit]): CredentialProviderChain = js.native
    /**
      * Return a Promise on resolve() function
      */
    def resolvePromise(): js.Promise[Credentials] = js.native
  }
  
  /* static members */
  @js.native
  object CredentialProviderChain extends js.Object {
    var defaultProviders: js.Array[provider] = js.native
  }
  
  type provider = js.Function0[Credentials]
}

