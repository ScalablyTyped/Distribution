package typings
package ddDashTraceLib.srcOpentracingSpanUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpanContextLike extends js.Object {
  var baggageItems: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var parentId: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var sampled: js.UndefOr[scala.Boolean] = js.undefined
  var spanId: scala.Double
  var trace: js.UndefOr[ddDashTraceLib.Anon_Finished] = js.undefined
  var traceId: scala.Double
}

