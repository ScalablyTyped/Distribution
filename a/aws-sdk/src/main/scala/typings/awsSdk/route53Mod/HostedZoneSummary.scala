package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedZoneSummary extends js.Object {
  /**
    * The Route 53 hosted zone ID of a private hosted zone that the specified VPC is associated with.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * The name of the private hosted zone, such as example.com.
    */
  var Name: DNSName = js.native
  /**
    * The owner of a private hosted zone that the specified VPC is associated with. The owner can be either an AWS account or an AWS service.
    */
  var Owner: HostedZoneOwner = js.native
}

object HostedZoneSummary {
  @scala.inline
  def apply(HostedZoneId: ResourceId, Name: DNSName, Owner: HostedZoneOwner): HostedZoneSummary = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedZoneSummary]
  }
}

