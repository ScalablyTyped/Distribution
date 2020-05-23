package typings.chardet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var returnAllMatches: js.UndefOr[Boolean] = js.undefined
  var sampleSize: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    returnAllMatches: js.UndefOr[Boolean] = js.undefined,
    sampleSize: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnAllMatches)) __obj.updateDynamic("returnAllMatches")(returnAllMatches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleSize)) __obj.updateDynamic("sampleSize")(sampleSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

