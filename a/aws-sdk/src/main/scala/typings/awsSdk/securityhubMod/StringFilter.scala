package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringFilter extends StObject {
  
  /**
    * The condition to apply to a string value when querying for findings. To search for values that contain the filter criteria value, use one of the following comparison operators:   To search for values that exactly match the filter value, use EQUALS. For example, the filter ResourceType EQUALS AwsEc2SecurityGroup only matches findings that have a resource type of AwsEc2SecurityGroup.   To search for values that start with the filter value, use PREFIX. For example, the filter ResourceType PREFIX AwsIam matches findings that have a resource type that starts with AwsIam. Findings with a resource type of AwsIamPolicy, AwsIamRole, or AwsIamUser would all match.    EQUALS and PREFIX filters on the same field are joined by OR. A finding matches if it matches any one of those filters. To search for values that do not contain the filter criteria value, use one of the following comparison operators:   To search for values that do not exactly match the filter value, use NOT_EQUALS. For example, the filter ResourceType NOT_EQUALS AwsIamPolicy matches findings that have a resource type other than AwsIamPolicy.   To search for values that do not start with the filter value, use PREFIX_NOT_EQUALS. For example, the filter ResourceType PREFIX_NOT_EQUALS AwsIam matches findings that have a resource type that does not start with AwsIam. Findings with a resource type of AwsIamPolicy, AwsIamRole, or AwsIamUser would all be excluded from the results.    NOT_EQUALS and PREFIX_NOT_EQUALS filters on the same field are joined by AND. A finding matches only if it matches all of those filters. For filters on the same field, you cannot provide both an EQUALS filter and a NOT_EQUALS or PREFIX_NOT_EQUALS filter. Combining filters in this way always returns an error, even if the provided filter values would return valid results. You can combine PREFIX filters with NOT_EQUALS or PREFIX_NOT_EQUALS filters for the same field. Security Hub first processes the PREFIX filters, then the NOT_EQUALS or PREFIX_NOT_EQUALS filters.  For example, for the following filter, Security Hub first identifies findings that have resource types that start with either AwsIAM or AwsEc2. It then excludes findings that have a resource type of AwsIamPolicy and findings that have a resource type of AwsEc2NetworkInterface.    ResourceType PREFIX AwsIam     ResourceType PREFIX AwsEc2     ResourceType NOT_EQUALS AwsIamPolicy     ResourceType NOT_EQUALS AwsEc2NetworkInterface   
    */
  var Comparison: js.UndefOr[StringFilterComparison] = js.undefined
  
  /**
    * The string filter value. Filter values are case sensitive. For example, the product name for control-based findings is Security Hub. If you provide security hub as the filter text, then there is no match.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object StringFilter {
  
  @scala.inline
  def apply(): StringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringFilter]
  }
  
  @scala.inline
  implicit class StringFilterMutableBuilder[Self <: StringFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparison(value: StringFilterComparison): Self = StObject.set(x, "Comparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonUndefined: Self = StObject.set(x, "Comparison", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
