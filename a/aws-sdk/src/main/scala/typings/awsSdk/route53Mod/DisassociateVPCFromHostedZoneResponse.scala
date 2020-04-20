package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateVPCFromHostedZoneResponse extends js.Object {
  /**
    * A complex type that describes the changes made to the specified private hosted zone.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo = js.native
}

object DisassociateVPCFromHostedZoneResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): DisassociateVPCFromHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVPCFromHostedZoneResponse]
  }
}

