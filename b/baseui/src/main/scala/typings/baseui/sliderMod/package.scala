package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sliderMod {
  type StateReducer = js.Function3[
    /* stateType */ java.lang.String, 
    /* nextState */ typings.baseui.sliderMod.State, 
    /* currentState */ typings.baseui.sliderMod.State, 
    typings.baseui.sliderMod.State
  ]
}
