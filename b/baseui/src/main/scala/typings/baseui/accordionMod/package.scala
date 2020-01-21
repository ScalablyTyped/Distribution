package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object accordionMod {
  type PanelProps = typings.baseui.accordionMod.SharedPanelProps with typings.baseui.AnonExpandedBooleanOptional
  type StateReducer[T] = js.Function3[typings.baseui.baseuiStrings.expand, /* nextState */ T, /* currentState */ T, T]
  type StatefulPanelContainerProps = typings.baseui.accordionMod.SharedStatefulPanelContainerProps with typings.baseui.AnonChildren
  type StatefulPanelProps = typings.baseui.accordionMod.SharedPanelProps with typings.baseui.accordionMod.SharedStatefulPanelContainerProps
}
