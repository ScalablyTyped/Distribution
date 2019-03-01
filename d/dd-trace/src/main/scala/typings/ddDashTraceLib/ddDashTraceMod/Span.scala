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
  def apply(context: js.Function0[SpanContext]): Span = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[Span]
  }
}

