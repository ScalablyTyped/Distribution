package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object accordionMod {
  
  type StateReducer[T] = js.Function3[typings.baseui.baseuiStrings.expand, /* nextState */ T, /* currentState */ T, T]
  
  type StatefulPanelProps = typings.baseui.accordionMod.SharedPanelProps with typings.baseui.accordionMod.SharedStatefulPanelContainerProps
}
