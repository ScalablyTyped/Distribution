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
    versions: PackageVersionList,
    domainOwner: AccountId = null,
    expectedStatus: PackageVersionStatus = null,
    namespace: PackageNamespace = null,
    versionRevisions: PackageVersionRevisionMap = null
  ): UpdatePackageVersionsStatusRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], targetStatus = targetStatus.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (expectedStatus != null) __obj.updateDynamic("expectedStatus")(expectedStatus.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (versionRevisions != null) __obj.updateDynamic("versionRevisions")(versionRevisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackageVersionsStatusRequest]
  }
}

