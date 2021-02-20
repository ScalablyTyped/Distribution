package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFilter extends StObject {
  
  /**
    * A date range for the date filter.
    */
  var DateRange: js.UndefOr[typings.awsSdk.securityhubMod.DateRange] = js.native
  
  /**
    * An end date for the date filter.
    */
  var End: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A start date for the date filter.
    */
  var Start: js.UndefOr[NonEmptyString] = js.native
}
object DateFilter {
  
  @scala.inline
  def apply(): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFilter]
  }
  
  @scala.inline
  implicit class DateFilterMutableBuilder[Self <: DateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateRange(value: DateRange): Self = StObject.set(x, "DateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "DateRange", js.undefined)
    
    @scala.inline
    def setEnd(value: NonEmptyString): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    @scala.inline
    def setStart(value: NonEmptyString): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
