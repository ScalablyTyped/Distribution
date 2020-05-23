package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Id {
  @scala.inline
  def apply(callback: js.Function = null, id: String = null, title: String = null): Id = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

