package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectMod {
  type ChangeAction = js.Function0[js.Any]
  type StateReducer = js.Function3[
    /* stateType */ java.lang.String, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  type StatefulSelectProps = SelectProps with baseuiLib.Anon_InitialState
  type Value = js.Array[Option]
  type filterOptions = js.Function4[
    /* options */ Value, 
    /* filterValue */ java.lang.String, 
    /* excludeOptions */ js.UndefOr[Value], 
    /* newProps */ js.UndefOr[baseuiLib.Anon_Any], 
    Value
  ]
}
