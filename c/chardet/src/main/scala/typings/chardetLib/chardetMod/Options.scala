package typings
package chardetLib.chardetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var returnAllMatches: js.UndefOr[scala.Boolean] = js.undefined
  var sampleSize: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    returnAllMatches: js.UndefOr[scala.Boolean] = js.undefined,
    sampleSize: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnAllMatches)) __obj.updateDynamic("returnAllMatches")(returnAllMatches)
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

