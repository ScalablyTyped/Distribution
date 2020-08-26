package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComplianceByResourceRequest extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and INSUFFICIENT_DATA.
    */
  var ComplianceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceTypes] = js.native
  /**
    * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * The ID of the AWS resource for which you want compliance information. You can specify only one resource ID. If you specify a resource ID, you must also specify a type for ResourceType.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.native
  /**
    * The types of AWS resources for which you want compliance information (for example, AWS::EC2::Instance). For this action, you can specify that the resource type is an AWS account by specifying AWS::::Account.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object DescribeComplianceByResourceRequest {
  @scala.inline
  def apply(): DescribeComplianceByResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByResourceRequest]
  }
  @scala.inline
  implicit class DescribeComplianceByResourceRequestOps[Self <: DescribeComplianceByResourceRequest] (val x: Self) extends AnyVal {
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
    def setComplianceTypesVarargs(value: ComplianceType*): Self = this.set("ComplianceTypes", js.Array(value :_*))
    @scala.inline
    def setComplianceTypes(value: ComplianceTypes): Self = this.set("ComplianceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceTypes: Self = this.set("ComplianceTypes", js.undefined)
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResourceId(value: BaseResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

