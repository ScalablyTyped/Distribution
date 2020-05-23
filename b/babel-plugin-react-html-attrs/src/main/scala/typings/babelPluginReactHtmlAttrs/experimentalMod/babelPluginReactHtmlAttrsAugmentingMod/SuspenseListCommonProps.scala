package typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod

import typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor
import typings.babelPluginReactHtmlAttrs.mod.ReactElement
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspenseListCommonProps extends js.Object {
  /**
    * Note that SuspenseList require more than one child;
    * it is a runtime warning to provide only a single child.
    *
    * It does, however, allow those children to be wrapped inside a single
    * level of `<React.Fragment>`.
    */
  var children: (ReactElement[_, String | JSXElementConstructor[_]]) | (Iterable[ReactElement[_, String | JSXElementConstructor[_]]])
}

object SuspenseListCommonProps {
  @scala.inline
  def apply(
    children: (ReactElement[_, String | JSXElementConstructor[_]]) | (Iterable[ReactElement[_, String | JSXElementConstructor[_]]])
  ): SuspenseListCommonProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListCommonProps]
  }
}

