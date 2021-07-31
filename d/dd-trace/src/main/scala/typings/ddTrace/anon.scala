package typings.ddTrace

import typings.ddTrace.ddTraceStrings.agent
import typings.ddTrace.ddTraceStrings.browser
import typings.ddTrace.ddTraceStrings.log
import typings.ddTrace.mod.SamplingRule
import typings.ddTrace.mod.TransportRequestParams
import typings.ddTrace.mod.anyObject
import typings.ddTrace.mod.plugins.ExecutionArgs
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.opentracing.mod.Span
import typings.std.Error
import typings.std.Number
import typings.std.RegExp
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
          js.Any
        ]
      ] = js.undefined
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(
        value: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[ClientRequest], /* res */ js.UndefOr[IncomingMessage]) => js.Any
      ): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait `1` extends StObject {
    
    /**
      * Hook to execute just before the aws span finishes.
      */
    var request: js.UndefOr[
        js.Function2[/* span */ js.UndefOr[Span], /* response */ js.UndefOr[anyObject], js.Any]
      ] = js.undefined
  }
  object `1` {
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: (/* span */ js.UndefOr[Span], /* response */ js.UndefOr[anyObject]) => js.Any): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
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
          /* res */ js.UndefOr[ServerResponse | IncomingMessage], 
          js.Any
        ]
      ] = js.undefined
  }
  object `2` {
    
    @scala.inline
    def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(
        value: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[IncomingMessage | ClientRequest], /* res */ js.UndefOr[ServerResponse | IncomingMessage]) => js.Any
      ): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait B3 extends StObject {
    
    var b3: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List of origins to whitelist for distributed tracing. This is used to determine whether to propagate context from the browser for CORS.
      * @default []
      */
    var distributedTracingOriginWhitelist: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    /**
      * Whether to enable the experimental `getRumData` method.
      * @default false
      */
    var enableGetRumData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to write traces to log output, rather than send to an agent
      * @default false
      */
    var exporter: js.UndefOr[log | browser | agent] = js.undefined
    
    /**
      * Whether to add an auto-generated `runtime-id` tag to spans and metrics.
      * @default false
      */
    var runtimeId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration of the priority sampler. Supports a global config and rules by span name or service name. The first matching rule is applied, and if no rule matches it falls back to the global config or on the rates provided by the agent if there is no global config.
      */
    var sampler: js.UndefOr[Rules] = js.undefined
  }
  object B3 {
    
    @scala.inline
    def apply(): B3 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[B3]
    }
    
    @scala.inline
    implicit class B3MutableBuilder[Self <: B3] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB3(value: Boolean): Self = StObject.set(x, "b3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB3Undefined: Self = StObject.set(x, "b3", js.undefined)
      
      @scala.inline
      def setDistributedTracingOriginWhitelist(value: js.Array[String | RegExp]): Self = StObject.set(x, "distributedTracingOriginWhitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributedTracingOriginWhitelistUndefined: Self = StObject.set(x, "distributedTracingOriginWhitelist", js.undefined)
      
      @scala.inline
      def setDistributedTracingOriginWhitelistVarargs(value: (String | RegExp)*): Self = StObject.set(x, "distributedTracingOriginWhitelist", js.Array(value :_*))
      
      @scala.inline
      def setEnableGetRumData(value: Boolean): Self = StObject.set(x, "enableGetRumData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGetRumDataUndefined: Self = StObject.set(x, "enableGetRumData", js.undefined)
      
      @scala.inline
      def setExporter(value: log | browser | agent): Self = StObject.set(x, "exporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExporterUndefined: Self = StObject.set(x, "exporter", js.undefined)
      
      @scala.inline
      def setRuntimeId(value: Boolean): Self = StObject.set(x, "runtimeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeIdUndefined: Self = StObject.set(x, "runtimeId", js.undefined)
      
      @scala.inline
      def setSampler(value: Rules): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
    }
  }
  
  @js.native
  trait Debug extends StObject {
    
    def debug(message: String): Unit = js.native
    
    def error(err: String): Unit = js.native
    def error(err: Error): Unit = js.native
    
    def info(message: String): Unit = js.native
    
    def warn(message: String): Unit = js.native
  }
  
  trait Execute extends StObject {
    
    var execute: js.UndefOr[
        js.Function3[
          /* span */ js.UndefOr[typings.ddTrace.mod.Span], 
          /* args */ js.UndefOr[ExecutionArgs], 
          /* res */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
  }
  object Execute {
    
    @scala.inline
    def apply(): Execute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Execute]
    }
    
    @scala.inline
    implicit class ExecuteMutableBuilder[Self <: Execute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(
        value: (/* span */ js.UndefOr[typings.ddTrace.mod.Span], /* args */ js.UndefOr[ExecutionArgs], /* res */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
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
    
    @scala.inline
    def apply(): Hostname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait Query extends StObject {
    
    /**
      * Hook to execute just before the query span finishes.
      */
    var query: js.UndefOr[
        js.Function2[/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams], js.Any]
      ] = js.undefined
  }
  object Query {
    
    @scala.inline
    def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: (/* span */ js.UndefOr[Span], /* params */ js.UndefOr[TransportRequestParams]) => js.Any): Self = StObject.set(x, "query", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait RateLimit extends StObject {
    
    /**
      * Controls the ingestion rate limit between the agent and the backend.
      */
    var rateLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls the ingestion sample rate (between 0 and 1) between the agent and the backend.
      */
    var sampleRate: js.UndefOr[Double] = js.undefined
  }
  object RateLimit {
    
    @scala.inline
    def apply(): RateLimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateLimit]
    }
    
    @scala.inline
    implicit class RateLimitMutableBuilder[Self <: RateLimit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
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
          /* res */ js.UndefOr[ServerResponse], 
          js.Any
        ]
      ] = js.undefined
  }
  object Request {
    
    @scala.inline
    def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(
        value: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[IncomingMessage], /* res */ js.UndefOr[ServerResponse]) => js.Any
      ): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait Rules extends StObject {
    
    /**
      * Global rate limit that is applied on the global sample rate and all rules.
      * @default 100
      */
    var rateLimit: js.UndefOr[Number] = js.undefined
    
    /**
      * Sampling rules to apply to priority sampling.
      * @default []
      */
    var rules: js.UndefOr[js.Array[SamplingRule]] = js.undefined
    
    /**
      * Sample rate to apply globally when no other rule is matched. Omit to fallback on the dynamic rates returned by the agent instead.
      */
    var sampleRate: js.UndefOr[Number] = js.undefined
  }
  object Rules {
    
    @scala.inline
    def apply(): Rules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rules]
    }
    
    @scala.inline
    implicit class RulesMutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRateLimit(value: Number): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[SamplingRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: SamplingRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setSampleRate(value: Number): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
}
