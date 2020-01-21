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
  def apply(step: build, priority: Int | Double = null, tags: StringDictionary[js.Any] = null): BuildHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildHandlerOptions]
  }
}

