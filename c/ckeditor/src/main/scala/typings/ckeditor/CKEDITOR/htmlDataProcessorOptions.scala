package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait htmlDataProcessorOptions extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var dontFilter: js.UndefOr[Boolean] = js.undefined
  var enterMode: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[typings.ckeditor.CKEDITOR.filter] = js.undefined
  var fixForBody: js.UndefOr[Boolean] = js.undefined
  var protectedWhitespaces: js.UndefOr[Boolean] = js.undefined
}

object htmlDataProcessorOptions {
  @scala.inline
  def apply(
    context: String = null,
    dontFilter: js.UndefOr[Boolean] = js.undefined,
    enterMode: Int | Double = null,
    filter: filter = null,
    fixForBody: js.UndefOr[Boolean] = js.undefined,
    protectedWhitespaces: js.UndefOr[Boolean] = js.undefined
  ): htmlDataProcessorOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(dontFilter)) __obj.updateDynamic("dontFilter")(dontFilter.asInstanceOf[js.Any])
    if (enterMode != null) __obj.updateDynamic("enterMode")(enterMode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(fixForBody)) __obj.updateDynamic("fixForBody")(fixForBody.asInstanceOf[js.Any])
    if (!js.isUndefined(protectedWhitespaces)) __obj.updateDynamic("protectedWhitespaces")(protectedWhitespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[htmlDataProcessorOptions]
  }
}

