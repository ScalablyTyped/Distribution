package typings.casperjs.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindByUrlNameTitle extends js.Object {
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var windowName: js.UndefOr[String] = js.undefined
}

object FindByUrlNameTitle {
  @scala.inline
  def apply(title: String = null, url: String = null, windowName: String = null): FindByUrlNameTitle = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (windowName != null) __obj.updateDynamic("windowName")(windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindByUrlNameTitle]
  }
}

