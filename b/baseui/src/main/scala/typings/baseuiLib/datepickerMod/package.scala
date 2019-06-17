package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datepickerMod {
  type DatepickerProps = CalendarProps with baseuiLib.Anon_Ariadescribedby
  type StateReducer = js.Function3[
    /* stateType */ baseuiLib.baseuiLibStrings.moveUp | baseuiLib.baseuiLibStrings.mouseOver | baseuiLib.baseuiLibStrings.moveLeft | baseuiLib.baseuiLibStrings.moveRight | baseuiLib.baseuiLibStrings.change | baseuiLib.baseuiLibStrings.mouseLeave | baseuiLib.baseuiLibStrings.moveDown, 
    /* nextState */ ContainerState, 
    /* currentState */ ContainerState, 
    ContainerState
  ]
  type StatefulDatepickerProps[T] = T with StatefulContainerProps[T] with baseuiLib.Anon_Args[T]
  type onChange = js.Function1[/* args */ baseuiLib.Anon_Date, js.Any]
}
