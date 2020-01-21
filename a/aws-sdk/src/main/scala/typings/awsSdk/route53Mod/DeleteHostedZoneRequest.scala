package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHostedZoneRequest extends js.Object {
  /**
    * The ID of the hosted zone you want to delete.
    */
  var Id: ResourceId = js.native
}

object DeleteHostedZoneRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteHostedZoneRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHostedZoneRequest]
  }
}

