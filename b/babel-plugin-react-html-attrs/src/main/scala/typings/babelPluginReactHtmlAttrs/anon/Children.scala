package typings.babelPluginReactHtmlAttrs.anon

import typings.babelPluginReactHtmlAttrs.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
}

object Children {
  @scala.inline
  def apply(children: js.UndefOr[Null | ReactNode] = js.undefined): Children = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

