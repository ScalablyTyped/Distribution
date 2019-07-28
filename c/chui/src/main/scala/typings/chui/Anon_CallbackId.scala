package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackId extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_CallbackId {
  @scala.inline
  def apply(callback: js.Function = null, id: String = null, title: String = null): Anon_CallbackId = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (id != null) __obj.updateDynamic("id")(id)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_CallbackId]
  }
}

