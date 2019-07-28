package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Model extends js.Object {
  var model: String | js.Object
  var upcastAlso: js.UndefOr[MatcherPattern | js.Array[MatcherPattern]] = js.undefined
  var view: js.UndefOr[String | js.Object] = js.undefined
}

object Anon_Model {
  @scala.inline
  def apply(
    model: String | js.Object,
    upcastAlso: MatcherPattern | js.Array[MatcherPattern] = null,
    view: String | js.Object = null
  ): Anon_Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (upcastAlso != null) __obj.updateDynamic("upcastAlso")(upcastAlso.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Model]
  }
}

