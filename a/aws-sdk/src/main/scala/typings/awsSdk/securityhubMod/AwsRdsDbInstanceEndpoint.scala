package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsRdsDbInstanceEndpoint extends js.Object {
  /**
    * Specifies the DNS address of the DB instance.
    */
  var Address: js.UndefOr[NonEmptyString] = js.native
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[Integer] = js.native
}

object AwsRdsDbInstanceEndpoint {
  @scala.inline
  def apply(
    Address: NonEmptyString = null,
    HostedZoneId: NonEmptyString = null,
    Port: js.UndefOr[Integer] = js.undefined
  ): AwsRdsDbInstanceEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsRdsDbInstanceEndpoint]
  }
}

