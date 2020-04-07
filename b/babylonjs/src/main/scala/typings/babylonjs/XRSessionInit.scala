package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRSessionInit extends js.Object {
  var optionalFeatures: js.UndefOr[js.Array[XRReferenceSpaceType]] = js.undefined
  var requiredFeatures: js.UndefOr[js.Array[XRReferenceSpaceType]] = js.undefined
}

object XRSessionInit {
  @scala.inline
  def apply(
    optionalFeatures: js.Array[XRReferenceSpaceType] = null,
    requiredFeatures: js.Array[XRReferenceSpaceType] = null
  ): XRSessionInit = {
    val __obj = js.Dynamic.literal()
    if (optionalFeatures != null) __obj.updateDynamic("optionalFeatures")(optionalFeatures.asInstanceOf[js.Any])
    if (requiredFeatures != null) __obj.updateDynamic("requiredFeatures")(requiredFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRSessionInit]
  }
}

