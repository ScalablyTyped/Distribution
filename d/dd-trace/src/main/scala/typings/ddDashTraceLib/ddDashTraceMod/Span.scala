package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait Span extends js.Object {
  def context(): SpanContext
}

object Span {
  @scala.inline
  def apply(context: () => SpanContext): Span = {
    val __obj = js.Dynamic.literal(context = js.Any.fromFunction0(context))
  
    __obj.asInstanceOf[Span]
  }
}

