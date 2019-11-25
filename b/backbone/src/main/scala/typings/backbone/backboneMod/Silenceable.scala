package typings.backbone.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Silenceable extends js.Object {
  var silent: js.UndefOr[Boolean] = js.undefined
}

object Silenceable {
  @scala.inline
  def apply(silent: js.UndefOr[Boolean] = js.undefined): Silenceable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Silenceable]
  }
}

