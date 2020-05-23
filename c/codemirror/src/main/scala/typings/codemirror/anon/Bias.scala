package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bias extends js.Object {
  var bias: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
}

object Bias {
  @scala.inline
  def apply(
    bias: js.UndefOr[Double] = js.undefined,
    origin: String = null,
    scroll: js.UndefOr[Boolean] = js.undefined
  ): Bias = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bias)) __obj.updateDynamic("bias")(bias.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bias]
  }
}

