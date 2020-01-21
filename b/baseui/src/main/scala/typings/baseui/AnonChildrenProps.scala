package typings.baseui

import typings.baseui.popoverMod.PopoverProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenProps extends js.Object {
  def children(props: PopoverProps with js.Object): ReactNode
}

object AnonChildrenProps {
  @scala.inline
  def apply(children: PopoverProps with js.Object => ReactNode): AnonChildrenProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[AnonChildrenProps]
  }
}

