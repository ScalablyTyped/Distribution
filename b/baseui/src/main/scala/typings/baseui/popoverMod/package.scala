package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popoverMod {
  import typings.baseui.Anon_ArgsChildren
  import typings.baseui.Anon_ChildrenContent
  import typings.baseui.Anon_ChildrenProps
  import typings.baseui.baseuiNumbers.`0`
  import typings.baseui.baseuiNumbers.`20`
  import typings.baseui.baseuiStrings.close
  import typings.baseui.baseuiStrings.open

  type ANIMATE_IN_TIME = `20`
  type ANIMATE_OUT_TIME = `0`
  type PopoverProps = BasePopoverProps with Anon_ChildrenContent
  type StateReducer = js.Function3[
    /* stateChangeType */ open | close, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  type StatefulPopoverContainerProps = StatefulPopoverProps with Anon_ChildrenProps
  type StatefulPopoverProps = BasePopoverProps with Anon_ArgsChildren
}
