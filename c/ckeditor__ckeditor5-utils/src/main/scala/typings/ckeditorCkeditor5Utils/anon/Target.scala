package typings.ckeditorCkeditor5Utils.anon

import typings.std.HTMLElement
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var target: HTMLElement | Range
  var viewportOffset: js.UndefOr[Double] = js.undefined
}

object Target {
  @scala.inline
  def apply(target: HTMLElement | Range, viewportOffset: js.UndefOr[Double] = js.undefined): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportOffset)) __obj.updateDynamic("viewportOffset")(viewportOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

