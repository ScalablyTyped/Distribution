package typings.codemirror

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertLeft extends js.Object {
  /** By default, text typed when the cursor is on top of the bookmark will end up to the right of the bookmark.
    Set this option to true to make it go to the left instead. */
  var insertLeft: js.UndefOr[Boolean] = js.undefined
  /** Can be used to display a DOM node at the current location of the bookmark (analogous to the replacedWith option to markText). */
  var widget: js.UndefOr[HTMLElement] = js.undefined
}

object Anon_InsertLeft {
  @scala.inline
  def apply(insertLeft: js.UndefOr[Boolean] = js.undefined, widget: HTMLElement = null): Anon_InsertLeft = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertLeft)) __obj.updateDynamic("insertLeft")(insertLeft.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InsertLeft]
  }
}

