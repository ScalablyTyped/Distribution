package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReusableDelegationSetRequest extends js.Object {
  /**
    * The ID of the reusable delegation set that you want to get a list of name servers for.
    */
  var Id: ResourceId = js.native
}

object GetReusableDelegationSetRequest {
  @scala.inline
  def apply(Id: ResourceId): GetReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetReusableDelegationSetRequest]
  }
}

