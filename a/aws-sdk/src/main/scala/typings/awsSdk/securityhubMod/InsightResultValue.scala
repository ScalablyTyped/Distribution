package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightResultValue extends StObject {
  
  /**
    * The number of findings returned for each GroupByAttributeValue.
    */
  var Count: Integer = js.native
  
  /**
    * The value of the attribute that the findings are grouped by for the insight whose results are returned by the GetInsightResults operation.
    */
  var GroupByAttributeValue: NonEmptyString = js.native
}
object InsightResultValue {
  
  @scala.inline
  def apply(Count: Integer, GroupByAttributeValue: NonEmptyString): InsightResultValue = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], GroupByAttributeValue = GroupByAttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightResultValue]
  }
  
  @scala.inline
  implicit class InsightResultValueMutableBuilder[Self <: InsightResultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByAttributeValue(value: NonEmptyString): Self = StObject.set(x, "GroupByAttributeValue", value.asInstanceOf[js.Any])
  }
}
