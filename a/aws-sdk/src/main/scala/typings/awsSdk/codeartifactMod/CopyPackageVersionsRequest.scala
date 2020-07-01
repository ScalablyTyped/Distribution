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
    sourceRepository: RepositoryName,
    allowOverwrite: js.UndefOr[BooleanOptional] = js.undefined,
    domainOwner: AccountId = null,
    includeFromUpstream: js.UndefOr[BooleanOptional] = js.undefined,
    namespace: PackageNamespace = null,
    versionRevisions: PackageVersionRevisionMap = null,
    versions: PackageVersionList = null
  ): CopyPackageVersionsRequest = {
    val __obj = js.Dynamic.literal(destinationRepository = destinationRepository.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], sourceRepository = sourceRepository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverwrite)) __obj.updateDynamic("allowOverwrite")(allowOverwrite.get.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFromUpstream)) __obj.updateDynamic("includeFromUpstream")(includeFromUpstream.get.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (versionRevisions != null) __obj.updateDynamic("versionRevisions")(versionRevisions.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyPackageVersionsRequest]
  }
}

