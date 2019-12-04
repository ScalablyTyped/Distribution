package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object menuMod {
  import typings.baseui.Anon_EventItem
  import typings.baseui.Anon_GetRequiredItemProps
  import typings.baseui.baseuiStrings.click
  import typings.baseui.baseuiStrings.focus
  import typings.baseui.baseuiStrings.mouseEnter
  import typings.baseui.baseuiStrings.moveDown
  import typings.baseui.baseuiStrings.moveUp
  import typings.baseui.baseuiStrings.reset

  type GetRequiredItemProps = js.Function2[/* item */ js.Any, /* index */ Double, RenderItemProps]
  type OnItemSelect = js.Function1[/* args */ Anon_EventItem, js.Any]
  type RenderProps = StatefulContainerState with Anon_GetRequiredItemProps
  type StateReducer = js.Function3[
    /* changeType */ moveUp | mouseEnter | focus | click | reset | moveDown, 
    /* changes */ StatefulContainerState, 
    /* currentState */ StatefulContainerState, 
    StatefulContainerState
  ]
  type StatefulMenuProps = StatefulContainerProps with MenuProps
  type StatelessMenuProps = SharedStatelessProps with MenuProps
}
