package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datepickerMod {
  import typings.baseui.Anon_Args
  import typings.baseui.Anon_Ariadescribedby
  import typings.baseui.Anon_Date
  import typings.baseui.baseuiStrings.change_
  import typings.baseui.baseuiStrings.mouseLeave
  import typings.baseui.baseuiStrings.mouseOver
  import typings.baseui.baseuiStrings.moveDown
  import typings.baseui.baseuiStrings.moveLeft
  import typings.baseui.baseuiStrings.moveRight
  import typings.baseui.baseuiStrings.moveUp

  type DatepickerProps = CalendarProps with Anon_Ariadescribedby
  type StateReducer = js.Function3[
    /* stateType */ moveUp | mouseOver | moveLeft | moveRight | change_ | mouseLeave | moveDown, 
    /* nextState */ ContainerState, 
    /* currentState */ ContainerState, 
    ContainerState
  ]
  type StatefulDatepickerProps[T] = T with StatefulContainerProps[T] with Anon_Args[T]
  type onChange = js.Function1[/* args */ Anon_Date, js.Any]
}
