package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bias extends js.Object {
  var bias: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
}

object Anon_Bias {
  @scala.inline
  def apply(bias: Int | Double = null, origin: String = null, scroll: js.UndefOr[Boolean] = js.undefined): Anon_Bias = {
    val __obj = js.Dynamic.literal()
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    __obj.asInstanceOf[Anon_Bias]
  }
}

