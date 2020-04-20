package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVPCEConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to describe.
    */
  var arn: AmazonResourceName = js.native
}

object GetVPCEConfigurationRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVPCEConfigurationRequest]
  }
}

