package typings.cliTable

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
    `padding-left`: Int | Double = null,
    `padding-right`: Int | Double = null
  ): Partialpaddingleftnumberp = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialpaddingleftnumberp]
  }
}

