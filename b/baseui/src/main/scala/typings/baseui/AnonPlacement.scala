package typings.baseui

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlacement extends js.Object {
  @JSName("$placement")
  var $placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top
}

object AnonPlacement {
  @scala.inline
  def apply($placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top): AnonPlacement = {
    val __obj = js.Dynamic.literal($placement = $placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPlacement]
  }
}

