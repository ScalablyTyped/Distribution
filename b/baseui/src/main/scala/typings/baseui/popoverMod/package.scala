package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popoverMod {
  type ANIMATE_IN_TIME = typings.baseui.baseuiNumbers.`20`
  type ANIMATE_OUT_TIME = typings.baseui.baseuiNumbers.`0`
  type StateReducer = js.Function3[
    /* stateChangeType */ typings.baseui.baseuiStrings.open | typings.baseui.baseuiStrings.close, 
    /* nextState */ typings.baseui.popoverMod.State, 
    /* currentState */ typings.baseui.popoverMod.State, 
    typings.baseui.popoverMod.State
  ]
}
