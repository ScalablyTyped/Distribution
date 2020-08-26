package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyPackageVersionsRequest extends js.Object {
  /**
    *  The name of the package that is copied. 
    */
  @JSName("package")
  var _package: PackageName = js.native
  /**
    *  Set to true to overwrite a package version that already exists in the destination repository. If set to false and the package version already exists in the destination repository, the package version is returned in the failedVersions field of the response with an ALREADY_EXISTS error code. 
    */
  var allowOverwrite: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The name of the repository into which package versions are copied. 
    */
  var destinationRepository: RepositoryName = js.native
  /**
    *  The name of the domain that contains the source and destination repositories. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The format of the package that is copied. The valid package types are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.   
    */
  var format: PackageFormat = js.native
  /**
    *  Set to true to copy packages from repositories that are upstream from the source repository to the destination repository. The default setting is false. For more information, see Working with upstream repositories. 
    */
  var includeFromUpstream: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  /**
    *  The name of the repository that contains the package versions to copy. 
    */
  var sourceRepository: RepositoryName = js.native
  /**
    *  A list of key-value pairs. The keys are package versions and the values are package version revisions. A CopyPackageVersion operation succeeds if the specified versions in the source repository match the specified package version revision.    You must specify versions or versionRevisions. You cannot specify both.  
    */
  var versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.native
  /**
    *  The versions of the package to copy.    You must specify versions or versionRevisions. You cannot specify both.  
    */
  var versions: js.UndefOr[PackageVersionList] = js.native
}

object CopyPackageVersionsRequest {
  @scala.inline
  def apply(
    _package: PackageName,
    destinationRepository: RepositoryName,
    domain: DomainName,
    format: PackageFormat,
    sourceRepository: RepositoryName
  ): CopyPackageVersionsRequest = {
    val __obj = js.Dynamic.literal(destinationRepository = destinationRepository.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], sourceRepository = sourceRepository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyPackageVersionsRequest]
  }
  @scala.inline
  implicit class CopyPackageVersionsRequestOps[Self <: CopyPackageVersionsRequest] (val x: Self) extends AnyVal {
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
    def setDestinationRepository(value: RepositoryName): Self = this.set("destinationRepository", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: PackageFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRepository(value: RepositoryName): Self = this.set("sourceRepository", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowOverwrite(value: BooleanOptional): Self = this.set("allowOverwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowOverwrite: Self = this.set("allowOverwrite", js.undefined)
    @scala.inline
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    @scala.inline
    def setIncludeFromUpstream(value: BooleanOptional): Self = this.set("includeFromUpstream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeFromUpstream: Self = this.set("includeFromUpstream", js.undefined)
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setVersionRevisions(value: PackageVersionRevisionMap): Self = this.set("versionRevisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionRevisions: Self = this.set("versionRevisions", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: PackageVersion*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: PackageVersionList): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

