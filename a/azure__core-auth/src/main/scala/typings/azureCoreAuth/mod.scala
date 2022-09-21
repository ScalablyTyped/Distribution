package typings.azureCoreAuth

import typings.azureAbortController.abortSignalMod.AbortSignalLike
import typings.azureCoreAuth.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/core-auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-auth", "AzureKeyCredential")
  @js.native
  open class AzureKeyCredential protected ()
    extends StObject
       with KeyCredential {
    /**
      * Create an instance of an AzureKeyCredential for use
      * with a service client.
      *
      * @param key - The initial value of the key to use in authentication
      */
    def this(key: String) = this()
    
    /* private */ var _key: Any = js.native
    
    /**
      * The value of the API key represented as a string
      */
    /* CompleteClass */
    override val key: String = js.native
    /**
      * The value of the key to be used in authentication
      */
    @JSName("key")
    def key_MAzureKeyCredential: String = js.native
    
    /**
      * Change the value of the key.
      *
      * Updates will take effect upon the next request after
      * updating the key value.
      *
      * @param newKey - The new key value to be used
      */
    def update(newKey: String): Unit = js.native
  }
  
  @JSImport("@azure/core-auth", "AzureNamedKeyCredential")
  @js.native
  open class AzureNamedKeyCredential protected ()
    extends StObject
       with NamedKeyCredential {
    /**
      * Create an instance of an AzureNamedKeyCredential for use
      * with a service client.
      *
      * @param name - The initial value of the name to use in authentication.
      * @param key - The initial value of the key to use in authentication.
      */
    def this(name: String, key: String) = this()
    
    /* private */ var _key: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /**
      * The value of the API key represented as a string
      */
    /* CompleteClass */
    override val key: String = js.native
    /**
      * The value of the key to be used in authentication.
      */
    @JSName("key")
    def key_MAzureNamedKeyCredential: String = js.native
    
    /**
      * The value of the API name represented as a string.
      */
    /* CompleteClass */
    override val name: String = js.native
    /**
      * The value of the name to be used in authentication.
      */
    @JSName("name")
    def name_MAzureNamedKeyCredential: String = js.native
    
    /**
      * Change the value of the key.
      *
      * Updates will take effect upon the next request after
      * updating the key value.
      *
      * @param newName - The new name value to be used.
      * @param newKey - The new key value to be used.
      */
    def update(newName: String, newKey: String): Unit = js.native
  }
  
  @JSImport("@azure/core-auth", "AzureSASCredential")
  @js.native
  open class AzureSASCredential protected ()
    extends StObject
       with SASCredential {
    /**
      * Create an instance of an AzureSASCredential for use
      * with a service client.
      *
      * @param signature - The initial value of the shared access signature to use in authentication
      */
    def this(signature: String) = this()
    
    /* private */ var _signature: Any = js.native
    
    /**
      * The value of the shared access signature represented as a string
      */
    /* CompleteClass */
    override val signature: String = js.native
    /**
      * The value of the shared access signature to be used in authentication
      */
    @JSName("signature")
    def signature_MAzureSASCredential: String = js.native
    
    /**
      * Change the value of the signature.
      *
      * Updates will take effect upon the next request after
      * updating the signature value.
      *
      * @param newSignature - The new shared access signature value to be used
      */
    def update(newSignature: String): Unit = js.native
  }
  
  inline def isNamedKeyCredential(credential: Any): /* is @azure/core-auth.@azure/core-auth.NamedKeyCredential */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedKeyCredential")(credential.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-auth.@azure/core-auth.NamedKeyCredential */ Boolean]
  
  inline def isSASCredential(credential: Any): /* is @azure/core-auth.@azure/core-auth.SASCredential */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSASCredential")(credential.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-auth.@azure/core-auth.SASCredential */ Boolean]
  
  inline def isTokenCredential(credential: Any): /* is @azure/core-auth.@azure/core-auth.TokenCredential */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenCredential")(credential.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-auth.@azure/core-auth.TokenCredential */ Boolean]
  
  trait AccessToken extends StObject {
    
    /**
      * The access token's expiration timestamp in milliseconds, UNIX epoch time.
      */
    var expiresOnTimestamp: Double
    
    /**
      * The access token returned by the authentication service.
      */
    var token: String
  }
  object AccessToken {
    
    inline def apply(expiresOnTimestamp: Double, token: String): AccessToken = {
      val __obj = js.Dynamic.literal(expiresOnTimestamp = expiresOnTimestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    extension [Self <: AccessToken](x: Self) {
      
      inline def setExpiresOnTimestamp(value: Double): Self = StObject.set(x, "expiresOnTimestamp", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTokenOptions extends StObject {
    
    /**
      * The signal which can be used to abort requests.
      */
    var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
    
    /**
      * Claim details to perform the Continuous Access Evaluation authentication flow
      */
    var claims: js.UndefOr[String] = js.undefined
    
    /**
      * Options used when creating and sending HTTP requests for this operation.
      */
    var requestOptions: js.UndefOr[Timeout] = js.undefined
    
    /**
      * Allows specifying a tenantId. Useful to handle challenges that provide tenant Id hints.
      */
    var tenantId: js.UndefOr[String] = js.undefined
    
    /**
      * Options used when tracing is enabled.
      */
    var tracingOptions: js.UndefOr[typings.azureCoreAuth.anon.TracingContext] = js.undefined
  }
  object GetTokenOptions {
    
    inline def apply(): GetTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTokenOptions]
    }
    
    extension [Self <: GetTokenOptions](x: Self) {
      
      inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setRequestOptions(value: Timeout): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setTracingOptions(value: typings.azureCoreAuth.anon.TracingContext): Self = StObject.set(x, "tracingOptions", value.asInstanceOf[js.Any])
      
      inline def setTracingOptionsUndefined: Self = StObject.set(x, "tracingOptions", js.undefined)
    }
  }
  
  trait KeyCredential extends StObject {
    
    /**
      * The value of the API key represented as a string
      */
    val key: String
  }
  object KeyCredential {
    
    inline def apply(key: String): KeyCredential = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyCredential]
    }
    
    extension [Self <: KeyCredential](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait NamedKeyCredential extends StObject {
    
    /**
      * The value of the API key represented as a string
      */
    val key: String
    
    /**
      * The value of the API name represented as a string.
      */
    val name: String
  }
  object NamedKeyCredential {
    
    inline def apply(key: String, name: String): NamedKeyCredential = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedKeyCredential]
    }
    
    extension [Self <: NamedKeyCredential](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SASCredential extends StObject {
    
    /**
      * The value of the shared access signature represented as a string
      */
    val signature: String
  }
  object SASCredential {
    
    inline def apply(signature: String): SASCredential = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SASCredential]
    }
    
    extension [Self <: SASCredential](x: Self) {
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenCredential extends StObject {
    
    /**
      * Gets the token provided by this credential.
      *
      * This method is called automatically by Azure SDK client libraries. You may call this method
      * directly, but you must also handle token caching and token refreshing.
      *
      * @param scopes - The list of scopes for which the token will have access.
      * @param options - The options used to configure any requests this
      *                TokenCredential implementation might make.
      */
    def getToken(scopes: String): js.Promise[AccessToken | Null] = js.native
    def getToken(scopes: String, options: GetTokenOptions): js.Promise[AccessToken | Null] = js.native
    def getToken(scopes: js.Array[String]): js.Promise[AccessToken | Null] = js.native
    def getToken(scopes: js.Array[String], options: GetTokenOptions): js.Promise[AccessToken | Null] = js.native
  }
  
  trait TracingContext extends StObject {
    
    /**
      * Return a new context which inherits from this context but does
      * not contain a value for the given key.
      *
      * @param key - context key for which to clear a value
      */
    def deleteValue(key: js.Symbol): TracingContext
    
    /**
      * Get a value from the context.
      *
      * @param key - key which identifies a context value
      */
    def getValue(key: js.Symbol): Any
    
    /**
      * Create a new context which inherits from this context and has
      * the given key set to the given value.
      *
      * @param key - context key for which to set the value
      * @param value - value to set for the given key
      */
    def setValue(key: js.Symbol, value: Any): TracingContext
  }
  object TracingContext {
    
    inline def apply(
      deleteValue: js.Symbol => TracingContext,
      getValue: js.Symbol => Any,
      setValue: (js.Symbol, Any) => TracingContext
    ): TracingContext = {
      val __obj = js.Dynamic.literal(deleteValue = js.Any.fromFunction1(deleteValue), getValue = js.Any.fromFunction1(getValue), setValue = js.Any.fromFunction2(setValue))
      __obj.asInstanceOf[TracingContext]
    }
    
    extension [Self <: TracingContext](x: Self) {
      
      inline def setDeleteValue(value: js.Symbol => TracingContext): Self = StObject.set(x, "deleteValue", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: js.Symbol => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: (js.Symbol, Any) => TracingContext): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    }
  }
}
