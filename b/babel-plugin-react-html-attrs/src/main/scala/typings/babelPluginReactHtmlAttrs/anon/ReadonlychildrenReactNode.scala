package typings.babelPluginReactHtmlAttrs.anon

import typings.babelPluginReactHtmlAttrs.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactNode}> */
trait ReadonlychildrenReactNode extends js.Object {
  val children: js.UndefOr[ReactNode] = js.undefined
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(children: js.UndefOr[Null | ReactNode] = js.undefined): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
}

