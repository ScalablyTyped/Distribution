package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatableBoolean extends js.Object {
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object UpdatableBoolean {
  @scala.inline
  def apply(updatable: js.UndefOr[Boolean] = js.undefined): UpdatableBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableBoolean]
  }
}

