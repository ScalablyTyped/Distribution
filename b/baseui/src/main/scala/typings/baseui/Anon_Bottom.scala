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

trait Anon_Bottom extends js.Object {
  @JSName("$placement")
  var $placement: bottomRight | bottom | topRight | bottomLeft | topLeft | top
}

object Anon_Bottom {
  @scala.inline
  def apply($placement: bottomRight | bottom | topRight | bottomLeft | topLeft | top): Anon_Bottom = {
    val __obj = js.Dynamic.literal($placement = $placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}

