package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedZoneOwner extends js.Object {
  /**
    * If the hosted zone was created by an AWS account, or was created by an AWS service that creates hosted zones using the current account, OwningAccount contains the account ID of that account. For example, when you use AWS Cloud Map to create a hosted zone, Cloud Map creates the hosted zone using the current AWS account. 
    */
  var OwningAccount: js.UndefOr[AWSAccountID] = js.native
  /**
    * If an AWS service uses its own account to create a hosted zone and associate the specified VPC with that hosted zone, OwningService contains an abbreviation that identifies the service. For example, if Amazon Elastic File System (Amazon EFS) created a hosted zone and associated a VPC with the hosted zone, the value of OwningService is efs.amazonaws.com.
    */
  var OwningService: js.UndefOr[HostedZoneOwningService] = js.native
}

object HostedZoneOwner {
  @scala.inline
  def apply(): HostedZoneOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedZoneOwner]
  }
  @scala.inline
  implicit class HostedZoneOwnerOps[Self <: HostedZoneOwner] (val x: Self) extends AnyVal {
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
    def setOwningAccount(value: AWSAccountID): Self = this.set("OwningAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwningAccount: Self = this.set("OwningAccount", js.undefined)
    @scala.inline
    def setOwningService(value: HostedZoneOwningService): Self = this.set("OwningService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwningService: Self = this.set("OwningService", js.undefined)
  }
  
}

