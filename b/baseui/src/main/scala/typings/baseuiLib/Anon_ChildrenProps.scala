package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenProps extends js.Object {
  def children(props: baseuiLib.popoverMod.PopoverProps with Anon_ChildrenNever_1982587524): reactLib.reactMod.ReactNode
}

object Anon_ChildrenProps {
  @scala.inline
  def apply(
    children: baseuiLib.popoverMod.PopoverProps with Anon_ChildrenNever_1982587524 => reactLib.reactMod.ReactNode
  ): Anon_ChildrenProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_ChildrenProps]
  }
}

