package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAABBOptions extends js.Object {
  var lowerBound: js.UndefOr[Vec3] = js.undefined
  var upperBound: js.UndefOr[Vec3] = js.undefined
}

object IAABBOptions {
  @scala.inline
  def apply(lowerBound: Vec3 = null, upperBound: Vec3 = null): IAABBOptions = {
    val __obj = js.Dynamic.literal()
    if (lowerBound != null) __obj.updateDynamic("lowerBound")(lowerBound)
    if (upperBound != null) __obj.updateDynamic("upperBound")(upperBound)
    __obj.asInstanceOf[IAABBOptions]
  }
}

