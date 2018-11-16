package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TraceOptions extends js.Object {
  /**
       * The parent span or span context for the new span. Generally this is not needed as it will be
       * fetched from the current context.
       * If creating your own, this must be an instance of DatadogSpanContext from ./src/opentracing/span_context
       * See: https://github.com/DataDog/dd-trace-js/blob/master/src/opentracing/tracer.js#L99
       */
  var childOf: js.UndefOr[
    opentracingLib.opentracingMod.Span | opentracingLib.opentracingMod.SpanContext | ddDashTraceLib.srcOpentracingSpanUnderscoreContextMod.namespaced
  ] = js.undefined
  /**
       * The resource name to be used for this span.
       * The operation name will be used if this is not provided.
       */
  var resource: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The service name to be used for this span.
       * The service name from the tracer will be used if this is not provided.
       */
  var service: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Global tags that should be assigned to every span.
       */
  var tags: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any] | java.lang.String] = js.undefined
  /**
       * The span type to be used for this span.
       */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

