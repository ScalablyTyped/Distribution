package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WeekDays extends StObject
@JSImport("azdata", "WeekDays")
@js.native
object WeekDays extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDays & Double] = js.native
  
  @js.native
  sealed trait everyDay
    extends StObject
       with WeekDays
  /* 127 */ val everyDay: typings.azdata.mod.WeekDays.everyDay & Double = js.native
  
  @js.native
  sealed trait friday
    extends StObject
       with WeekDays
  /* 32 */ val friday: typings.azdata.mod.WeekDays.friday & Double = js.native
  
  @js.native
  sealed trait monday
    extends StObject
       with WeekDays
  /* 2 */ val monday: typings.azdata.mod.WeekDays.monday & Double = js.native
  
  @js.native
  sealed trait saturday
    extends StObject
       with WeekDays
  /* 64 */ val saturday: typings.azdata.mod.WeekDays.saturday & Double = js.native
  
  @js.native
  sealed trait sunday
    extends StObject
       with WeekDays
  /* 1 */ val sunday: typings.azdata.mod.WeekDays.sunday & Double = js.native
  
  @js.native
  sealed trait thursday
    extends StObject
       with WeekDays
  /* 16 */ val thursday: typings.azdata.mod.WeekDays.thursday & Double = js.native
  
  @js.native
  sealed trait tuesday
    extends StObject
       with WeekDays
  /* 4 */ val tuesday: typings.azdata.mod.WeekDays.tuesday & Double = js.native
  
  @js.native
  sealed trait wednesday
    extends StObject
       with WeekDays
  /* 8 */ val wednesday: typings.azdata.mod.WeekDays.wednesday & Double = js.native
  
  @js.native
  sealed trait weekDays
    extends StObject
       with WeekDays
  /* 62 */ val weekDays: typings.azdata.mod.WeekDays.weekDays & Double = js.native
  
  @js.native
  sealed trait weekEnds
    extends StObject
       with WeekDays
  /* 65 */ val weekEnds: typings.azdata.mod.WeekDays.weekEnds & Double = js.native
}
