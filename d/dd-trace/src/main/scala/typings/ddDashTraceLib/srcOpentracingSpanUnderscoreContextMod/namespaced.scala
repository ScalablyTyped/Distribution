package typings
package ddDashTraceLib.srcOpentracingSpanUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dd-trace/src/opentracing/span_context", JSImport.Namespace)
@js.native
class namespaced protected () extends DatadogSpanContext {
  /**
       * Used to create references to parent spans.
       * See: https://github.com/DataDog/dd-trace-js/blob/master/src/opentracing/tracer.js#L99
       */
  def this(props: SpanContextLike) = this()
}

