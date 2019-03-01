package typings
package blessedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bg extends js.Object {
  var bg: js.UndefOr[java.lang.String] = js.undefined
  var fg: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bg {
  @scala.inline
  def apply(bg: java.lang.String = null, fg: java.lang.String = null): Anon_Bg = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (fg != null) __obj.updateDynamic("fg")(fg)
    __obj.asInstanceOf[Anon_Bg]
  }
}

