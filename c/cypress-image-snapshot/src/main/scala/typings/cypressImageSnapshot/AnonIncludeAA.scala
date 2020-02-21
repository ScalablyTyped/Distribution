package typings.cypressImageSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeAA extends js.Object {
  val includeAA: js.UndefOr[Boolean] = js.undefined
  val threshold: js.UndefOr[Double] = js.undefined
}

object AnonIncludeAA {
  @scala.inline
  def apply(includeAA: js.UndefOr[Boolean] = js.undefined, threshold: Int | Double = null): AnonIncludeAA = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAA)) __obj.updateDynamic("includeAA")(includeAA.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeAA]
  }
}

