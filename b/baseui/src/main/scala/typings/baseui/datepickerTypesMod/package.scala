package typings.baseui.datepickerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.baseui.baseuiStrings.startDate
  - typings.baseui.baseuiStrings.endDate
  - scala.Unit
  - scala.Null
*/
type InputRole = js.UndefOr[_InputRole | Null]

type Locale = Any

/* Rewritten from type alias, can be one of: 
  - typings.baseui.baseuiStrings.default_
  - typings.baseui.baseuiStrings.locked
  - scala.Unit
  - scala.Null
*/
type RangedCalendarBehavior = js.UndefOr[_RangedCalendarBehavior | Null]

/* Rewritten from type alias, can be one of: 
  - typings.baseui.baseuiStrings.mouseLeave
  - typings.baseui.baseuiStrings.moveRight
  - typings.baseui.baseuiStrings.moveDown
  - typings.baseui.baseuiStrings.moveUp
  - typings.baseui.baseuiStrings.mouseOver
  - typings.baseui.baseuiStrings.change_
  - typings.baseui.baseuiStrings.moveLeft
  - scala.Unit
  - scala.Null
*/
type StateChangeType = js.UndefOr[_StateChangeType | Null]

type StateReducer[T] = js.Function3[
/* stateType */ StateChangeType, 
/* nextState */ ContainerState[T], 
/* currentState */ ContainerState[T], 
ContainerState[T]]
