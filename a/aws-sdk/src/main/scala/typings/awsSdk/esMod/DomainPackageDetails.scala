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
  def apply(): DomainPackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainPackageDetails]
  }
  @scala.inline
  implicit class DomainPackageDetailsOps[Self <: DomainPackageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setDomainPackageStatus(value: DomainPackageStatus): Self = this.set("DomainPackageStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainPackageStatus: Self = this.set("DomainPackageStatus", js.undefined)
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = this.set("ErrorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetails: Self = this.set("ErrorDetails", js.undefined)
    @scala.inline
    def setLastUpdated(value: LastUpdated): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    @scala.inline
    def setPackageID(value: PackageID): Self = this.set("PackageID", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageID: Self = this.set("PackageID", js.undefined)
    @scala.inline
    def setPackageName(value: PackageName): Self = this.set("PackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("PackageName", js.undefined)
    @scala.inline
    def setPackageType(value: PackageType): Self = this.set("PackageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageType: Self = this.set("PackageType", js.undefined)
    @scala.inline
    def setReferencePath(value: ReferencePath): Self = this.set("ReferencePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferencePath: Self = this.set("ReferencePath", js.undefined)
  }
  
}

