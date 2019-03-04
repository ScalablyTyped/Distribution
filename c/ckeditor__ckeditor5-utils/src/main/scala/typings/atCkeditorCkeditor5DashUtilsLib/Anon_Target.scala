package typings
package atCkeditorCkeditor5DashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  var target: stdLib.HTMLElement | stdLib.Range
  var viewportOffset: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Target {
  @scala.inline
  def apply(target: stdLib.HTMLElement | stdLib.Range, viewportOffset: scala.Int | scala.Double = null): Anon_Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (viewportOffset != null) __obj.updateDynamic("viewportOffset")(viewportOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Target]
  }
}

