package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagesRequest extends js.Object {
  /**
    *  The domain that contains the repository that contains the requested list of packages. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The format of the packages. The valid package types are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.   
    */
  var format: js.UndefOr[PackageFormat] = js.native
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListPackagesMaxResults] = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  A prefix used to filter returned repositories. Only repositories with names that start with repositoryPrefix are returned. 
    */
  var packagePrefix: js.UndefOr[PackageName] = js.native
  /**
    *  The name of the repository from which packages are to be listed. 
    */
  var repository: RepositoryName = js.native
}

object ListPackagesRequest {
  @scala.inline
  def apply(
    domain: DomainName,
    repository: RepositoryName,
    domainOwner: AccountId = null,
    format: PackageFormat = null,
    maxResults: js.UndefOr[ListPackagesMaxResults] = js.undefined,
    namespace: PackageNamespace = null,
    nextToken: PaginationToken = null,
    packagePrefix: PackageName = null
  ): ListPackagesRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (packagePrefix != null) __obj.updateDynamic("packagePrefix")(packagePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackagesRequest]
  }
}

