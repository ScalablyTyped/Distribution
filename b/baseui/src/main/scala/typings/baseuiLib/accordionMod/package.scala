package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object accordionMod {
  type PanelProps = SharedPanelProps with baseuiLib.Anon_ExpandedBooleanOptional
  type StateReducer[T] = js.Function3[baseuiLib.baseuiLibStrings.expand, /* nextState */ T, /* currentState */ T, T]
  type StatefulPanelContainerProps = SharedStatefulPanelContainerProps with baseuiLib.Anon_Children
  type StatefulPanelProps = SharedPanelProps with SharedStatefulPanelContainerProps
}
