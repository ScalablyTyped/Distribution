package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComplianceSummaryByResourceTypeRequest extends js.Object {
  
  /**
    * Specify one or more resource types to get the number of resources that are compliant and the number that are noncompliant for each resource type. For this request, you can specify an AWS resource type such as AWS::EC2::Instance. You can specify that the resource type is an AWS account by specifying AWS::::Account.
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ResourceTypes] = js.native
}
object GetComplianceSummaryByResourceTypeRequest {
  
  @scala.inline
  def apply(): GetComplianceSummaryByResourceTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryByResourceTypeRequest]
  }
  
  @scala.inline
  implicit class GetComplianceSummaryByResourceTypeRequestOps[Self <: GetComplianceSummaryByResourceTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceTypesVarargs(value: StringWithCharLimit256*): Self = this.set("ResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: ResourceTypes): Self = this.set("ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypes: Self = this.set("ResourceTypes", js.undefined)
  }
}
