package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateVPCWithHostedZoneResponse extends js.Object {
  /**
    * A complex type that describes the changes made to your hosted zone.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo = js.native
}

object AssociateVPCWithHostedZoneResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): AssociateVPCWithHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateVPCWithHostedZoneResponse]
  }
}

