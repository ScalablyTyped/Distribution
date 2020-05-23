package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  val thumbnail: js.UndefOr[String] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(thumbnail: String = null): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

