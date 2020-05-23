package typings.cliTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  padding-left  :number,   padding-right  :number,   head  :std.Array<string>,   border  :std.Array<string>,   compact  :boolean}> */
trait Partialpaddingleftnumberp extends js.Object {
  var border: js.UndefOr[js.Array[String]] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var head: js.UndefOr[js.Array[String]] = js.undefined
  var `padding-left`: js.UndefOr[Double] = js.undefined
  var `padding-right`: js.UndefOr[Double] = js.undefined
}

object Partialpaddingleftnumberp {
  @scala.inline
  def apply(
    border: js.Array[String] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    head: js.Array[String] = null,
    `padding-left`: js.UndefOr[Double] = js.undefined,
    `padding-right`: js.UndefOr[Double] = js.undefined
  ): Partialpaddingleftnumberp = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (!js.isUndefined(`padding-left`)) __obj.updateDynamic("padding-left")(`padding-left`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`padding-right`)) __obj.updateDynamic("padding-right")(`padding-right`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialpaddingleftnumberp]
  }
}

