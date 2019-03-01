package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackId extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CallbackId {
  @scala.inline
  def apply(callback: js.Function = null, id: java.lang.String = null, title: java.lang.String = null): Anon_CallbackId = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (id != null) __obj.updateDynamic("id")(id)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_CallbackId]
  }
}

