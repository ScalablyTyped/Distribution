package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anchor extends js.Object {
  var anchor: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_Anchor {
  @scala.inline
  def apply(anchor: String = null, step: Int | Double = null, x: Int | Double = null, y: Int | Double = null): Anon_Anchor = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Anchor]
  }
}

