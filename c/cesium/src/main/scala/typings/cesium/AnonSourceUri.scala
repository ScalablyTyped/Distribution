package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceUri extends js.Object {
  var sourceUri: js.UndefOr[String] = js.undefined
}

object AnonSourceUri {
  @scala.inline
  def apply(sourceUri: String = null): AnonSourceUri = {
    val __obj = js.Dynamic.literal()
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceUri]
  }
}

