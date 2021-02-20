package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WeekDays extends StObject
@JSImport("azdata", "WeekDays")
@js.native
object WeekDays extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDays with Double] = js.native
  
  @js.native
  sealed trait everyDay extends WeekDays
  /* 127 */ val everyDay: typings.azdata.mod.WeekDays.everyDay with Double = js.native
  
  @js.native
  sealed trait friday extends WeekDays
  /* 32 */ val friday: typings.azdata.mod.WeekDays.friday with Double = js.native
  
  @js.native
  sealed trait monday extends WeekDays
  /* 2 */ val monday: typings.azdata.mod.WeekDays.monday with Double = js.native
  
  @js.native
  sealed trait saturday extends WeekDays
  /* 64 */ val saturday: typings.azdata.mod.WeekDays.saturday with Double = js.native
  
  @js.native
  sealed trait sunday extends WeekDays
  /* 1 */ val sunday: typings.azdata.mod.WeekDays.sunday with Double = js.native
  
  @js.native
  sealed trait thursday extends WeekDays
  /* 16 */ val thursday: typings.azdata.mod.WeekDays.thursday with Double = js.native
  
  @js.native
  sealed trait tuesday extends WeekDays
  /* 4 */ val tuesday: typings.azdata.mod.WeekDays.tuesday with Double = js.native
  
  @js.native
  sealed trait wednesday extends WeekDays
  /* 8 */ val wednesday: typings.azdata.mod.WeekDays.wednesday with Double = js.native
  
  @js.native
  sealed trait weekDays extends WeekDays
  /* 62 */ val weekDays: typings.azdata.mod.WeekDays.weekDays with Double = js.native
  
  @js.native
  sealed trait weekEnds extends WeekDays
  /* 65 */ val weekEnds: typings.azdata.mod.WeekDays.weekEnds with Double = js.native
}
