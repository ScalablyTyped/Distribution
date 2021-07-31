package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInsightRequest extends StObject {
  
  /**
    * One or more attributes used to filter the findings included in the insight. The insight only includes findings that match the criteria defined in the filters.
    */
  var Filters: AwsSecurityFindingFilters
  
  /**
    * The attribute used to group the findings for the insight. The grouping attribute identifies the type of item that the insight applies to. For example, if an insight is grouped by resource identifier, then the insight produces a list of resource identifiers.
    */
  var GroupByAttribute: NonEmptyString
  
  /**
    * The name of the custom insight to create.
    */
  var Name: NonEmptyString
}
object CreateInsightRequest {
  
  @scala.inline
  def apply(Filters: AwsSecurityFindingFilters, GroupByAttribute: NonEmptyString, Name: NonEmptyString): CreateInsightRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], GroupByAttribute = GroupByAttribute.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInsightRequest]
  }
  
  @scala.inline
  implicit class CreateInsightRequestMutableBuilder[Self <: CreateInsightRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: AwsSecurityFindingFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByAttribute(value: NonEmptyString): Self = StObject.set(x, "GroupByAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
