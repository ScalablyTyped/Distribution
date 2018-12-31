package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @js.native
trait TraceProxy extends js.Object {
  /**
    * Get the span from the current context.
    * @returns The current span or null if outside a trace context.
    */
  def currentSpan(): (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Span */ js.Any) | scala.Null = js.native
  /**
    * Initializes the tracer. This should be called before importing other libraries.
    */
  def init(): this.type = js.native
  def init(options: TracerOptions): this.type = js.native
  /**
    * Get the scope manager to manager context propagation for the tracer.
    */
  def scopeManager(): ScopeManager = js.native
  /**
    * Initiate a trace and creates a new span.
    * @param operationName The operation name to be used for this span.
    * @param options Configuration options. These will take precedence over environment variables.
    */
  def trace(operationName: java.lang.String, options: TraceOptions): js.Promise[/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Span */ _] = js.native
  /**
    * Initiate a trace and creates a new span.
    * @param operationName The operation name to be used for this span.
    * @param options Configuration options. These will take precedence over environment variables.
    */
  def trace(
    operationName: java.lang.String,
    options: TraceOptions,
    callback: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Span */ /* span */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Enable and optionally configure a plugin.
    * @param plugin The name of a built-in plugin.
    * @param config Configuration options.
    */
  def use[P /* <: ddDashTraceLib.Plugin */](
    plugin: P,
    config: /* import warning: ImportType.apply Failed type conversion: dd-trace.PluginConfiguration[P] */ js.Any
  ): this.type = js.native
}

