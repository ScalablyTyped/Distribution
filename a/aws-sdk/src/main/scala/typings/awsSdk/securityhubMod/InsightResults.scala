package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightResults extends StObject {
  
  /**
    * The attribute that the findings are grouped by for the insight whose results are returned by the GetInsightResults operation.
    */
  var GroupByAttribute: NonEmptyString
  
  /**
    * The ARN of the insight whose results are returned by the GetInsightResults operation.
    */
  var InsightArn: NonEmptyString
  
  /**
    * The list of insight result values returned by the GetInsightResults operation.
    */
  var ResultValues: InsightResultValueList
}
object InsightResults {
  
  @scala.inline
  def apply(GroupByAttribute: NonEmptyString, InsightArn: NonEmptyString, ResultValues: InsightResultValueList): InsightResults = {
    val __obj = js.Dynamic.literal(GroupByAttribute = GroupByAttribute.asInstanceOf[js.Any], InsightArn = InsightArn.asInstanceOf[js.Any], ResultValues = ResultValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightResults]
  }
  
  @scala.inline
  implicit class InsightResultsMutableBuilder[Self <: InsightResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupByAttribute(value: NonEmptyString): Self = StObject.set(x, "GroupByAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightArn(value: NonEmptyString): Self = StObject.set(x, "InsightArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultValues(value: InsightResultValueList): Self = StObject.set(x, "ResultValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultValuesVarargs(value: InsightResultValue*): Self = StObject.set(x, "ResultValues", js.Array(value :_*))
  }
}
