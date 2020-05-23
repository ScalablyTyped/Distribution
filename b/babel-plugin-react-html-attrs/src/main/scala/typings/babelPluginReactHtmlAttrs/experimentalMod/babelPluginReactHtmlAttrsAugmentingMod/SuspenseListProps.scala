package typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor
import typings.babelPluginReactHtmlAttrs.mod.ReactElement
import typings.std.Exclude
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps
  - typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends js.Object

object SuspenseListProps {
  @scala.inline
  def DirectionalSuspenseListProps(
    children: (ReactElement[_, String | JSXElementConstructor[_]]) | (Iterable[ReactElement[_, String | JSXElementConstructor[_]]]),
    revealOrder: forwards | backwards,
    tail: SuspenseListTailMode = null
  ): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
  @scala.inline
  def NonDirectionalSuspenseListProps(
    children: (ReactElement[_, String | JSXElementConstructor[_]]) | (Iterable[ReactElement[_, String | JSXElementConstructor[_]]]),
    revealOrder: Exclude[SuspenseListRevealOrder, forwards | backwards] = null
  ): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
}

