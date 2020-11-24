package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class HostedZoneSummaryOps[Self <: HostedZoneSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DNSName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: HostedZoneOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
  }
}
