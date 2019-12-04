package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectMod {
  import typings.baseui.Anon_Any
  import typings.baseui.Anon_InitialState

  type ChangeAction = js.Function0[js.Any]
  type StateReducer = js.Function3[/* stateType */ String, /* nextState */ State, /* currentState */ State, State]
  type StatefulSelectProps = SelectProps with Anon_InitialState
  type Value = js.Array[Option]
  type filterOptions = js.Function4[
    /* options */ Value, 
    /* filterValue */ String, 
    /* excludeOptions */ js.UndefOr[Value], 
    /* newProps */ js.UndefOr[Anon_Any], 
    Value
  ]
}
