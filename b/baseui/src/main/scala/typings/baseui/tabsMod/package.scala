package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsMod {
  import typings.baseui.Anon_InitialStateRenderAll
  import typings.baseui.baseuiStrings.change_

  type StateReducer = js.Function3[change_, /* nextState */ State, /* currentState */ State, State]
  type StatefulTabsProps = TabsProps with Anon_InitialStateRenderAll
}
