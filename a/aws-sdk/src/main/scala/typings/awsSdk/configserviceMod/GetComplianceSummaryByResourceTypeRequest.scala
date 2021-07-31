package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceSummaryByResourceTypeRequest extends StObject {
  
  /**
    * Specify one or more resource types to get the number of resources that are compliant and the number that are noncompliant for each resource type. For this request, you can specify an AWS resource type such as AWS::EC2::Instance. You can specify that the resource type is an AWS account by specifying AWS::::Account.
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ResourceTypes] = js.undefined
}
object GetComplianceSummaryByResourceTypeRequest {
  
  @scala.inline
  def apply(): GetComplianceSummaryByResourceTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryByResourceTypeRequest]
  }
  
  @scala.inline
  implicit class GetComplianceSummaryByResourceTypeRequestMutableBuilder[Self <: GetComplianceSummaryByResourceTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceTypes(value: ResourceTypes): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "ResourceTypes", js.Array(value :_*))
  }
}
