package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Model extends js.Object {
  var model: java.lang.String | js.Object
  var upcastAlso: js.UndefOr[
    atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern | (js.Array[
      atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern
    ])
  ] = js.undefined
  var view: js.UndefOr[java.lang.String | js.Object] = js.undefined
}

object Anon_Model {
  @scala.inline
  def apply(
    model: java.lang.String | js.Object,
    upcastAlso: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern | (js.Array[
      atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern
    ]) = null,
    view: java.lang.String | js.Object = null
  ): Anon_Model = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (upcastAlso != null) __obj.updateDynamic("upcastAlso")(upcastAlso.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Model]
  }
}

