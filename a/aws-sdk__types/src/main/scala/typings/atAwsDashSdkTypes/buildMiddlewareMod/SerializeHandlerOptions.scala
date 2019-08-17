package typings.atAwsDashSdkTypes.buildMiddlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.serialize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeHandlerOptions extends HandlerOptions {
  @JSName("step")
  var step_SerializeHandlerOptions: serialize
}

object SerializeHandlerOptions {
  @scala.inline
  def apply(step: serialize, priority: Int | Double = null, tags: StringDictionary[js.Any] = null): SerializeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[SerializeHandlerOptions]
  }
}

