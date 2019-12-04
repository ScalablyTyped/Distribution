package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object accordionMod {
  import typings.baseui.Anon_Children
  import typings.baseui.Anon_ExpandedBooleanOptional
  import typings.baseui.baseuiStrings.expand

  type PanelProps = SharedPanelProps with Anon_ExpandedBooleanOptional
  type StateReducer[T] = js.Function3[expand, /* nextState */ T, /* currentState */ T, T]
  type StatefulPanelContainerProps = SharedStatefulPanelContainerProps with Anon_Children
  type StatefulPanelProps = SharedPanelProps with SharedStatefulPanelContainerProps
}
