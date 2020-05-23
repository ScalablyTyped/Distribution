package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.awsSdkTypesStrings.build
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildHandlerOptions extends HandlerOptions {
  @JSName("step")
  var step_BuildHandlerOptions: build
}

object BuildHandlerOptions {
  @scala.inline
  def apply(step: build, priority: js.UndefOr[Double] = js.undefined, tags: StringDictionary[js.Any] = null): BuildHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildHandlerOptions]
  }
}

