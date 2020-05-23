package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.awsSdkTypesStrings.serialize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeHandlerOptions extends HandlerOptions {
  @JSName("step")
  var step_SerializeHandlerOptions: serialize
}

object SerializeHandlerOptions {
  @scala.inline
  def apply(
    step: serialize,
    priority: js.UndefOr[Double] = js.undefined,
    tags: StringDictionary[js.Any] = null
  ): SerializeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeHandlerOptions]
  }
}

