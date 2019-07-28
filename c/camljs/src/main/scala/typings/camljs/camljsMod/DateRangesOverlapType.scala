package typings.camljs.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateRangesOverlapType extends js.Object

@JSImport("camljs", "DateRangesOverlapType")
@js.native
object DateRangesOverlapType extends js.Object {
  /** Returns events for one day, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Day extends DateRangesOverlapType
  
  /** Returns events for one month, specified by CalendarDate in QueryOptions.
    Caution: usually also returns few days from previous and next months */
  @js.native
  sealed trait Month extends DateRangesOverlapType
  
  /** Returns events for today */
  @js.native
  sealed trait Now extends DateRangesOverlapType
  
  /** Returns events for one week, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Week extends DateRangesOverlapType
  
  /** Returns events for one year, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Year extends DateRangesOverlapType
  
  /* 1 */ val Day: typings.camljs.camljsMod.DateRangesOverlapType.Day with Double = js.native
  /* 3 */ val Month: typings.camljs.camljsMod.DateRangesOverlapType.Month with Double = js.native
  /* 0 */ val Now: typings.camljs.camljsMod.DateRangesOverlapType.Now with Double = js.native
  /* 2 */ val Week: typings.camljs.camljsMod.DateRangesOverlapType.Week with Double = js.native
  /* 4 */ val Year: typings.camljs.camljsMod.DateRangesOverlapType.Year with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateRangesOverlapType with Double] = js.native
}

