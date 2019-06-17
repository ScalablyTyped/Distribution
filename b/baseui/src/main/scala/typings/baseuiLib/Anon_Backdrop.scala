package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backdrop extends js.Object {
  var closeSource: js.UndefOr[
    baseuiLib.baseuiLibStrings.closeButton | baseuiLib.baseuiLibStrings.backdrop | baseuiLib.baseuiLibStrings.escape
  ] = js.undefined
}

object Anon_Backdrop {
  @scala.inline
  def apply(
    closeSource: baseuiLib.baseuiLibStrings.closeButton | baseuiLib.baseuiLibStrings.backdrop | baseuiLib.baseuiLibStrings.escape = null
  ): Anon_Backdrop = {
    val __obj = js.Dynamic.literal()
    if (closeSource != null) __obj.updateDynamic("closeSource")(closeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Backdrop]
  }
}

