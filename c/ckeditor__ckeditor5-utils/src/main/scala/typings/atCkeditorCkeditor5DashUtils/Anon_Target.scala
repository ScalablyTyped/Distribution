package typings.atCkeditorCkeditor5DashUtils

import typings.std.HTMLElement
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  var target: HTMLElement | Range
  var viewportOffset: js.UndefOr[Double] = js.undefined
}

object Anon_Target {
  @scala.inline
  def apply(target: HTMLElement | Range, viewportOffset: Int | Double = null): Anon_Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (viewportOffset != null) __obj.updateDynamic("viewportOffset")(viewportOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Target]
  }
}

