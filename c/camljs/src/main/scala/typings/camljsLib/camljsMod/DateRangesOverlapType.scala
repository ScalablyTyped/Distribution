package typings
package camljsLib.camljsMod

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
  sealed trait Day
    extends camljsLib.camljsMod.DateRangesOverlapType
  
  /** Returns events for one month, specified by CalendarDate in QueryOptions.
    Caution: usually also returns few days from previous and next months */
  @js.native
  sealed trait Month
    extends camljsLib.camljsMod.DateRangesOverlapType
  
  /** Returns events for today */
  @js.native
  sealed trait Now
    extends camljsLib.camljsMod.DateRangesOverlapType
  
  /** Returns events for one week, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Week
    extends camljsLib.camljsMod.DateRangesOverlapType
  
  /** Returns events for one year, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Year
    extends camljsLib.camljsMod.DateRangesOverlapType
  
  /* 1 */ val Day: Day with scala.Double = js.native
  /* 3 */ val Month: Month with scala.Double = js.native
  /* 0 */ val Now: Now with scala.Double = js.native
  /* 2 */ val Week: Week with scala.Double = js.native
  /* 4 */ val Year: Year with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[camljsLib.camljsMod.DateRangesOverlapType with scala.Double] = js.native
}

