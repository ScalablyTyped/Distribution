package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WeekDays extends js.Object
@JSImport("azdata", "WeekDays")
@js.native
object WeekDays extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDays with Double] = js.native
  
  @js.native
  sealed trait everyDay extends WeekDays
  /* 127 */ @js.native
  object everyDay extends TopLevel[everyDay with Double]
  
  @js.native
  sealed trait friday extends WeekDays
  /* 32 */ @js.native
  object friday extends TopLevel[friday with Double]
  
  @js.native
  sealed trait monday extends WeekDays
  /* 2 */ @js.native
  object monday extends TopLevel[monday with Double]
  
  @js.native
  sealed trait saturday extends WeekDays
  /* 64 */ @js.native
  object saturday extends TopLevel[saturday with Double]
  
  @js.native
  sealed trait sunday extends WeekDays
  /* 1 */ @js.native
  object sunday extends TopLevel[sunday with Double]
  
  @js.native
  sealed trait thursday extends WeekDays
  /* 16 */ @js.native
  object thursday extends TopLevel[thursday with Double]
  
  @js.native
  sealed trait tuesday extends WeekDays
  /* 4 */ @js.native
  object tuesday extends TopLevel[tuesday with Double]
  
  @js.native
  sealed trait wednesday extends WeekDays
  /* 8 */ @js.native
  object wednesday extends TopLevel[wednesday with Double]
  
  @js.native
  sealed trait weekDays extends WeekDays
  /* 62 */ @js.native
  object weekDays extends TopLevel[weekDays with Double]
  
  @js.native
  sealed trait weekEnds extends WeekDays
  /* 65 */ @js.native
  object weekEnds extends TopLevel[weekEnds with Double]
}
