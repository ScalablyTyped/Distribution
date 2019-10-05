package typings.ckeditor

import typings.ckeditor.CKEDITOR.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var enterMode: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[typings.ckeditor.CKEDITOR.filter] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(context: String = null, enterMode: Int | Double = null, filter: filter = null): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (enterMode != null) __obj.updateDynamic("enterMode")(enterMode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[Anon_Context]
  }
}

