package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delta extends js.Object {
  var delta: js.UndefOr[scala.Double] = js.undefined
  var facetNb: js.UndefOr[scala.Double] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Delta {
  @scala.inline
  def apply(
    delta: scala.Int | scala.Double = null,
    facetNb: scala.Int | scala.Double = null,
    number: scala.Int | scala.Double = null
  ): Anon_Delta = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (facetNb != null) __obj.updateDynamic("facetNb")(facetNb.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delta]
  }
}

