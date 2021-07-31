package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyPackageVersionsRequest extends StObject {
  
  /**
    *  The name of the package that is copied. 
    */
  @JSName("package")
  var _package: PackageName
  
  /**
    *  Set to true to overwrite a package version that already exists in the destination repository. If set to false and the package version already exists in the destination repository, the package version is returned in the failedVersions field of the response with an ALREADY_EXISTS error code. 
    */
  var allowOverwrite: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  The name of the repository into which package versions are copied. 
    */
  var destinationRepository: RepositoryName
  
  /**
    *  The name of the domain that contains the source and destination repositories. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The format of the package that is copied. The valid package types are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.   
    */
  var format: PackageFormat
  
  /**
    *  Set to true to copy packages from repositories that are upstream from the source repository to the destination repository. The default setting is false. For more information, see Working with upstream repositories. 
    */
  var includeFromUpstream: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The name of the repository that contains the package versions to copy. 
    */
  var sourceRepository: RepositoryName
  
  /**
    *  A list of key-value pairs. The keys are package versions and the values are package version revisions. A CopyPackageVersion operation succeeds if the specified versions in the source repository match the specified package version revision.    You must specify versions or versionRevisions. You cannot specify both.  
    */
  var versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.undefined
  
  /**
    *  The versions of the package to copy.    You must specify versions or versionRevisions. You cannot specify both.  
    */
  var versions: js.UndefOr[PackageVersionList] = js.undefined
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
  implicit class CopyPackageVersionsRequestMutableBuilder[Self <: CopyPackageVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowOverwrite(value: BooleanOptional): Self = StObject.set(x, "allowOverwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOverwriteUndefined: Self = StObject.set(x, "allowOverwrite", js.undefined)
    
    @scala.inline
    def setDestinationRepository(value: RepositoryName): Self = StObject.set(x, "destinationRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFromUpstream(value: BooleanOptional): Self = StObject.set(x, "includeFromUpstream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFromUpstreamUndefined: Self = StObject.set(x, "includeFromUpstream", js.undefined)
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setSourceRepository(value: RepositoryName): Self = StObject.set(x, "sourceRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionRevisions(value: PackageVersionRevisionMap): Self = StObject.set(x, "versionRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionRevisionsUndefined: Self = StObject.set(x, "versionRevisions", js.undefined)
    
    @scala.inline
    def setVersions(value: PackageVersionList): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: PackageVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
    
    @scala.inline
    def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
