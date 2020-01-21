package typings.ckeditorCkeditor5Utils

import typings.std.HTMLElement
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var target: HTMLElement | Range
  var viewportOffset: js.UndefOr[Double] = js.undefined
}

object AnonTarget {
  @scala.inline
  def apply(target: HTMLElement | Range, viewportOffset: Int | Double = null): AnonTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (viewportOffset != null) __obj.updateDynamic("viewportOffset")(viewportOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTarget]
  }
}

