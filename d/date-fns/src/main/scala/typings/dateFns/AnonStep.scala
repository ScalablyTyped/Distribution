package typings.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStep extends js.Object {
  var step: js.UndefOr[Double] = js.undefined
}

object AnonStep {
  @scala.inline
  def apply(step: Int | Double = null): AnonStep = {
    val __obj = js.Dynamic.literal()
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStep]
  }
}

