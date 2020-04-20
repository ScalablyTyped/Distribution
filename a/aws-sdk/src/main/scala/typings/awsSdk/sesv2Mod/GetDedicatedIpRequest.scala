package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDedicatedIpRequest extends js.Object {
  /**
    * The IP address that you want to obtain more information about. The value you specify has to be a dedicated IP address that's assocaited with your AWS account.
    */
  var Ip: typings.awsSdk.sesv2Mod.Ip = js.native
}

object GetDedicatedIpRequest {
  @scala.inline
  def apply(Ip: Ip): GetDedicatedIpRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDedicatedIpRequest]
  }
}

