package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var enterMode: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[typings.ckeditor.CKEDITOR.filter] = js.undefined
}

object Context {
  @scala.inline
  def apply(context: String = null, enterMode: js.UndefOr[Double] = js.undefined, filter: filter = null): Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(enterMode)) __obj.updateDynamic("enterMode")(enterMode.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

