package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePackageVersionsStatusRequest extends StObject {
  
  /**
    *  The name of the package with the version statuses to update. 
    */
  @JSName("package")
  var _package: PackageName
  
  /**
    *  The domain that contains the repository that contains the package versions with a status to be updated. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The package version’s expected status before it is updated. If expectedStatus is provided, the package version's status is updated only if its status at the time UpdatePackageVersionsStatus is called matches expectedStatus. 
    */
  var expectedStatus: js.UndefOr[PackageVersionStatus] = js.undefined
  
  /**
    *  A format that specifies the type of the package with the statuses to update. The valid values are:     npm     pypi     maven   
    */
  var format: PackageFormat
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The repository that contains the package versions with the status you want to update. 
    */
  var repository: RepositoryName
  
  /**
    *  The status you want to change the package version status to. 
    */
  var targetStatus: PackageVersionStatus
  
  /**
    *  A map of package versions and package version revisions. The map key is the package version (for example, 3.5.2), and the map value is the package version revision. 
    */
  var versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.undefined
  
  /**
    *  An array of strings that specify the versions of the package with the statuses to update. 
    */
  var versions: PackageVersionList
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
  implicit class UpdatePackageVersionsStatusRequestMutableBuilder[Self <: UpdatePackageVersionsStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setExpectedStatus(value: PackageVersionStatus): Self = StObject.set(x, "expectedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedStatusUndefined: Self = StObject.set(x, "expectedStatus", js.undefined)
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetStatus(value: PackageVersionStatus): Self = StObject.set(x, "targetStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionRevisions(value: PackageVersionRevisionMap): Self = StObject.set(x, "versionRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionRevisionsUndefined: Self = StObject.set(x, "versionRevisions", js.undefined)
    
    @scala.inline
    def setVersions(value: PackageVersionList): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsVarargs(value: PackageVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
    
    @scala.inline
    def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
