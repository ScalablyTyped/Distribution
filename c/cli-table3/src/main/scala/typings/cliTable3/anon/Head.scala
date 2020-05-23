package typings.cliTable3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Head extends js.Object {
  var border: js.UndefOr[js.Array[String]] = js.undefined
  var head: js.UndefOr[js.Array[String]] = js.undefined
  var `padding-left`: js.UndefOr[Double] = js.undefined
  var `padding-right`: js.UndefOr[Double] = js.undefined
}

object Head {
  @scala.inline
  def apply(
    border: js.Array[String] = null,
    head: js.Array[String] = null,
    `padding-left`: js.UndefOr[Double] = js.undefined,
    `padding-right`: js.UndefOr[Double] = js.undefined
  ): Head = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (!js.isUndefined(`padding-left`)) __obj.updateDynamic("padding-left")(`padding-left`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`padding-right`)) __obj.updateDynamic("padding-right")(`padding-right`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Head]
  }
}

