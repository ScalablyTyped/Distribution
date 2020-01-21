package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThumbnail extends js.Object {
  val thumbnail: js.UndefOr[String] = js.undefined
}

object AnonThumbnail {
  @scala.inline
  def apply(thumbnail: String = null): AnonThumbnail = {
    val __obj = js.Dynamic.literal()
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThumbnail]
  }
}

