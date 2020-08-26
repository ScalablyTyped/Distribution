package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionalSuspenseListProps
  extends typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListCommonProps {
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: forwards | backwards = js.native
  /**
    * Dictates how unloaded items in a SuspenseList is shown.
    *
    * - By default, `SuspenseList` will show all fallbacks in the list.
    * - `collapsed` shows only the next fallback in the list.
    * - `hidden` doesn’t show any unloaded items.
    */
  var tail: js.UndefOr[
    typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListTailMode
  ] = js.native
}

object DirectionalSuspenseListProps {
  @scala.inline
  def apply(
    children: (ReactElement[_, String | JSXElementConstructor[_]]) | (Iterable[ReactElement[_, String | JSXElementConstructor[_]]]),
    revealOrder: forwards | backwards
  ): DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalSuspenseListProps]
  }
  @scala.inline
  implicit class DirectionalSuspenseListPropsOps[Self <: DirectionalSuspenseListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRevealOrder(value: forwards | backwards): Self = this.set("revealOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setTail(
      value: typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListTailMode
    ): Self = this.set("tail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTail: Self = this.set("tail", js.undefined)
  }
  
}

