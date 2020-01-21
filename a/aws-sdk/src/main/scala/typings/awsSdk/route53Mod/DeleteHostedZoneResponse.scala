package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHostedZoneResponse extends js.Object {
  /**
    * A complex type that contains the ID, the status, and the date and time of a request to delete a hosted zone.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo = js.native
}

object DeleteHostedZoneResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): DeleteHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHostedZoneResponse]
  }
}

