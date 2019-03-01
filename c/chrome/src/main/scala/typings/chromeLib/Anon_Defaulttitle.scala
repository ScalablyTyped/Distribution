package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Defaulttitle extends js.Object {
  var default_title: js.UndefOr[java.lang.String] = js.undefined
  var file_filters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Defaulttitle {
  @scala.inline
  def apply(
    default_title: java.lang.String = null,
    file_filters: js.Array[java.lang.String] = null,
    id: java.lang.String = null
  ): Anon_Defaulttitle = {
    val __obj = js.Dynamic.literal()
    if (default_title != null) __obj.updateDynamic("default_title")(default_title)
    if (file_filters != null) __obj.updateDynamic("file_filters")(file_filters)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Defaulttitle]
  }
}

