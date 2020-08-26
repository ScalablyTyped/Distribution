package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePackageVersionsStatusRequest extends js.Object {
  /**
    *  The name of the package with the version statuses to update. 
    */
  @JSName("package")
  var _package: PackageName = js.native
  /**
    *  The domain that contains the repository that contains the package versions with a status to be updated. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The package version’s expected status before it is updated. If expectedStatus is provided, the package version's status is updated only if its status at the time UpdatePackageVersionsStatus is called matches expectedStatus. 
    */
  var expectedStatus: js.UndefOr[PackageVersionStatus] = js.native
  /**
    *  A format that specifies the type of the package with the statuses to update. The valid values are:     npm     pypi     maven   
    */
  var format: PackageFormat = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  The repository that contains the package versions with the status you want to update. 
    */
  var repository: RepositoryName = js.native
  /**
    *  The status you want to change the package version status to. 
    */
  var targetStatus: PackageVersionStatus = js.native
  /**
    *  A map of package versions and package version revisions. The map key is the package version (for example, 3.5.2), and the map value is the package version revision. 
    */
  var versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.native
  /**
    *  An array of strings that specify the versions of the package with the statuses to update. 
    */
  var versions: PackageVersionList = js.native
}

object UpdatePackageVersionsStatusRequest {
  @scala.inline
  def apply(
    _package: PackageName,
    domain: DomainName,
    format: PackageFormat,
    repository: RepositoryName,
    targetStatus: PackageVersionStatus,
    versions: PackageVersionList
  ): UpdatePackageVersionsStatusRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], targetStatus = targetStatus.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackageVersionsStatusRequest]
  }
  @scala.inline
  implicit class UpdatePackageVersionsStatusRequestOps[Self <: UpdatePackageVersionsStatusRequest] (val x: Self) extends AnyVal {
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
    def set_package(value: PackageName): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: PackageFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: RepositoryName): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetStatus(value: PackageVersionStatus): Self = this.set("targetStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionsVarargs(value: PackageVersion*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: PackageVersionList): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    @scala.inline
    def setExpectedStatus(value: PackageVersionStatus): Self = this.set("expectedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedStatus: Self = this.set("expectedStatus", js.undefined)
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setVersionRevisions(value: PackageVersionRevisionMap): Self = this.set("versionRevisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionRevisions: Self = this.set("versionRevisions", js.undefined)
  }
  
}

