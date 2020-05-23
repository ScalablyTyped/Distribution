package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var decorator: js.UndefOr[js.Function1[/* handlers */ GenerateHandlers, GenerateHandlers]] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    decorator: /* handlers */ GenerateHandlers => GenerateHandlers = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    if (decorator != null) __obj.updateDynamic("decorator")(js.Any.fromFunction1(decorator))
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}

