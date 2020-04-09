package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainPackageDetails extends js.Object {
  /**
    * Name of the domain you've associated a package with.
    */
  var DomainName: js.UndefOr[typings.awsSdk.esMod.DomainName] = js.native
  /**
    * State of the association. Values are ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
    */
  var DomainPackageStatus: js.UndefOr[typings.awsSdk.esMod.DomainPackageStatus] = js.native
  /**
    * Additional information if the package is in an error state. Null otherwise.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.esMod.ErrorDetails] = js.native
  /**
    * Timestamp of the most-recent update to the association status.
    */
  var LastUpdated: js.UndefOr[typings.awsSdk.esMod.LastUpdated] = js.native
  /**
    * Internal ID of the package.
    */
  var PackageID: js.UndefOr[typings.awsSdk.esMod.PackageID] = js.native
  /**
    * User specified name of the package.
    */
  var PackageName: js.UndefOr[typings.awsSdk.esMod.PackageName] = js.native
  /**
    * Currently supports only TXT-DICTIONARY.
    */
  var PackageType: js.UndefOr[typings.awsSdk.esMod.PackageType] = js.native
  /**
    * The relative path on Amazon ES nodes, which can be used as synonym_path when the package is synonym file.
    */
  var ReferencePath: js.UndefOr[typings.awsSdk.esMod.ReferencePath] = js.native
}

object DomainPackageDetails {
  @scala.inline
  def apply(
    DomainName: DomainName = null,
    DomainPackageStatus: DomainPackageStatus = null,
    ErrorDetails: ErrorDetails = null,
    LastUpdated: LastUpdated = null,
    PackageID: PackageID = null,
    PackageName: PackageName = null,
    PackageType: PackageType = null,
    ReferencePath: ReferencePath = null
  ): DomainPackageDetails = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (DomainPackageStatus != null) __obj.updateDynamic("DomainPackageStatus")(DomainPackageStatus.asInstanceOf[js.Any])
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (PackageID != null) __obj.updateDynamic("PackageID")(PackageID.asInstanceOf[js.Any])
    if (PackageName != null) __obj.updateDynamic("PackageName")(PackageName.asInstanceOf[js.Any])
    if (PackageType != null) __obj.updateDynamic("PackageType")(PackageType.asInstanceOf[js.Any])
    if (ReferencePath != null) __obj.updateDynamic("ReferencePath")(ReferencePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainPackageDetails]
  }
}

