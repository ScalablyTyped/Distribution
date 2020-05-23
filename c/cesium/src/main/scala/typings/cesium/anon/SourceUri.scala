package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceUri extends js.Object {
  var sourceUri: js.UndefOr[String] = js.undefined
}

object SourceUri {
  @scala.inline
  def apply(sourceUri: String = null): SourceUri = {
    val __obj = js.Dynamic.literal()
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceUri]
  }
}

