package typings.chrome.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceIdentifier extends js.Object {
  /** Optional. A human readable description of the resource.  */
  var description: js.UndefOr[String] = js.undefined
  /** The resource identifier for the given content type. */
  var id: String
}

object ResourceIdentifier {
  @scala.inline
  def apply(id: String, description: String = null): ResourceIdentifier = {
    val __obj = js.Dynamic.literal(id = id)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ResourceIdentifier]
  }
}

