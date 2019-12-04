package typings.baseui

import typings.baseui.treeDashViewMod.TreeViewProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenPropsReactNode extends js.Object {
  def children(props: TreeViewProps): ReactNode
}

object Anon_ChildrenPropsReactNode {
  @scala.inline
  def apply(children: TreeViewProps => ReactNode): Anon_ChildrenPropsReactNode = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_ChildrenPropsReactNode]
  }
}

