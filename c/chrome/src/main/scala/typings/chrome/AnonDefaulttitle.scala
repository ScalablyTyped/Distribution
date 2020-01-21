package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaulttitle extends js.Object {
  var default_title: js.UndefOr[String] = js.undefined
  var file_filters: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object AnonDefaulttitle {
  @scala.inline
  def apply(default_title: String = null, file_filters: js.Array[String] = null, id: String = null): AnonDefaulttitle = {
    val __obj = js.Dynamic.literal()
    if (default_title != null) __obj.updateDynamic("default_title")(default_title.asInstanceOf[js.Any])
    if (file_filters != null) __obj.updateDynamic("file_filters")(file_filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaulttitle]
  }
}

