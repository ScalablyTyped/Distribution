package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekDays extends js.Object

@JSImport("azdata", "WeekDays")
@js.native
object WeekDays extends js.Object {
  @js.native
  sealed trait everyDay extends WeekDays
  
  @js.native
  sealed trait friday extends WeekDays
  
  @js.native
  sealed trait monday extends WeekDays
  
  @js.native
  sealed trait saturday extends WeekDays
  
  @js.native
  sealed trait sunday extends WeekDays
  
  @js.native
  sealed trait thursday extends WeekDays
  
  @js.native
  sealed trait tuesday extends WeekDays
  
  @js.native
  sealed trait wednesday extends WeekDays
  
  @js.native
  sealed trait weekDays extends WeekDays
  
  @js.native
  sealed trait weekEnds extends WeekDays
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDays with Double] = js.native
  /* 127 */ @js.native
  object everyDay extends TopLevel[everyDay with Double]
  
  /* 32 */ @js.native
  object friday extends TopLevel[friday with Double]
  
  /* 2 */ @js.native
  object monday extends TopLevel[monday with Double]
  
  /* 64 */ @js.native
  object saturday extends TopLevel[saturday with Double]
  
  /* 1 */ @js.native
  object sunday extends TopLevel[sunday with Double]
  
  /* 16 */ @js.native
  object thursday extends TopLevel[thursday with Double]
  
  /* 4 */ @js.native
  object tuesday extends TopLevel[tuesday with Double]
  
  /* 8 */ @js.native
  object wednesday extends TopLevel[wednesday with Double]
  
  /* 62 */ @js.native
  object weekDays extends TopLevel[weekDays with Double]
  
  /* 65 */ @js.native
  object weekEnds extends TopLevel[weekEnds with Double]
  
}

