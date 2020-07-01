package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackageVersionRequest extends js.Object {
  /**
    *  The name of the requested package version. 
    */
  @JSName("package")
  var _package: PackageName = js.native
  /**
    *  The name of the domain that contains the repository that contains the package version. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  A format that specifies the type of the requested package version. The valid values are:     npm     pypi     maven   
    */
  var format: PackageFormat = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  A string that contains the package version (for example, 3.5.2). 
    */
  var packageVersion: PackageVersion = js.native
  /**
    *  The name of the repository that contains the package version. 
    */
  var repository: RepositoryName = js.native
}

object DescribePackageVersionRequest {
  @scala.inline
  def apply(
    _package: PackageName,
    domain: DomainName,
    format: PackageFormat,
    packageVersion: PackageVersion,
    repository: RepositoryName,
    domainOwner: AccountId = null,
    namespace: PackageNamespace = null
  ): DescribePackageVersionRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageVersionRequest]
  }
}

