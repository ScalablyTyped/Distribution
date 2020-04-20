package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoggingConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the web ACL from which you want to delete the LoggingConfiguration.
    */
  var ResourceArn: typings.awsSdk.wafregionalMod.ResourceArn = js.native
}

object DeleteLoggingConfigurationRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): DeleteLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoggingConfigurationRequest]
  }
}

