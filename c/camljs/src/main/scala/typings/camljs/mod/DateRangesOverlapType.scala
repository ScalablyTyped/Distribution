package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateRangesOverlapType extends StObject
@JSImport("camljs", "DateRangesOverlapType")
@js.native
object DateRangesOverlapType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateRangesOverlapType & Double] = js.native
  
  /** Returns events for one day, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Day
    extends StObject
       with DateRangesOverlapType
  /* 1 */ val Day: typings.camljs.mod.DateRangesOverlapType.Day & Double = js.native
  
  /** Returns events for one month, specified by CalendarDate in QueryOptions.
    Caution: usually also returns few days from previous and next months */
  @js.native
  sealed trait Month
    extends StObject
       with DateRangesOverlapType
  /* 3 */ val Month: typings.camljs.mod.DateRangesOverlapType.Month & Double = js.native
  
  /** Returns events for today */
  @js.native
  sealed trait Now
    extends StObject
       with DateRangesOverlapType
  /* 0 */ val Now: typings.camljs.mod.DateRangesOverlapType.Now & Double = js.native
  
  /** Returns events for one week, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Week
    extends StObject
       with DateRangesOverlapType
  /* 2 */ val Week: typings.camljs.mod.DateRangesOverlapType.Week & Double = js.native
  
  /** Returns events for one year, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Year
    extends StObject
       with DateRangesOverlapType
  /* 4 */ val Year: typings.camljs.mod.DateRangesOverlapType.Year & Double = js.native
}
