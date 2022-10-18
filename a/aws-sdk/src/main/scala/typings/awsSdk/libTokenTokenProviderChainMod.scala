package typings.awsSdk

import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libTokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokenTokenProviderChainMod {
  
  @JSImport("aws-sdk/lib/token/token_provider_chain", "TokenProviderChain")
  @js.native
  /**
    * Creates a new TokenProviderChain with a default set of providers specified by defaultProviders.
    */
  open class TokenProviderChain () extends StObject {
    def this(providers: js.Array[provider]) = this()
    
    /**
      * Returns a list of token objects or functions that return token objects. If the provider is a function, the function will be executed lazily when the provider needs to be checked for valid token. By default, this object will be set to the defaultProviders.
      */
    var providers: js.Array[Token | provider] = js.native
    
    /**
      * Resolves the provider chain by searching for the first set of token in providers.
      */
    def resolve(callback: js.Function2[/* err */ AWSError | Null, /* token */ js.UndefOr[Token], Unit]): TokenProviderChain = js.native
    
    /**
      * Return a Promise on resolve() function
      */
    def resolvePromise(): js.Promise[Token] = js.native
  }
  /* static members */
  object TokenProviderChain {
    
    @JSImport("aws-sdk/lib/token/token_provider_chain", "TokenProviderChain")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/token/token_provider_chain", "TokenProviderChain.defaultProviders")
    @js.native
    def defaultProviders: js.Array[provider] = js.native
    inline def defaultProviders_=(x: js.Array[provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
  }
  
  type provider = js.Function0[Token]
}
