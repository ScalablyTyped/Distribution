package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import typings.azureCoreHttp.typesLatestSrcUtilSanitizerMod.Sanitizer
import typings.azureLogger.mod.Debugger
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesLogPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/logPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/logPolicy", "LogPolicy")
  @js.native
  open class LogPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions) = this()
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, param2: LogPolicyOptions) = this()
    
    /**
      * Header names whose values will be logged when logging is enabled. Defaults to
      * Date, traceparent, x-ms-client-request-id, and x-ms-request id.  Any headers
      * specified in this field will be added to that list.  Any other values will
      * be written to logs as "REDACTED".
      * @deprecated Pass these into the constructor instead.
      */
    def allowedHeaderNames: Set[String] = js.native
    /**
      * Header names whose values will be logged when logging is enabled. Defaults to
      * Date, traceparent, x-ms-client-request-id, and x-ms-request id.  Any headers
      * specified in this field will be added to that list.  Any other values will
      * be written to logs as "REDACTED".
      * @deprecated Pass these into the constructor instead.
      */
    def allowedHeaderNames_=(allowedHeaderNames: Set[String]): Unit = js.native
    
    /**
      * Query string names whose values will be logged when logging is enabled. By default no
      * query string values are logged.
      * @deprecated Pass these into the constructor instead.
      */
    def allowedQueryParameters: Set[String] = js.native
    /**
      * Query string names whose values will be logged when logging is enabled. By default no
      * query string values are logged.
      * @deprecated Pass these into the constructor instead.
      */
    def allowedQueryParameters_=(allowedQueryParameters: Set[String]): Unit = js.native
    
    /* private */ var logRequest: Any = js.native
    
    /* private */ var logResponse: Any = js.native
    
    /**
      * Logs the given arguments to the `log` method.
      */
    def logger(args: Any*): Unit = js.native
    @JSName("logger")
    var logger_Original: Debugger = js.native
    
    var sanitizer: Sanitizer = js.native
  }
  
  inline def logPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def logPolicy(loggingOptions: LogPolicyOptions): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")(loggingOptions.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  trait LogPolicyOptions extends StObject {
    
    /**
      * Header names whose values will be logged when logging is enabled. Defaults to:
      * x-ms-client-request-id, x-ms-return-client-request-id, x-ms-useragent, x-ms-correlation-request-id,
      * x-ms-request-id, client-request-id, ms-cv, return-client-request-id, traceparent, Access-Control-Allow-Credentials,
      * Access-Control-Allow-Headers, Access-Control-Allow-Methods, Access-Control-Allow-Origin, Access-Control-Expose-Headers,
      * Access-Control-Max-Age, Access-Control-Request-Headers, Access-Control-Request-Method, Origin, Accept, Accept-Encoding,
      * Cache-Control, Connection, Content-Length, Content-Type, Date, ETag, Expires, If-Match, If-Modified-Since, If-None-Match,
      * If-Unmodified-Since, Last-Modified, Pragma, Request-Id, Retry-After, Server, Transfer-Encoding, and User-Agent.
      *
      * Any headers specified in this field will be added to that list.
      * Any other values will be written to logs as "REDACTED".
      */
    var allowedHeaderNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Query string names whose values will be logged when logging is enabled. By default no
      * query string values are logged.
      */
    var allowedQueryParameters: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The Debugger (logger) instance to use for writing pipeline logs.
      */
    var logger: js.UndefOr[Debugger] = js.undefined
  }
  object LogPolicyOptions {
    
    inline def apply(): LogPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogPolicyOptions]
    }
    
    extension [Self <: LogPolicyOptions](x: Self) {
      
      inline def setAllowedHeaderNames(value: js.Array[String]): Self = StObject.set(x, "allowedHeaderNames", value.asInstanceOf[js.Any])
      
      inline def setAllowedHeaderNamesUndefined: Self = StObject.set(x, "allowedHeaderNames", js.undefined)
      
      inline def setAllowedHeaderNamesVarargs(value: String*): Self = StObject.set(x, "allowedHeaderNames", js.Array(value*))
      
      inline def setAllowedQueryParameters(value: js.Array[String]): Self = StObject.set(x, "allowedQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setAllowedQueryParametersUndefined: Self = StObject.set(x, "allowedQueryParameters", js.undefined)
      
      inline def setAllowedQueryParametersVarargs(value: String*): Self = StObject.set(x, "allowedQueryParameters", js.Array(value*))
      
      inline def setLogger(value: Debugger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
