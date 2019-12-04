package typings.baseui

import typings.baseui.popoverMod.PopoverProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenProps extends js.Object {
  def children(props: PopoverProps with js.Object): ReactNode
}

object Anon_ChildrenProps {
  @scala.inline
  def apply(children: PopoverProps with js.Object => ReactNode): Anon_ChildrenProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_ChildrenProps]
  }
}

