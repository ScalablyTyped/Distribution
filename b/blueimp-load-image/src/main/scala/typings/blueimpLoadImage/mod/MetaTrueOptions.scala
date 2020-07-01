package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Setting 'orientation' automatically sets 'meta' to true
// so setting it to false is not valid in that case
trait MetaTrueOptions extends MetaOptions {
  var meta: js.UndefOr[`true`] = js.undefined
  var orientation: Orientation
}

object MetaTrueOptions {
  @scala.inline
  def apply(orientation: Orientation, meta: `true` = null): MetaTrueOptions = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaTrueOptions]
  }
}

