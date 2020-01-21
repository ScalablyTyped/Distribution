package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.awsSdkTypesStrings.finalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalizeHandlerOptions extends HandlerOptions {
  @JSName("step")
  var step_FinalizeHandlerOptions: finalize
}

object FinalizeHandlerOptions {
  @scala.inline
  def apply(step: finalize, priority: Int | Double = null, tags: StringDictionary[js.Any] = null): FinalizeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeHandlerOptions]
  }
}

