package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardVersion extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The time that this dashboard version was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * Description.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  /**
    * Errors.
    */
  var Errors: js.UndefOr[DashboardErrorList] = js.native
  /**
    * Source entity ARN.
    */
  var SourceEntityArn: js.UndefOr[Arn] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  /**
    * Version number.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}

object DashboardVersion {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreatedTime: Timestamp_ = null,
    Description: VersionDescription = null,
    Errors: DashboardErrorList = null,
    SourceEntityArn: Arn = null,
    Status: ResourceStatus = null,
    VersionNumber: js.UndefOr[VersionNumber] = js.undefined
  ): DashboardVersion = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (SourceEntityArn != null) __obj.updateDynamic("SourceEntityArn")(SourceEntityArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(VersionNumber)) __obj.updateDynamic("VersionNumber")(VersionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardVersion]
  }
}

