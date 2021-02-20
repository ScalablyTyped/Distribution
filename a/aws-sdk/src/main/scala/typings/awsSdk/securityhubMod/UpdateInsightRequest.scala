package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInsightRequest extends StObject {
  
  /**
    * The updated filters that define this insight.
    */
  var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.native
  
  /**
    * The updated GroupBy attribute that defines this insight.
    */
  var GroupByAttribute: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the insight that you want to update.
    */
  var InsightArn: NonEmptyString = js.native
  
  /**
    * The updated name for the insight.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}
object UpdateInsightRequest {
  
  @scala.inline
  def apply(InsightArn: NonEmptyString): UpdateInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInsightRequest]
  }
  
  @scala.inline
  implicit class UpdateInsightRequestMutableBuilder[Self <: UpdateInsightRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: AwsSecurityFindingFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setGroupByAttribute(value: NonEmptyString): Self = StObject.set(x, "GroupByAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByAttributeUndefined: Self = StObject.set(x, "GroupByAttribute", js.undefined)
    
    @scala.inline
    def setInsightArn(value: NonEmptyString): Self = StObject.set(x, "InsightArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
