package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootName extends js.Object {
  var rootName: js.UndefOr[String] = js.undefined
}

object RootName {
  @scala.inline
  def apply(rootName: String = null): RootName = {
    val __obj = js.Dynamic.literal()
    if (rootName != null) __obj.updateDynamic("rootName")(rootName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootName]
  }
}

