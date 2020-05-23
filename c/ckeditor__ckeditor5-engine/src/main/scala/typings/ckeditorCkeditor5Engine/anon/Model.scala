package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var model: String | js.Object
  var upcastAlso: js.UndefOr[MatcherPattern | js.Array[MatcherPattern]] = js.undefined
  var view: js.UndefOr[String | js.Object] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    model: String | js.Object,
    upcastAlso: MatcherPattern | js.Array[MatcherPattern] = null,
    view: String | js.Object = null
  ): Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (upcastAlso != null) __obj.updateDynamic("upcastAlso")(upcastAlso.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

