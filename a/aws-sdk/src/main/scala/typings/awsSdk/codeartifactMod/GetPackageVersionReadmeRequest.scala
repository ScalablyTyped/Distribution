package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPackageVersionReadmeRequest extends js.Object {
  /**
    *  The name of the package version that contains the requested readme file. 
    */
  @JSName("package")
  var _package: PackageName = js.native
  /**
    *  The name of the domain that contains the repository that contains the package version with the requested readme file. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  A format that specifies the type of the package version with the requested readme file. The valid values are:     npm     pypi     maven   
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
    *  The repository that contains the package with the requested readme file. 
    */
  var repository: RepositoryName = js.native
}

object GetPackageVersionReadmeRequest {
  @scala.inline
  def apply(
    _package: PackageName,
    domain: DomainName,
    format: PackageFormat,
    packageVersion: PackageVersion,
    repository: RepositoryName
  ): GetPackageVersionReadmeRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPackageVersionReadmeRequest]
  }
  @scala.inline
  implicit class GetPackageVersionReadmeRequestOps[Self <: GetPackageVersionReadmeRequest] (val x: Self) extends AnyVal {
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
    def setPackageVersion(value: PackageVersion): Self = this.set("packageVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: RepositoryName): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
  
}

