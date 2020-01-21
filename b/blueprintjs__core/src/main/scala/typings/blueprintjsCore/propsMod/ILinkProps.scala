package typings.blueprintjsCore.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkProps extends js.Object {
  /** Link URL. */
  var href: js.UndefOr[String] = js.undefined
  /** Link target attribute. Use `"_blank"` to open in a new window. */
  var target: js.UndefOr[String] = js.undefined
}

object ILinkProps {
  @scala.inline
  def apply(href: String = null, target: String = null): ILinkProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkProps]
  }
}

