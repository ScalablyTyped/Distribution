package typings.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRootName extends js.Object {
  var rootName: js.UndefOr[String] = js.undefined
}

object AnonRootName {
  @scala.inline
  def apply(rootName: String = null): AnonRootName = {
    val __obj = js.Dynamic.literal()
    if (rootName != null) __obj.updateDynamic("rootName")(rootName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRootName]
  }
}

