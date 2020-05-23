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
  def apply(size: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[Double] = js.undefined): HTML5FSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML5FSOptions]
  }
}

