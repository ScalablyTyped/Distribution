package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Thumbnail extends js.Object {
  val thumbnail: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Thumbnail {
  @scala.inline
  def apply(thumbnail: java.lang.String = null): Anon_Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[Anon_Thumbnail]
  }
}

