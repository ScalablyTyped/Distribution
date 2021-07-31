package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageStatisticsFilter extends StObject {
  
  /**
    * The operator to use in the condition. If the value for the key property is accountId, this value must be CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE, LT, LTE, or NE.
    */
  var comparator: js.UndefOr[UsageStatisticsFilterComparator] = js.undefined
  
  /**
    * The field to use in the condition.
    */
  var key: js.UndefOr[UsageStatisticsFilterKey] = js.undefined
  
  /**
    * An array that lists values to use in the condition, based on the value for the field specified by the key property. If the value for the key property is accountId, this array can specify multiple values. Otherwise, this array can specify only one value. Valid values for each supported field are: accountId - The unique identifier for an AWS account. freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started for an account. serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly quota. total - A string that represents the current, estimated month-to-date cost for an account.
    */
  var values: js.UndefOr[listOfString] = js.undefined
}
object UsageStatisticsFilter {
  
  @scala.inline
  def apply(): UsageStatisticsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageStatisticsFilter]
  }
  
  @scala.inline
  implicit class UsageStatisticsFilterMutableBuilder[Self <: UsageStatisticsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: UsageStatisticsFilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setKey(value: UsageStatisticsFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValues(value: listOfString): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: string*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
