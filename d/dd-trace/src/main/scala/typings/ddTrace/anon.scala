package typings.ddTrace

import typings.ddTrace.ddTraceStrings.agent
import typings.ddTrace.ddTraceStrings.datadog
import typings.ddTrace.ddTraceStrings.log
import typings.ddTrace.mod.Span
import typings.ddTrace.mod.TransportRequestParams
import typings.ddTrace.mod.anyObject
import typings.ddTrace.mod.plugins.ExecutionArgs
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    /**
      * Hook to execute just before the request span finishes.
      */
    var request: js.UndefOr[
        js.Function3[
          /* span */ js.UndefOr[Span], 
          /* req */ js.UndefOr[ClientRequest], 
          /* res */ js.UndefOr[IncomingMessage], 
          Any
        ]
      ] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setRequest(
        value: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[ClientRequest], /* res */ js.UndefOr[IncomingMessage]) => Any
      ): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait `1` extends StObject {
    
    /**
      * Hook to execute just before the aws span finishes.
      */
    var request: js.UndefOr[
        js.Function2[/* span */ js.UndefOr[Span], /* response */ js.UndefOr[anyObject], Any]
      ] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: (/* span */ js.UndefOr[Span], /* response */ js.UndefOr[anyObject]) => Any): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait `2` extends StObject {
    
    /**
      * Hook to execute just before the request span finishes.
      */
    var request: js.UndefOr[
        js.Function3[
          /* span */ js.UndefOr[Span], 
          /* req */ js.UndefOr[IncomingMessage | ClientRequest], 
          /* res */ js.UndefOr[ServerResponse[IncomingMessage] | IncomingMessage], 
          Any
        ]
      ] = js.undefined
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
      
      inline def setRequest(
        value: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[IncomingMessage | ClientRequest], /* res */ js.UndefOr[ServerResponse[IncomingMessage] | IncomingMessage]) => Any
      ): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait B3 extends StObject {
    
    var b3: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to enable the experimental `getRumData` method.
      * @default false
      */
    var enableGetRumData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to write traces to log output or agentless, rather than send to an agent
      * @default false
      */
    var exporter: js.UndefOr[log | agent | datadog] = js.undefined
    
    /**
      * Configuration of the IAST. Can be a boolean as an alias to `iast.enabled`.
      */
    var iast: js.UndefOr[Boolean | DeduplicationEnabled] = js.undefined
    
    /**
      * Whether to add an auto-generated `runtime-id` tag to metrics.
      * @default false
      */
    var runtimeId: js.UndefOr[Boolean] = js.undefined
    
    var traceparent: js.UndefOr[Boolean] = js.undefined
  }
  object B3 {
    
    inline def apply(): B3 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[B3]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: B3] (val x: Self) extends AnyVal {
      
      inline def setB3(value: Boolean): Self = StObject.set(x, "b3", value.asInstanceOf[js.Any])
      
      inline def setB3Undefined: Self = StObject.set(x, "b3", js.undefined)
      
      inline def setEnableGetRumData(value: Boolean): Self = StObject.set(x, "enableGetRumData", value.asInstanceOf[js.Any])
      
      inline def setEnableGetRumDataUndefined: Self = StObject.set(x, "enableGetRumData", js.undefined)
      
      inline def setExporter(value: log | agent | datadog): Self = StObject.set(x, "exporter", value.asInstanceOf[js.Any])
      
      inline def setExporterUndefined: Self = StObject.set(x, "exporter", js.undefined)
      
      inline def setIast(value: Boolean | DeduplicationEnabled): Self = StObject.set(x, "iast", value.asInstanceOf[js.Any])
      
      inline def setIastUndefined: Self = StObject.set(x, "iast", js.undefined)
      
      inline def setRuntimeId(value: Boolean): Self = StObject.set(x, "runtimeId", value.asInstanceOf[js.Any])
      
      inline def setRuntimeIdUndefined: Self = StObject.set(x, "runtimeId", js.undefined)
      
      inline def setTraceparent(value: Boolean): Self = StObject.set(x, "traceparent", value.asInstanceOf[js.Any])
      
      inline def setTraceparentUndefined: Self = StObject.set(x, "traceparent", js.undefined)
    }
  }
  
  trait BlockedTemplateHtml extends StObject {
    
    /**
      * Specifies a path to a custom blocking template html file.
      */
    var blockedTemplateHtml: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a path to a custom blocking template json file.
      */
    var blockedTemplateJson: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to enable AppSec.
      * @default false
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a regex that will redact sensitive data by its key in attack reports.
      */
    var obfuscatorKeyRegex: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a regex that will redact sensitive data by its value in attack reports.
      */
    var obfuscatorValueRegex: js.UndefOr[String] = js.undefined
    
    /**
      * Controls the maximum amount of traces sampled by AppSec attacks, per second.
      * @default 100
      */
    var rateLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies a path to a custom rules file.
      */
    var rules: js.UndefOr[String] = js.undefined
    
    /**
      * Controls the maximum amount of time in microseconds the WAF is allowed to run synchronously for.
      * @default 5000
      */
    var wafTimeout: js.UndefOr[Double] = js.undefined
  }
  object BlockedTemplateHtml {
    
    inline def apply(): BlockedTemplateHtml = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockedTemplateHtml]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockedTemplateHtml] (val x: Self) extends AnyVal {
      
      inline def setBlockedTemplateHtml(value: String): Self = StObject.set(x, "blockedTemplateHtml", value.asInstanceOf[js.Any])
      
      inline def setBlockedTemplateHtmlUndefined: Self = StObject.set(x, "blockedTemplateHtml", js.undefined)
      
      inline def setBlockedTemplateJson(value: String): Self = StObject.set(x, "blockedTemplateJson", value.asInstanceOf[js.Any])
      
      inline def setBlockedTemplateJsonUndefined: Self = StObject.set(x, "blockedTemplateJson", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setObfuscatorKeyRegex(value: String): Self = StObject.set(x, "obfuscatorKeyRegex", value.asInstanceOf[js.Any])
      
      inline def setObfuscatorKeyRegexUndefined: Self = StObject.set(x, "obfuscatorKeyRegex", js.undefined)
      
      inline def setObfuscatorValueRegex(value: String): Self = StObject.set(x, "obfuscatorValueRegex", value.asInstanceOf[js.Any])
      
      inline def setObfuscatorValueRegexUndefined: Self = StObject.set(x, "obfuscatorValueRegex", js.undefined)
      
      inline def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      inline def setRules(value: String): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setWafTimeout(value: Double): Self = StObject.set(x, "wafTimeout", value.asInstanceOf[js.Any])
      
      inline def setWafTimeoutUndefined: Self = StObject.set(x, "wafTimeout", js.undefined)
    }
  }
  
  @js.native
  trait Debug extends StObject {
    
    def debug(message: String): Unit = js.native
    
    def error(err: String): Unit = js.native
    def error(err: js.Error): Unit = js.native
    
    def info(message: String): Unit = js.native
    
    def warn(message: String): Unit = js.native
  }
  
  trait DeduplicationEnabled extends StObject {
    
    /**
      * Whether to enable vulnerability deduplication
      */
    var deduplicationEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to enable IAST.
      * @default false
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls how many request can be analyzing code vulnerabilities at the same time
      * @default 2
      */
    var maxConcurrentRequests: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls how many code vulnerabilities can be detected in the same request
      * @default 2
      */
    var maxContextOperations: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to enable vulnerability redaction
      * @default true
      */
    var redactionEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the percentage of requests that iast will analyze
      * @default 30
      */
    var requestSampling: js.UndefOr[Double] = js.undefined
  }
  object DeduplicationEnabled {
    
    inline def apply(): DeduplicationEnabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeduplicationEnabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeduplicationEnabled] (val x: Self) extends AnyVal {
      
      inline def setDeduplicationEnabled(value: Boolean): Self = StObject.set(x, "deduplicationEnabled", value.asInstanceOf[js.Any])
      
      inline def setDeduplicationEnabledUndefined: Self = StObject.set(x, "deduplicationEnabled", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setMaxConcurrentRequests(value: Double): Self = StObject.set(x, "maxConcurrentRequests", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentRequestsUndefined: Self = StObject.set(x, "maxConcurrentRequests", js.undefined)
      
      inline def setMaxContextOperations(value: Double): Self = StObject.set(x, "maxContextOperations", value.asInstanceOf[js.Any])
      
      inline def setMaxContextOperationsUndefined: Self = StObject.set(x, "maxContextOperations", js.undefined)
      
      inline def setRedactionEnabled(value: Boolean): Self = StObject.set(x, "redactionEnabled", value.asInstanceOf[js.Any])
      
      inline def setRedactionEnabledUndefined: Self = StObject.set(x, "redactionEnabled", js.undefined)
      
      inline def setRequestSampling(value: Double): Self = StObject.set(x, "requestSampling", value.asInstanceOf[js.Any])
      
      inline def setRequestSamplingUndefined: Self = StObject.set(x, "requestSampling", js.undefined)
    }
  }
  
  trait Execute extends StObject {
    
    var execute: js.UndefOr[
        js.Function3[
          /* span */ js.UndefOr[Span], 
          /* args */ js.UndefOr[ExecutionArgs], 
          /* res */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    var parse: js.UndefOr[
        js.Function3[
          /* span */ js.UndefOr[Span], 
          /* source */ js.UndefOr[Any], 
          /* document */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    var validate: js.UndefOr[
        js.Function3[
          /* span */ js.UndefOr[Span], 
          /* document */ js.UndefOr[Any], 
          /* errors */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
  }
  object Execute {
    
    inline def apply(): Execute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Execute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Execute] (val x: Self) extends AnyVal {
      
      inline def setExecute(
        value: (/* span */ js.UndefOr[Span], /* args */ js.UndefOr[ExecutionArgs], /* res */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
      
      inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      inline def setParse(
        value: (/* span */ js.UndefOr[Span], /* source */ js.UndefOr[Any], /* document */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setValidate(
        value: (/* span */ js.UndefOr[Span], /* document */ js.UndefOr[Any], /* errors */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Hostname extends StObject {
    
    /**
      * The hostname of the Dogstatsd agent that the metrics will submitted to.
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * The port of the Dogstatsd agent that the metrics will submitted to.
      * @default 8125
      */
    var port: js.UndefOr[Double] = js.undefined
  }
  object Hostname {
    
    inline def apply(): Hostname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait PollInterval extends StObject {
    
    /**
      * Specifies the remote configuration polling interval in seconds
      * @default 5
      */
    var pollInterval: js.UndefOr[Double] = js.undefined
  }
  object PollInterval {
    
    inline def apply(): PollInterval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PollInterval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PollInterval] (val x: Self) extends AnyVal {
      
      inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      inline def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
    }
  }
  
  trait Query extends StObject {
    
    /**
      * Hook to execute just before the query span finishes.
      */
    var query: js.UndefOr[
        js.Function2[/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams], Any]
      ] = js.undefined
  }
  object Query {
    
    inline def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: (/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams]) => Any): Self = StObject.set(x, "query", js.Any.fromFunction2(value))
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait RateLimit extends StObject {
    
    /**
      * Controls the ingestion rate limit between the agent and the backend. Defaults to deferring the decision to the agent.
      */
    var rateLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls the ingestion sample rate (between 0 and 1) between the agent and the backend.
      */
    var sampleRate: js.UndefOr[Double] = js.undefined
  }
  object RateLimit {
    
    inline def apply(): RateLimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateLimit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RateLimit] (val x: Self) extends AnyVal {
      
      inline def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
  
  trait Receive extends StObject {
    
    /**
      * Hook to execute just when the span is created.
      */
    var receive: js.UndefOr[js.Function2[/* span */ js.UndefOr[Span], /* request */ js.UndefOr[Any], Any]] = js.undefined
    
    /**
      * Hook to execute just when the span is finished.
      */
    var reply: js.UndefOr[
        js.Function3[
          /* span */ js.UndefOr[Span], 
          /* request */ js.UndefOr[Any], 
          /* response */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
  }
  object Receive {
    
    inline def apply(): Receive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Receive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Receive] (val x: Self) extends AnyVal {
      
      inline def setReceive(value: (/* span */ js.UndefOr[Span], /* request */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "receive", js.Any.fromFunction2(value))
      
      inline def setReceiveUndefined: Self = StObject.set(x, "receive", js.undefined)
      
      inline def setReply(
        value: (/* span */ js.UndefOr[Span], /* request */ js.UndefOr[Any], /* response */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "reply", js.Any.fromFunction3(value))
      
      inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    /**
      * Hook to execute just before the request span finishes.
      */
    var request: js.UndefOr[
        js.Function3[
          /* span */ js.UndefOr[Span], 
          /* req */ js.UndefOr[IncomingMessage], 
          /* res */ js.UndefOr[ServerResponse[IncomingMessage]], 
          Any
        ]
      ] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setRequest(
        value: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[IncomingMessage], /* res */ js.UndefOr[ServerResponse[IncomingMessage]]) => Any
      ): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
}
