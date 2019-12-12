package typings.baseui.tabsMod

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedProps extends js.Object {
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.native
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.native
}

