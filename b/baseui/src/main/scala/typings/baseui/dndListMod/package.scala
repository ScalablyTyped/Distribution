package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dndListMod {
  type StateReducer = js.Function3[
    typings.baseui.baseuiStrings.change_, 
    /* nextState */ typings.baseui.dndListMod.State, 
    /* currentState */ typings.baseui.dndListMod.State, 
    typings.baseui.dndListMod.State
  ]
  type StatefulComponentContainerProps = typings.baseui.dndListMod.StatefulListProps with typings.baseui.AnonChildrenInitialState
}
