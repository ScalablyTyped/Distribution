package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var handle: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var listClass: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(
    id: java.lang.String,
    background: java.lang.String = null,
    handle: js.UndefOr[scala.Boolean] = js.undefined,
    listClass: java.lang.String = null
  ): Anon_Background = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (background != null) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle)
    if (listClass != null) __obj.updateDynamic("listClass")(listClass)
    __obj.asInstanceOf[Anon_Background]
  }
}

