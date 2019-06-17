package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dndDashListMod {
  type StateReducer = js.Function3[
    baseuiLib.baseuiLibStrings.change, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  type StatefulComponentContainerProps = StatefulListProps with baseuiLib.Anon_ChildrenInitialState
}
