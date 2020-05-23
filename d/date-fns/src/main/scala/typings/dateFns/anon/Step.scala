package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  var step: js.UndefOr[Double] = js.undefined
}

object Step {
  @scala.inline
  def apply(step: js.UndefOr[Double] = js.undefined): Step = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

