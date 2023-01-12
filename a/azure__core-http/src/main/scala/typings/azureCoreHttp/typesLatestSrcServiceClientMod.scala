package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreAuth.mod.TokenCredential
import typings.azureCoreHttp.typesLatestSrcCredentialsServiceClientCredentialsMod.ServiceClientCredentials
import typings.azureCoreHttp.typesLatestSrcHttpClientMod.HttpClient
import typings.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.RestResponse
import typings.azureCoreHttp.typesLatestSrcHttpPipelineLoggerMod.HttpPipelineLogger
import typings.azureCoreHttp.typesLatestSrcOperationArgumentsMod.OperationArguments
import typings.azureCoreHttp.typesLatestSrcOperationParameterMod.ParameterPath
import typings.azureCoreHttp.typesLatestSrcOperationResponseMod.OperationResponse
import typings.azureCoreHttp.typesLatestSrcOperationSpecMod.OperationSpec
import typings.azureCoreHttp.typesLatestSrcPipelineOptionsMod.InternalPipelineOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesDeserializationPolicyMod.DeserializationContentTypes
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcSerializerMod.Mapper
import typings.azureCoreHttp.typesLatestSrcSerializerMod.Serializer
import typings.azureCoreHttp.typesLatestSrcUtilUtilsMod.ServiceCallback
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.RequestPrepareOptions
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcServiceClientMod {
  
  @JSImport("@azure/core-http/types/latest/src/serviceClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/serviceClient", "ServiceClient")
  @js.native
  /**
    * The ServiceClient constructor
    * @param credentials - The credentials used for authentication with the service.
    * @param options - The service client options that govern the behavior of the client.
    */
  open class ServiceClient () extends StObject {
    def this(credentials: TokenCredential) = this()
    def this(credentials: ServiceClientCredentials) = this()
    def this(credentials: Unit, options: ServiceClientOptions) = this()
    def this(credentials: TokenCredential, options: ServiceClientOptions) = this()
    def this(credentials: ServiceClientCredentials, options: ServiceClientOptions) = this()
    
    /**
      * The HTTP client that will be used to send requests.
      */
    /* private */ val _httpClient: Any = js.native
    
    /* private */ val _requestPolicyFactories: Any = js.native
    
    /* private */ val _requestPolicyOptions: Any = js.native
    
    /* private */ val _withCredentials: Any = js.native
    
    /**
      * If specified, this is the base URI that requests will be made against for this ServiceClient.
      * If it is not specified, then all OperationSpecs must contain a baseUrl property.
      */
    /* protected */ var baseUri: js.UndefOr[String] = js.native
    
    /**
      * The default request content type for the service.
      * Used if no requestContentType is present on an OperationSpec.
      */
    /* protected */ var requestContentType: js.UndefOr[String] = js.native
    
    /**
      * Send an HTTP request that is populated using the provided OperationSpec.
      * @param operationArguments - The arguments that the HTTP request's templated values will be populated from.
      * @param operationSpec - The OperationSpec to use to populate the httpRequest.
      * @param callback - The callback to call when the response is received.
      */
    def sendOperationRequest(operationArguments: OperationArguments, operationSpec: OperationSpec): js.Promise[RestResponse] = js.native
    def sendOperationRequest(
      operationArguments: OperationArguments,
      operationSpec: OperationSpec,
      callback: ServiceCallback[Any]
    ): js.Promise[RestResponse] = js.native
    
    /**
      * Send the provided httpRequest.
      */
    def sendRequest(options: RequestPrepareOptions): js.Promise[HttpOperationResponse] = js.native
    def sendRequest(options: WebResourceLike): js.Promise[HttpOperationResponse] = js.native
  }
  
  inline def createPipelineFromOptions(pipelineOptions: InternalPipelineOptions): ServiceClientOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineFromOptions")(pipelineOptions.asInstanceOf[js.Any]).asInstanceOf[ServiceClientOptions]
  inline def createPipelineFromOptions(pipelineOptions: InternalPipelineOptions, authPolicyFactory: RequestPolicyFactory): ServiceClientOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineFromOptions")(pipelineOptions.asInstanceOf[js.Any], authPolicyFactory.asInstanceOf[js.Any])).asInstanceOf[ServiceClientOptions]
  
  inline def flattenResponse(_response: HttpOperationResponse): RestResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenResponse")(_response.asInstanceOf[js.Any]).asInstanceOf[RestResponse]
  inline def flattenResponse(_response: HttpOperationResponse, responseSpec: OperationResponse): RestResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenResponse")(_response.asInstanceOf[js.Any], responseSpec.asInstanceOf[js.Any])).asInstanceOf[RestResponse]
  
  inline def getOperationArgumentValueFromParameterPath(
    serviceClient: ServiceClient,
    operationArguments: OperationArguments,
    parameterPath: ParameterPath,
    parameterMapper: Mapper,
    serializer: Serializer
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOperationArgumentValueFromParameterPath")(serviceClient.asInstanceOf[js.Any], operationArguments.asInstanceOf[js.Any], parameterPath.asInstanceOf[js.Any], parameterMapper.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getPropertyParent(parent: PropertyParent, propertyPath: js.Array[String]): PropertyParent = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyParent")(parent.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[PropertyParent]
  
  inline def serializeRequestBody(
    serviceClient: ServiceClient,
    httpRequest: WebResourceLike,
    operationArguments: OperationArguments,
    operationSpec: OperationSpec
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeRequestBody")(serviceClient.asInstanceOf[js.Any], httpRequest.asInstanceOf[js.Any], operationArguments.asInstanceOf[js.Any], operationSpec.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type PropertyParent = StringDictionary[Any]
  
  type ProxyOptions = ProxySettings
  
  trait ProxySettings extends StObject {
    
    /**
      * The proxy's host address.
      */
    var host: String
    
    /**
      * The password to authenticate with the proxy, if required.
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * The proxy host's port.
      */
    var port: Double
    
    /**
      * The user name to authenticate with the proxy, if required.
      */
    var username: js.UndefOr[String] = js.undefined
  }
  object ProxySettings {
    
    inline def apply(host: String, port: Double): ProxySettings = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxySettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProxySettings] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait ServiceClientOptions extends StObject {
    
    /**
      * If specified, a GenerateRequestIdPolicy will be added to the HTTP pipeline that will add a
      * header to all outgoing requests with this header name and a random UUID as the request ID.
      */
    var clientRequestIdHeaderName: js.UndefOr[String] = js.undefined
    
    /**
      * If specified, will be used to build the BearerTokenAuthenticationPolicy.
      */
    var credentialScopes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The content-types that will be associated with JSON or XML serialization.
      */
    var deserializationContentTypes: js.UndefOr[DeserializationContentTypes] = js.undefined
    
    /**
      * Whether or not to generate a client request ID header for each HTTP request.
      */
    var generateClientRequestIdHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HttpClient that will be used to send HTTP requests.
      */
    var httpClient: js.UndefOr[HttpClient] = js.undefined
    
    /**
      * The HttpPipelineLogger that can be used to debug RequestPolicies within the HTTP pipeline.
      */
    var httpPipelineLogger: js.UndefOr[HttpPipelineLogger] = js.undefined
    
    /**
      * If set to true, turn off the default retry policy.
      */
    var noRetryPolicy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Proxy settings which will be used for every HTTP request (Node.js only).
      */
    var proxySettings: js.UndefOr[ProxySettings] = js.undefined
    
    /**
      * An array of factories which get called to create the RequestPolicy pipeline used to send a HTTP
      * request on the wire, or a function that takes in the defaultRequestPolicyFactories and returns
      * the requestPolicyFactories that will be used.
      */
    var requestPolicyFactories: js.UndefOr[
        js.Array[RequestPolicyFactory] | (js.Function1[
          /* defaultRequestPolicyFactories */ js.Array[RequestPolicyFactory], 
          Unit | js.Array[RequestPolicyFactory]
        ])
      ] = js.undefined
    
    /**
      * Gets or sets the retry timeout in seconds for AutomaticRPRegistration. Default value is 30.
      */
    var rpRegistrationRetryTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The string to be set to the telemetry header while sending the request, or a function that
      * takes in the default user-agent string and returns the user-agent string that will be used.
      */
    var userAgent: js.UndefOr[String | (js.Function1[/* defaultUserAgent */ String, String])] = js.undefined
    
    /**
      * The header name to use for the telemetry header while sending the request. If this is not
      * specified, then "User-Agent" will be used when running on Node.js and "x-ms-useragent" will
      * be used when running in a browser.
      */
    var userAgentHeaderName: js.UndefOr[String | (js.Function1[/* defaultUserAgentHeaderName */ String, String])] = js.undefined
    
    /**
      * Whether to include credentials in CORS requests in the browser.
      * See https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/withCredentials for more information.
      */
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object ServiceClientOptions {
    
    inline def apply(): ServiceClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceClientOptions] (val x: Self) extends AnyVal {
      
      inline def setClientRequestIdHeaderName(value: String): Self = StObject.set(x, "clientRequestIdHeaderName", value.asInstanceOf[js.Any])
      
      inline def setClientRequestIdHeaderNameUndefined: Self = StObject.set(x, "clientRequestIdHeaderName", js.undefined)
      
      inline def setCredentialScopes(value: String | js.Array[String]): Self = StObject.set(x, "credentialScopes", value.asInstanceOf[js.Any])
      
      inline def setCredentialScopesUndefined: Self = StObject.set(x, "credentialScopes", js.undefined)
      
      inline def setCredentialScopesVarargs(value: String*): Self = StObject.set(x, "credentialScopes", js.Array(value*))
      
      inline def setDeserializationContentTypes(value: DeserializationContentTypes): Self = StObject.set(x, "deserializationContentTypes", value.asInstanceOf[js.Any])
      
      inline def setDeserializationContentTypesUndefined: Self = StObject.set(x, "deserializationContentTypes", js.undefined)
      
      inline def setGenerateClientRequestIdHeader(value: Boolean): Self = StObject.set(x, "generateClientRequestIdHeader", value.asInstanceOf[js.Any])
      
      inline def setGenerateClientRequestIdHeaderUndefined: Self = StObject.set(x, "generateClientRequestIdHeader", js.undefined)
      
      inline def setHttpClient(value: HttpClient): Self = StObject.set(x, "httpClient", value.asInstanceOf[js.Any])
      
      inline def setHttpClientUndefined: Self = StObject.set(x, "httpClient", js.undefined)
      
      inline def setHttpPipelineLogger(value: HttpPipelineLogger): Self = StObject.set(x, "httpPipelineLogger", value.asInstanceOf[js.Any])
      
      inline def setHttpPipelineLoggerUndefined: Self = StObject.set(x, "httpPipelineLogger", js.undefined)
      
      inline def setNoRetryPolicy(value: Boolean): Self = StObject.set(x, "noRetryPolicy", value.asInstanceOf[js.Any])
      
      inline def setNoRetryPolicyUndefined: Self = StObject.set(x, "noRetryPolicy", js.undefined)
      
      inline def setProxySettings(value: ProxySettings): Self = StObject.set(x, "proxySettings", value.asInstanceOf[js.Any])
      
      inline def setProxySettingsUndefined: Self = StObject.set(x, "proxySettings", js.undefined)
      
      inline def setRequestPolicyFactories(
        value: js.Array[RequestPolicyFactory] | (js.Function1[
              /* defaultRequestPolicyFactories */ js.Array[RequestPolicyFactory], 
              Unit | js.Array[RequestPolicyFactory]
            ])
      ): Self = StObject.set(x, "requestPolicyFactories", value.asInstanceOf[js.Any])
      
      inline def setRequestPolicyFactoriesFunction1(
        value: /* defaultRequestPolicyFactories */ js.Array[RequestPolicyFactory] => Unit | js.Array[RequestPolicyFactory]
      ): Self = StObject.set(x, "requestPolicyFactories", js.Any.fromFunction1(value))
      
      inline def setRequestPolicyFactoriesUndefined: Self = StObject.set(x, "requestPolicyFactories", js.undefined)
      
      inline def setRequestPolicyFactoriesVarargs(value: RequestPolicyFactory*): Self = StObject.set(x, "requestPolicyFactories", js.Array(value*))
      
      inline def setRpRegistrationRetryTimeout(value: Double): Self = StObject.set(x, "rpRegistrationRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setRpRegistrationRetryTimeoutUndefined: Self = StObject.set(x, "rpRegistrationRetryTimeout", js.undefined)
      
      inline def setUserAgent(value: String | (js.Function1[/* defaultUserAgent */ String, String])): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentFunction1(value: /* defaultUserAgent */ String => String): Self = StObject.set(x, "userAgent", js.Any.fromFunction1(value))
      
      inline def setUserAgentHeaderName(value: String | (js.Function1[/* defaultUserAgentHeaderName */ String, String])): Self = StObject.set(x, "userAgentHeaderName", value.asInstanceOf[js.Any])
      
      inline def setUserAgentHeaderNameFunction1(value: /* defaultUserAgentHeaderName */ String => String): Self = StObject.set(x, "userAgentHeaderName", js.Any.fromFunction1(value))
      
      inline def setUserAgentHeaderNameUndefined: Self = StObject.set(x, "userAgentHeaderName", js.undefined)
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
