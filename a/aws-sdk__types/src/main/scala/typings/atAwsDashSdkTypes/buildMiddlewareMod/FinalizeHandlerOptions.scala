package typings.atAwsDashSdkTypes.buildMiddlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.finalize
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
    val __obj = js.Dynamic.literal(step = step)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[FinalizeHandlerOptions]
  }
}

