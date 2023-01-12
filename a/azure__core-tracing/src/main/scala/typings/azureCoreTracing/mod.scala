package typings.azureCoreTracing

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreTracing.anon.OmitTracingSpanend
import typings.azureCoreTracing.anon.Span
import typings.azureCoreTracing.anon.TracingOptions
import typings.azureCoreTracing.anon.TracingOptionsTracingContext
import typings.azureCoreTracing.anon.UpdatedOptions
import typings.azureCoreTracing.azureCoreTracingStrings.error
import typings.azureCoreTracing.azureCoreTracingStrings.success
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/core-tracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTracingClient(options: TracingClientOptions): TracingClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createTracingClient")(options.asInstanceOf[js.Any]).asInstanceOf[TracingClient]
  
  inline def useInstrumenter(instrumenter: Instrumenter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInstrumenter")(instrumenter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Instrumenter extends StObject {
    
    /**
      * Provides an implementation-specific method to serialize a {@link TracingSpan} to a set of headers.
      * @param tracingContext - The context containing the span to serialize.
      */
    def createRequestHeaders(): Record[String, String] = js.native
    def createRequestHeaders(tracingContext: TracingContext): Record[String, String] = js.native
    
    /**
      * Provides an implementation-specific method to parse a {@link https://www.w3.org/TR/trace-context/#traceparent-header}
      * into a {@link TracingSpanContext} which can be used to link non-parented spans together.
      */
    def parseTraceparentHeader(traceparentHeader: String): js.UndefOr[TracingContext] = js.native
    
    /**
      * Creates a new {@link TracingSpan} with the given name and options and sets it on a new context.
      * @param name - The name of the span. By convention this should be `${className}.${methodName}`.
      * @param spanOptions - The options to use when creating the span.
      *
      * @returns A {@link TracingSpan} that can be used to end the span, and the context this span has been set on.
      */
    def startSpan(name: String, spanOptions: InstrumenterSpanOptions): Span = js.native
    
    /**
      * Wraps a callback with an active context and calls the callback.
      * Depending on the implementation, this may set the globally available active context.
      *
      * @param context - The {@link TracingContext} to use as the active context in the scope of the callback.
      * @param callback - The callback to be invoked with the given context set as the globally active context.
      * @param callbackArgs - The callback arguments.
      */
    def withContext[CallbackArgs /* <: js.Array[Any] */, Callback /* <: js.Function1[/* args */ CallbackArgs, ReturnType[Callback]] */](
      context: TracingContext,
      callback: Callback,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param callbackArgs because its type CallbackArgs is not an array type */ callbackArgs: CallbackArgs
    ): ReturnType[Callback] = js.native
  }
  
  trait InstrumenterSpanOptions
    extends StObject
       with TracingSpanOptions {
    
    /** The name of the package invoking this trace. */
    var packageName: String
    
    /** The version of the package invoking this trace. */
    var packageVersion: js.UndefOr[String] = js.undefined
    
    /** The current tracing context. Defaults to an implementation-specific "active" context. */
    var tracingContext: js.UndefOr[TracingContext] = js.undefined
  }
  object InstrumenterSpanOptions {
    
    inline def apply(packageName: String): InstrumenterSpanOptions = {
      val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstrumenterSpanOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstrumenterSpanOptions] (val x: Self) extends AnyVal {
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
      
      inline def setPackageVersionUndefined: Self = StObject.set(x, "packageVersion", js.undefined)
      
      inline def setTracingContext(value: TracingContext): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
      
      inline def setTracingContextUndefined: Self = StObject.set(x, "tracingContext", js.undefined)
    }
  }
  
  trait OperationTracingOptions extends StObject {
    
    /** The context to use for created Tracing Spans. */
    var tracingContext: js.UndefOr[TracingContext] = js.undefined
  }
  object OperationTracingOptions {
    
    inline def apply(): OperationTracingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationTracingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationTracingOptions] (val x: Self) extends AnyVal {
      
      inline def setTracingContext(value: TracingContext): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
      
      inline def setTracingContextUndefined: Self = StObject.set(x, "tracingContext", js.undefined)
    }
  }
  
  type OptionsWithTracingContext[Options /* <: TracingOptions */] = Options & TracingOptionsTracingContext
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends {then (onfulfilled : infer F): any} ? F extends (value : infer V): any ? @azure/core-tracing.@azure/core-tracing.Resolved<V> : never : T
    }}}
    */
  type Resolved[T] = T
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureCoreTracing.mod.SpanStatusSuccess
    - typings.azureCoreTracing.mod.SpanStatusError
  */
  trait SpanStatus extends StObject
  object SpanStatus {
    
    inline def SpanStatusError(): typings.azureCoreTracing.mod.SpanStatusError = {
      val __obj = js.Dynamic.literal(status = "error")
      __obj.asInstanceOf[typings.azureCoreTracing.mod.SpanStatusError]
    }
    
    inline def SpanStatusSuccess(): typings.azureCoreTracing.mod.SpanStatusSuccess = {
      val __obj = js.Dynamic.literal(status = "success")
      __obj.asInstanceOf[typings.azureCoreTracing.mod.SpanStatusSuccess]
    }
  }
  
  trait SpanStatusError
    extends StObject
       with SpanStatus {
    
    var error: js.UndefOr[js.Error | String] = js.undefined
    
    var status: error
  }
  object SpanStatusError {
    
    inline def apply(): SpanStatusError = {
      val __obj = js.Dynamic.literal(status = "error")
      __obj.asInstanceOf[SpanStatusError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpanStatusError] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error | String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setStatus(value: error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpanStatusSuccess
    extends StObject
       with SpanStatus {
    
    var status: success
  }
  object SpanStatusSuccess {
    
    inline def apply(): SpanStatusSuccess = {
      val __obj = js.Dynamic.literal(status = "success")
      __obj.asInstanceOf[SpanStatusSuccess]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpanStatusSuccess] (val x: Self) extends AnyVal {
      
      inline def setStatus(value: success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TracingClient extends StObject {
    
    /**
      * Creates a set of request headers to propagate tracing information to a backend.
      *
      * @param tracingContext - The context containing the span to propagate.
      * @returns The set of headers to add to a request.
      */
    def createRequestHeaders(): Record[String, String] = js.native
    def createRequestHeaders(tracingContext: TracingContext): Record[String, String] = js.native
    
    /**
      * Parses a traceparent header value into a {@link TracingSpanContext}.
      *
      * @param traceparentHeader - The traceparent header to parse.
      * @returns An implementation-specific identifier for the span.
      */
    def parseTraceparentHeader(traceparentHeader: String): js.UndefOr[TracingContext] = js.native
    
    /**
      * Starts a given span but does not set it as the active span.
      *
      * You must end the span using {@link TracingSpan.end}.
      *
      * Most of the time you will want to use {@link withSpan} instead.
      *
      * @param name - The name of the span. By convention this should be `${className}.${methodName}`.
      * @param operationOptions - The original operation options.
      * @param spanOptions - The options to use when creating the span.
      *
      * @returns A {@link TracingSpan} and the updated operation options.
      */
    def startSpan[Options /* <: TracingOptions */](name: String): UpdatedOptions[Options] = js.native
    def startSpan[Options /* <: TracingOptions */](name: String, operationOptions: Options): UpdatedOptions[Options] = js.native
    def startSpan[Options /* <: TracingOptions */](name: String, operationOptions: Options, spanOptions: TracingSpanOptions): UpdatedOptions[Options] = js.native
    def startSpan[Options /* <: TracingOptions */](name: String, operationOptions: Unit, spanOptions: TracingSpanOptions): UpdatedOptions[Options] = js.native
    
    /**
      * Wraps a callback with an active context and calls the callback.
      * Depending on the implementation, this may set the globally available active context.
      *
      * Useful when you want to leave the boundaries of the SDK (make a request or callback to user code) and are unable to use the {@link withSpan} API.
      *
      * @param context - The {@link TracingContext} to use as the active context in the scope of the callback.
      * @param callback - The callback to be invoked with the given context set as the globally active context.
      * @param callbackArgs - The callback arguments.
      */
    def withContext[CallbackArgs /* <: js.Array[Any] */, Callback /* <: js.Function1[/* args */ CallbackArgs, ReturnType[Callback]] */](
      context: TracingContext,
      callback: Callback,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param callbackArgs because its type CallbackArgs is not an array type */ callbackArgs: CallbackArgs
    ): ReturnType[Callback] = js.native
    
    /**
      * Wraps a callback in a tracing span, calls the callback, and closes the span.
      *
      * This is the primary interface for using Tracing and will handle error recording as well as setting the status on the span.
      *
      * Both synchronous and asynchronous functions will be awaited in order to reflect the result of the callback on the span.
      *
      * Example:
      *
      * ```ts
      * const myOperationResult = await tracingClient.withSpan("myClassName.myOperationName", options, (updatedOptions) => myOperation(updatedOptions));
      * ```
      * @param name - The name of the span. By convention this should be `${className}.${methodName}`.
      * @param operationOptions - The original options passed to the method. The callback will receive these options with the newly created {@link TracingContext}.
      * @param callback - The callback to be invoked with the updated options and newly created {@link TracingSpan}.
      */
    def withSpan[Options /* <: TracingOptions */, Callback /* <: js.Function2[/* updatedOptions */ Options, /* span */ OmitTracingSpanend, ReturnType[Callback]] */](name: String, operationOptions: Options, callback: Callback): js.Promise[Resolved[ReturnType[Callback]]] = js.native
    def withSpan[Options /* <: TracingOptions */, Callback /* <: js.Function2[/* updatedOptions */ Options, /* span */ OmitTracingSpanend, ReturnType[Callback]] */](name: String, operationOptions: Options, callback: Callback, spanOptions: TracingSpanOptions): js.Promise[Resolved[ReturnType[Callback]]] = js.native
  }
  
  trait TracingClientOptions extends StObject {
    
    /** The value of the az.namespace tracing attribute on newly created spans. */
    var namespace: String
    
    /** The name of the package invoking this trace. */
    var packageName: String
    
    /** An optional version of the package invoking this trace. */
    var packageVersion: js.UndefOr[String] = js.undefined
  }
  object TracingClientOptions {
    
    inline def apply(namespace: String, packageName: String): TracingClientOptions = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracingClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TracingClientOptions] (val x: Self) extends AnyVal {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
      
      inline def setPackageVersionUndefined: Self = StObject.set(x, "packageVersion", js.undefined)
    }
  }
  
  trait TracingContext extends StObject {
    
    /**
      * Deletes an object from the context if it exists.
      * @param key - The key of the given context value to delete.
      */
    def deleteValue(key: js.Symbol): TracingContext
    
    /**
      * Gets an object from the context if it exists.
      * @param key - The key of the given context value.
      *
      * @returns - The value of the given context value if it exists, otherwise `undefined`.
      */
    def getValue(key: js.Symbol): Any
    
    /**
      * Sets a given object on a context.
      * @param key - The key of the given context value.
      * @param value - The value to set on the context.
      *
      * @returns - A new context with the given value set.
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TracingContext] (val x: Self) extends AnyVal {
      
      inline def setDeleteValue(value: js.Symbol => TracingContext): Self = StObject.set(x, "deleteValue", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: js.Symbol => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: (js.Symbol, Any) => TracingContext): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait TracingSpan extends StObject {
    
    /**
      * Ends the span.
      */
    def end(): Unit = js.native
    
    /**
      * Returns true if this {@link TracingSpan} is recording information.
      *
      * Depending on the span implementation, this may return false if the span is not being sampled.
      */
    def isRecording(): Boolean = js.native
    
    def recordException(exception: String): Unit = js.native
    /**
      * Records an exception on a {@link TracingSpan} without modifying its status.
      *
      * When recording an unhandled exception that should fail the span, please use {@link TracingSpan.setStatus} instead.
      *
      * @param exception - The exception to record on the span.
      *
      */
    def recordException(exception: js.Error): Unit = js.native
    
    /**
      * Sets a given attribute on a span.
      *
      * @param name - The attribute's name.
      * @param value - The attribute's value to set. May be any non-nullish value.
      */
    def setAttribute(name: String, value: Any): Unit = js.native
    
    /**
      * Sets the status of the span. When an error is provided, it will be recorded on the span as well.
      *
      * @param status - The {@link SpanStatus} to set on the span.
      */
    def setStatus(status: SpanStatus): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureCoreTracing.azureCoreTracingStrings.client
    - typings.azureCoreTracing.azureCoreTracingStrings.server
    - typings.azureCoreTracing.azureCoreTracingStrings.producer
    - typings.azureCoreTracing.azureCoreTracingStrings.consumer
    - typings.azureCoreTracing.azureCoreTracingStrings.internal
  */
  trait TracingSpanKind extends StObject
  object TracingSpanKind {
    
    inline def client: typings.azureCoreTracing.azureCoreTracingStrings.client = "client".asInstanceOf[typings.azureCoreTracing.azureCoreTracingStrings.client]
    
    inline def consumer: typings.azureCoreTracing.azureCoreTracingStrings.consumer = "consumer".asInstanceOf[typings.azureCoreTracing.azureCoreTracingStrings.consumer]
    
    inline def internal: typings.azureCoreTracing.azureCoreTracingStrings.internal = "internal".asInstanceOf[typings.azureCoreTracing.azureCoreTracingStrings.internal]
    
    inline def producer: typings.azureCoreTracing.azureCoreTracingStrings.producer = "producer".asInstanceOf[typings.azureCoreTracing.azureCoreTracingStrings.producer]
    
    inline def server: typings.azureCoreTracing.azureCoreTracingStrings.server = "server".asInstanceOf[typings.azureCoreTracing.azureCoreTracingStrings.server]
  }
  
  trait TracingSpanLink extends StObject {
    
    /** A set of attributes on the link. */
    var attributes: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /** The {@link TracingContext} containing the span context to link to. */
    var tracingContext: TracingContext
  }
  object TracingSpanLink {
    
    inline def apply(tracingContext: TracingContext): TracingSpanLink = {
      val __obj = js.Dynamic.literal(tracingContext = tracingContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracingSpanLink]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TracingSpanLink] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setTracingContext(value: TracingContext): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait TracingSpanOptions extends StObject {
    
    /** Initial set of attributes to set on a span. */
    var spanAttributes: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /** The kind of span. Implementations should default this to "client". */
    var spanKind: js.UndefOr[TracingSpanKind] = js.undefined
    
    /** A collection of {@link TracingSpanLink} to link to this span. */
    var spanLinks: js.UndefOr[js.Array[TracingSpanLink]] = js.undefined
  }
  object TracingSpanOptions {
    
    inline def apply(): TracingSpanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracingSpanOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TracingSpanOptions] (val x: Self) extends AnyVal {
      
      inline def setSpanAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "spanAttributes", value.asInstanceOf[js.Any])
      
      inline def setSpanAttributesUndefined: Self = StObject.set(x, "spanAttributes", js.undefined)
      
      inline def setSpanKind(value: TracingSpanKind): Self = StObject.set(x, "spanKind", value.asInstanceOf[js.Any])
      
      inline def setSpanKindUndefined: Self = StObject.set(x, "spanKind", js.undefined)
      
      inline def setSpanLinks(value: js.Array[TracingSpanLink]): Self = StObject.set(x, "spanLinks", value.asInstanceOf[js.Any])
      
      inline def setSpanLinksUndefined: Self = StObject.set(x, "spanLinks", js.undefined)
      
      inline def setSpanLinksVarargs(value: TracingSpanLink*): Self = StObject.set(x, "spanLinks", js.Array(value*))
    }
  }
}
