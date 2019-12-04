package typings.baseui.toastMod

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToasterSharedStylePropsArg extends js.Object {
  @JSName("$placement")
  var $placement: js.UndefOr[bottomRight | bottom | topRight | bottomLeft | topLeft | top] = js.undefined
}

object ToasterSharedStylePropsArg {
  @scala.inline
  def apply($placement: bottomRight | bottom | topRight | bottomLeft | topLeft | top = null): ToasterSharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    if ($placement != null) __obj.updateDynamic("$placement")($placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToasterSharedStylePropsArg]
  }
}

