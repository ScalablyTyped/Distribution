package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popoverMod {
  type ANIMATE_IN_TIME = baseuiLib.baseuiLibNumbers.`20`
  type ANIMATE_OUT_TIME = baseuiLib.baseuiLibNumbers.`0`
  type PopoverProps = BasePopoverProps with baseuiLib.Anon_ChildrenContent
  type StateReducer = js.Function3[
    /* stateChangeType */ baseuiLib.baseuiLibStrings.open | baseuiLib.baseuiLibStrings.close, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  type StatefulPopoverContainerProps = StatefulPopoverProps with baseuiLib.Anon_ChildrenProps
  type StatefulPopoverProps = BasePopoverProps with baseuiLib.Anon_ArgsChildren
}
