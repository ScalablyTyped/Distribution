package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Step extends js.Object {
  var step: js.UndefOr[Double] = js.undefined
}

object Anon_Step {
  @scala.inline
  def apply(step: Int | Double = null): Anon_Step = {
    val __obj = js.Dynamic.literal()
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Step]
  }
}

