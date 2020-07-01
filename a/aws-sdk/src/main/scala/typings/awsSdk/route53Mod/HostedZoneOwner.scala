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
  def apply(OwningAccount: AWSAccountID = null, OwningService: HostedZoneOwningService = null): HostedZoneOwner = {
    val __obj = js.Dynamic.literal()
    if (OwningAccount != null) __obj.updateDynamic("OwningAccount")(OwningAccount.asInstanceOf[js.Any])
    if (OwningService != null) __obj.updateDynamic("OwningService")(OwningService.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedZoneOwner]
  }
}

