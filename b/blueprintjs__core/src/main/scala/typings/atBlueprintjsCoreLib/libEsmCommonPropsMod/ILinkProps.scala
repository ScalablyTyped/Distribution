package typings
package atBlueprintjsCoreLib.libEsmCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkProps extends js.Object {
  /** Link URL. */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** Link target attribute. Use `"_blank"` to open in a new window. */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object ILinkProps {
  @scala.inline
  def apply(href: java.lang.String = null, target: java.lang.String = null): ILinkProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ILinkProps]
  }
}

