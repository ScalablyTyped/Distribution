package typings.baseui.anon

import typings.baseui.baseuiStrings.backdrop
import typings.baseui.baseuiStrings.closeButton
import typings.baseui.baseuiStrings.escape_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseSource extends js.Object {
  var closeSource: js.UndefOr[closeButton | backdrop | escape_] = js.undefined
}

object CloseSource {
  @scala.inline
  def apply(closeSource: closeButton | backdrop | escape_ = null): CloseSource = {
    val __obj = js.Dynamic.literal()
    if (closeSource != null) __obj.updateDynamic("closeSource")(closeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseSource]
  }
}

