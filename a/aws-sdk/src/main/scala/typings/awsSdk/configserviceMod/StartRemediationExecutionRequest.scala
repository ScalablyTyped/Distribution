package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRemediationExecutionRequest extends js.Object {
  /**
    * The list of names of AWS Config rules that you want to run remediation execution for.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID. 
    */
  var ResourceKeys: typings.awsSdk.configserviceMod.ResourceKeys = js.native
}

object StartRemediationExecutionRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: ResourceKeys): StartRemediationExecutionRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceKeys = ResourceKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartRemediationExecutionRequest]
  }
}

