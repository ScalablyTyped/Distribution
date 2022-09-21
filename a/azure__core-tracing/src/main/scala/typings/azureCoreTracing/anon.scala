package typings.azureCoreTracing

import typings.azureCoreTracing.mod.OperationTracingOptions
import typings.azureCoreTracing.mod.OptionsWithTracingContext
import typings.azureCoreTracing.mod.SpanStatus
import typings.azureCoreTracing.mod.TracingSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<@azure/core-tracing.@azure/core-tracing.TracingSpan, 'end'> */
  trait OmitTracingSpanend extends StObject {
    
    def isRecording(): Boolean
    @JSName("isRecording")
    var isRecording_Original: js.Function0[Boolean]
    
    def recordException(exception: String): Unit
    def recordException(exception: js.Error): Unit
    @JSName("recordException")
    var recordException_Original: js.Function1[/* exception */ js.Error | String, Unit]
    
    def setAttribute(name: String, value: Any): Unit
    @JSName("setAttribute")
    var setAttribute_Original: js.Function2[/* name */ String, /* value */ Any, Unit]
    
    def setStatus(status: SpanStatus): Unit
    @JSName("setStatus")
    var setStatus_Original: js.Function1[/* status */ SpanStatus, Unit]
  }
  object OmitTracingSpanend {
    
    inline def apply(
      isRecording: () => Boolean,
      recordException: /* exception */ js.Error | String => Unit,
      setAttribute: (/* name */ String, /* value */ Any) => Unit,
      setStatus: /* status */ SpanStatus => Unit
    ): OmitTracingSpanend = {
      val __obj = js.Dynamic.literal(isRecording = js.Any.fromFunction0(isRecording), recordException = js.Any.fromFunction1(recordException), setAttribute = js.Any.fromFunction2(setAttribute), setStatus = js.Any.fromFunction1(setStatus))
      __obj.asInstanceOf[OmitTracingSpanend]
    }
    
    extension [Self <: OmitTracingSpanend](x: Self) {
      
      inline def setIsRecording(value: () => Boolean): Self = StObject.set(x, "isRecording", js.Any.fromFunction0(value))
      
      inline def setRecordException(value: /* exception */ js.Error | String => Unit): Self = StObject.set(x, "recordException", js.Any.fromFunction1(value))
      
      inline def setSetAttribute(value: (/* name */ String, /* value */ Any) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetStatus(value: /* status */ SpanStatus => Unit): Self = StObject.set(x, "setStatus", js.Any.fromFunction1(value))
    }
  }
  
  trait Span extends StObject {
    
    var span: TracingSpan
    
    var tracingContext: typings.azureCoreTracing.mod.TracingContext
  }
  object Span {
    
    inline def apply(span: TracingSpan, tracingContext: typings.azureCoreTracing.mod.TracingContext): Span = {
      val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], tracingContext = tracingContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[Span]
    }
    
    extension [Self <: Span](x: Self) {
      
      inline def setSpan(value: TracingSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setTracingContext(value: typings.azureCoreTracing.mod.TracingContext): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait Then extends StObject {
    
    def `then`(
      onfulfilled: /* import warning: importer.ImportType#apply Failed type conversion: infer F */ js.Any
    ): Any
  }
  object Then {
    
    inline def apply(
      `then`: /* import warning: importer.ImportType#apply Failed type conversion: infer F */ js.Any => Any
    ): Then = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[Then]
    }
    
    extension [Self <: Then](x: Self) {
      
      inline def setThen(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer F */ js.Any => Any
      ): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    }
  }
  
  trait TracingContext extends StObject {
    
    var tracingContext: typings.azureCoreTracing.mod.TracingContext
  }
  object TracingContext {
    
    inline def apply(tracingContext: typings.azureCoreTracing.mod.TracingContext): TracingContext = {
      val __obj = js.Dynamic.literal(tracingContext = tracingContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracingContext]
    }
    
    extension [Self <: TracingContext](x: Self) {
      
      inline def setTracingContext(value: typings.azureCoreTracing.mod.TracingContext): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait TracingOptions extends StObject {
    
    var tracingOptions: js.UndefOr[OperationTracingOptions] = js.undefined
  }
  object TracingOptions {
    
    inline def apply(): TracingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracingOptions]
    }
    
    extension [Self <: TracingOptions](x: Self) {
      
      inline def setTracingOptions(value: OperationTracingOptions): Self = StObject.set(x, "tracingOptions", value.asInstanceOf[js.Any])
      
      inline def setTracingOptionsUndefined: Self = StObject.set(x, "tracingOptions", js.undefined)
    }
  }
  
  trait TracingOptionsTracingContext extends StObject {
    
    var tracingOptions: TracingContext
  }
  object TracingOptionsTracingContext {
    
    inline def apply(tracingOptions: TracingContext): TracingOptionsTracingContext = {
      val __obj = js.Dynamic.literal(tracingOptions = tracingOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracingOptionsTracingContext]
    }
    
    extension [Self <: TracingOptionsTracingContext](x: Self) {
      
      inline def setTracingOptions(value: TracingContext): Self = StObject.set(x, "tracingOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdatedOptions[Options /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  tracingOptions :@azure/core-tracing.@azure/core-tracing.OperationTracingOptions | undefined} */ js.Any */] extends StObject {
    
    var span: TracingSpan
    
    var updatedOptions: OptionsWithTracingContext[Options]
  }
  object UpdatedOptions {
    
    inline def apply[Options /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  tracingOptions :@azure/core-tracing.@azure/core-tracing.OperationTracingOptions | undefined} */ js.Any */](span: TracingSpan, updatedOptions: OptionsWithTracingContext[Options]): UpdatedOptions[Options] = {
      val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], updatedOptions = updatedOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatedOptions[Options]]
    }
    
    extension [Self <: UpdatedOptions[?], Options /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  tracingOptions :@azure/core-tracing.@azure/core-tracing.OperationTracingOptions | undefined} */ js.Any */](x: Self & UpdatedOptions[Options]) {
      
      inline def setSpan(value: TracingSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setUpdatedOptions(value: OptionsWithTracingContext[Options]): Self = StObject.set(x, "updatedOptions", value.asInstanceOf[js.Any])
    }
  }
}
