package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVPCEConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to delete.
    */
  var arn: AmazonResourceName = js.native
}

object DeleteVPCEConfigurationRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVPCEConfigurationRequest]
  }
}

