package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var minimum_version: js.UndefOr[String] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(id: String, minimum_version: String = null): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (minimum_version != null) __obj.updateDynamic("minimum_version")(minimum_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

