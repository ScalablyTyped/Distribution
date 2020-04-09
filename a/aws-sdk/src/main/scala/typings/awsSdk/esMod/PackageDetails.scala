package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageDetails extends js.Object {
  /**
    * Timestamp which tells creation date of the package.
    */
  var CreatedAt: js.UndefOr[typings.awsSdk.esMod.CreatedAt] = js.native
  /**
    * Additional information if the package is in an error state. Null otherwise.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.esMod.ErrorDetails] = js.native
  /**
    * User-specified description of the package.
    */
  var PackageDescription: js.UndefOr[typings.awsSdk.esMod.PackageDescription] = js.native
  /**
    * Internal ID of the package.
    */
  var PackageID: js.UndefOr[typings.awsSdk.esMod.PackageID] = js.native
  /**
    * User specified name of the package.
    */
  var PackageName: js.UndefOr[typings.awsSdk.esMod.PackageName] = js.native
  /**
    * Current state of the package. Values are COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
    */
  var PackageStatus: js.UndefOr[typings.awsSdk.esMod.PackageStatus] = js.native
  /**
    * Currently supports only TXT-DICTIONARY.
    */
  var PackageType: js.UndefOr[typings.awsSdk.esMod.PackageType] = js.native
}

object PackageDetails {
  @scala.inline
  def apply(
    CreatedAt: CreatedAt = null,
    ErrorDetails: ErrorDetails = null,
    PackageDescription: PackageDescription = null,
    PackageID: PackageID = null,
    PackageName: PackageName = null,
    PackageStatus: PackageStatus = null,
    PackageType: PackageType = null
  ): PackageDetails = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails.asInstanceOf[js.Any])
    if (PackageDescription != null) __obj.updateDynamic("PackageDescription")(PackageDescription.asInstanceOf[js.Any])
    if (PackageID != null) __obj.updateDynamic("PackageID")(PackageID.asInstanceOf[js.Any])
    if (PackageName != null) __obj.updateDynamic("PackageName")(PackageName.asInstanceOf[js.Any])
    if (PackageStatus != null) __obj.updateDynamic("PackageStatus")(PackageStatus.asInstanceOf[js.Any])
    if (PackageType != null) __obj.updateDynamic("PackageType")(PackageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageDetails]
  }
}

