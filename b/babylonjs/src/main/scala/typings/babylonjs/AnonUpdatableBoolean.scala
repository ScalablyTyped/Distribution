package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdatableBoolean extends js.Object {
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object AnonUpdatableBoolean {
  @scala.inline
  def apply(updatable: js.UndefOr[Boolean] = js.undefined): AnonUpdatableBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUpdatableBoolean]
  }
}

