package typings.browserfs.html5fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML5FSOptions extends js.Object {
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Double] = js.undefined
}

object HTML5FSOptions {
  @scala.inline
  def apply(size: Int | Double = null, `type`: Int | Double = null): HTML5FSOptions = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML5FSOptions]
  }
}

