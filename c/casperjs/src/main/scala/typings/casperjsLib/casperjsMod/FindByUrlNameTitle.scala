package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindByUrlNameTitle extends js.Object {
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var windowName: js.UndefOr[java.lang.String] = js.undefined
}

object FindByUrlNameTitle {
  @scala.inline
  def apply(title: java.lang.String = null, url: java.lang.String = null, windowName: java.lang.String = null): FindByUrlNameTitle = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (windowName != null) __obj.updateDynamic("windowName")(windowName)
    __obj.asInstanceOf[FindByUrlNameTitle]
  }
}

