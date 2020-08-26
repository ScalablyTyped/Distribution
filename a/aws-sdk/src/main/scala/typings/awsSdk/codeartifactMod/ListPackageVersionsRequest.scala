package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackageVersionsRequest extends js.Object {
  /**
    *  The name of the package for which you want to return a list of package versions. 
    */
  @JSName("package")
  var _package: PackageName = js.native
  /**
    *  The name of the domain that contains the repository that contains the returned package versions. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The format of the returned packages. The valid package types are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.   
    */
  var format: PackageFormat = js.native
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListPackageVersionsMaxResults] = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The name of the repository that contains the package. 
    */
  var repository: RepositoryName = js.native
  /**
    *  How to sort the returned list of package versions. 
    */
  var sortBy: js.UndefOr[PackageVersionSortType] = js.native
  /**
    *  A string that specifies the status of the package versions to include in the returned list. It can be one of the following:     Published     Unfinished     Unlisted     Archived     Disposed   
    */
  var status: js.UndefOr[PackageVersionStatus] = js.native
}

object ListPackageVersionsRequest {
  @scala.inline
  def apply(_package: PackageName, domain: DomainName, format: PackageFormat, repository: RepositoryName): ListPackageVersionsRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackageVersionsRequest]
  }
  @scala.inline
  implicit class ListPackageVersionsRequestOps[Self <: ListPackageVersionsRequest] (val x: Self) extends AnyVal {
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
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    @scala.inline
    def setMaxResults(value: ListPackageVersionsMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSortBy(value: PackageVersionSortType): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    @scala.inline
    def setStatus(value: PackageVersionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

