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
  def apply(returnAllMatches: js.UndefOr[Boolean] = js.undefined, sampleSize: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnAllMatches)) __obj.updateDynamic("returnAllMatches")(returnAllMatches.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

