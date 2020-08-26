package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationExecutionStatusRequest extends js.Object {
  /**
    * A list of AWS Config rule names.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you specify 0, AWS Config uses the default. 
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID. 
    */
  var ResourceKeys: js.UndefOr[typings.awsSdk.configserviceMod.ResourceKeys] = js.native
}

object DescribeRemediationExecutionStatusRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName): DescribeRemediationExecutionStatusRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationExecutionStatusRequest]
  }
  @scala.inline
  implicit class DescribeRemediationExecutionStatusRequestOps[Self <: DescribeRemediationExecutionStatusRequest] (val x: Self) extends AnyVal {
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
    def setConfigRuleName(value: ConfigRuleName): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResourceKeysVarargs(value: ResourceKey*): Self = this.set("ResourceKeys", js.Array(value :_*))
    @scala.inline
    def setResourceKeys(value: ResourceKeys): Self = this.set("ResourceKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceKeys: Self = this.set("ResourceKeys", js.undefined)
  }
  
}

