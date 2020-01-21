package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryLoggingConfigRequest extends js.Object {
  /**
    * The ID of the configuration for DNS query logging that you want to get information about.
    */
  var Id: QueryLoggingConfigId = js.native
}

object GetQueryLoggingConfigRequest {
  @scala.inline
  def apply(Id: QueryLoggingConfigId): GetQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetQueryLoggingConfigRequest]
  }
}

