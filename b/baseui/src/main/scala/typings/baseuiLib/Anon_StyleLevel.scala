package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StyleLevel extends js.Object {
  var styleLevel: js.UndefOr[scala.Double] = js.undefined
}

object Anon_StyleLevel {
  @scala.inline
  def apply(styleLevel: scala.Int | scala.Double = null): Anon_StyleLevel = {
    val __obj = js.Dynamic.literal()
    if (styleLevel != null) __obj.updateDynamic("styleLevel")(styleLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StyleLevel]
  }
}

