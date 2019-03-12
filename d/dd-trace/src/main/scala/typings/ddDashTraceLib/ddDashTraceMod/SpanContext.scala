package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait SpanContext extends js.Object {
  /**
    * Returns the string representation of the internal span ID.
    */
  def toSpanId(): java.lang.String
  /**
    * Returns the string representation of the internal trace ID.
    */
  def toTraceId(): java.lang.String
}

object SpanContext {
  @scala.inline
  def apply(toSpanId: () => java.lang.String, toTraceId: () => java.lang.String): SpanContext = {
    val __obj = js.Dynamic.literal(toSpanId = js.Any.fromFunction0(toSpanId), toTraceId = js.Any.fromFunction0(toTraceId))
  
    __obj.asInstanceOf[SpanContext]
  }
}

