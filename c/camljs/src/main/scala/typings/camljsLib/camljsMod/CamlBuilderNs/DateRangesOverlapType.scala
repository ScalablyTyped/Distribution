package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateRangesOverlapType extends js.Object

@JSImport("camljs/CamlBuilder", "DateRangesOverlapType")
@js.native
object DateRangesOverlapType extends js.Object {
  /** Returns events for one day, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Day
    extends camljsLib.camljsMod.CamlBuilderNs.DateRangesOverlapType
  
  /** Returns events for one month, specified by CalendarDate in QueryOptions.
    Caution: usually also returns few days from previous and next months */
  @js.native
  sealed trait Month
    extends camljsLib.camljsMod.CamlBuilderNs.DateRangesOverlapType
  
  /** Returns events for today */
  @js.native
  sealed trait Now
    extends camljsLib.camljsMod.CamlBuilderNs.DateRangesOverlapType
  
  /** Returns events for one week, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Week
    extends camljsLib.camljsMod.CamlBuilderNs.DateRangesOverlapType
  
  /** Returns events for one year, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Year
    extends camljsLib.camljsMod.CamlBuilderNs.DateRangesOverlapType
  
}

