package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceUri extends js.Object {
  var sourceUri: js.UndefOr[String] = js.undefined
}

object Anon_SourceUri {
  @scala.inline
  def apply(sourceUri: String = null): Anon_SourceUri = {
    val __obj = js.Dynamic.literal()
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    __obj.asInstanceOf[Anon_SourceUri]
  }
}

