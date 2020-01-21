package typings.baseui

import typings.baseui.treeViewMod.TreeViewProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenPropsReactNode extends js.Object {
  def children(props: TreeViewProps): ReactNode
}

object AnonChildrenPropsReactNode {
  @scala.inline
  def apply(children: TreeViewProps => ReactNode): AnonChildrenPropsReactNode = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[AnonChildrenPropsReactNode]
  }
}

