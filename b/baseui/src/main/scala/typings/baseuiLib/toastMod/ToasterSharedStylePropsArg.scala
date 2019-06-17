package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToasterSharedStylePropsArg extends js.Object {
  @JSName("$placement")
  var $placement: js.UndefOr[
    baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top
  ] = js.undefined
}

object ToasterSharedStylePropsArg {
  @scala.inline
  def apply(
    $placement: baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top = null
  ): ToasterSharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    if ($placement != null) __obj.updateDynamic("$placement")($placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToasterSharedStylePropsArg]
  }
}

