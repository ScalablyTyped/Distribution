package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datepickerMod {
  type StateReducer = js.Function3[
    /* stateType */ typings.baseui.baseuiStrings.mouseLeave | typings.baseui.baseuiStrings.moveRight | typings.baseui.baseuiStrings.moveDown | typings.baseui.baseuiStrings.moveUp | typings.baseui.baseuiStrings.mouseOver | typings.baseui.baseuiStrings.change_ | typings.baseui.baseuiStrings.moveLeft, 
    /* nextState */ typings.baseui.datepickerMod.ContainerState, 
    /* currentState */ typings.baseui.datepickerMod.ContainerState, 
    typings.baseui.datepickerMod.ContainerState
  ]
  type StatefulDatepickerProps[T] = T with typings.baseui.datepickerMod.StatefulContainerProps[T] with typings.baseui.anon.Children[T]
  type onChange = js.Function1[/* args */ typings.baseui.anon.Date, js.Any]
}
