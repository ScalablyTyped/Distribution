package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dndDashListMod {
  import typings.baseui.Anon_ChildrenInitialState
  import typings.baseui.baseuiStrings.change_

  type StateReducer = js.Function3[change_, /* nextState */ State, /* currentState */ State, State]
  type StatefulComponentContainerProps = StatefulListProps with Anon_ChildrenInitialState
}
