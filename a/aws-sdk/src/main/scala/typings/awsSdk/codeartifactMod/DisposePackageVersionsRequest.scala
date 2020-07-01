package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisposePackageVersionsRequest extends js.Object {
  /**
    *  The name of the package with the versions you want to dispose. 
    */
  @JSName("package")
  var _package: PackageName = js.native
  /**
    *  The name of the domain that contains the repository you want to dispose. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The expected status of the package version to dispose. Valid values are:     Published     Unfinished     Unlisted     Archived     Disposed   
    */
  var expectedStatus: js.UndefOr[PackageVersionStatus] = js.native
  /**
    *  A format that specifies the type of package versions you want to dispose. The valid values are:     npm     pypi     maven   
    */
  var format: PackageFormat = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  The name of the repository that contains the package versions you want to dispose. 
    */
  var repository: RepositoryName = js.native
  /**
    *  The revisions of the package versions you want to dispose. 
    */
  var versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.native
  /**
    *  The versions of the package you want to dispose. 
    */
  var versions: PackageVersionList = js.native
}

object DisposePackageVersionsRequest {
  @scala.inline
  def apply(
    _package: PackageName,
    domain: DomainName,
    format: PackageFormat,
    repository: RepositoryName,
    versions: PackageVersionList,
    domainOwner: AccountId = null,
    expectedStatus: PackageVersionStatus = null,
    namespace: PackageNamespace = null,
    versionRevisions: PackageVersionRevisionMap = null
  ): DisposePackageVersionsRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (expectedStatus != null) __obj.updateDynamic("expectedStatus")(expectedStatus.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (versionRevisions != null) __obj.updateDynamic("versionRevisions")(versionRevisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisposePackageVersionsRequest]
  }
}

