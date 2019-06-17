package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var Content: js.UndefOr[Override[_]] = js.undefined
  var Footer: js.UndefOr[Override[_]] = js.undefined
  var Heading: js.UndefOr[Override[_]] = js.undefined
  var MenuButton: js.UndefOr[Override[_]] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(
    Content: Override[_] = null,
    Footer: Override[_] = null,
    Heading: Override[_] = null,
    MenuButton: Override[_] = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Footer != null) __obj.updateDynamic("Footer")(Footer.asInstanceOf[js.Any])
    if (Heading != null) __obj.updateDynamic("Heading")(Heading.asInstanceOf[js.Any])
    if (MenuButton != null) __obj.updateDynamic("MenuButton")(MenuButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content]
  }
}

