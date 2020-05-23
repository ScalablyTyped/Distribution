package typings.cypressImageSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeAA extends js.Object {
  val includeAA: js.UndefOr[Boolean] = js.undefined
  val threshold: js.UndefOr[Double] = js.undefined
}

object IncludeAA {
  @scala.inline
  def apply(includeAA: js.UndefOr[Boolean] = js.undefined, threshold: js.UndefOr[Double] = js.undefined): IncludeAA = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAA)) __obj.updateDynamic("includeAA")(includeAA.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeAA]
  }
}

