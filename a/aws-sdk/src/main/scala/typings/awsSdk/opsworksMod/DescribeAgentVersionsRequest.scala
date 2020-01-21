package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAgentVersionsRequest extends js.Object {
  /**
    * The configuration manager.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeAgentVersionsRequest {
  @scala.inline
  def apply(ConfigurationManager: StackConfigurationManager = null, StackId: String = null): DescribeAgentVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationManager != null) __obj.updateDynamic("ConfigurationManager")(ConfigurationManager.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentVersionsRequest]
  }
}

