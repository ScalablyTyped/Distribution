package typings
package cliDashTable2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderHead extends js.Object {
  var border: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var head: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `padding-left`: js.UndefOr[scala.Double] = js.undefined
  var `padding-right`: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BorderHead {
  @scala.inline
  def apply(
    border: js.Array[java.lang.String] = null,
    head: js.Array[java.lang.String] = null,
    `padding-left`: scala.Int | scala.Double = null,
    `padding-right`: scala.Int | scala.Double = null
  ): Anon_BorderHead = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (head != null) __obj.updateDynamic("head")(head)
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderHead]
  }
}

