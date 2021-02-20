package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPackageVersionAssetRequest extends StObject {
  
  /**
    *  The name of the package that contains the requested asset. 
    */
  @JSName("package")
  var _package: PackageName = js.native
  
  /**
    *  The name of the requested asset. 
    */
  var asset: AssetName = js.native
  
  /**
    *  The domain that contains the repository that contains the package version with the requested asset. 
    */
  var domain: DomainName = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  
  /**
    *  A format that specifies the type of the package version with the requested asset file. The valid values are:     npm     pypi     maven   
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
    *  The name of the package version revision that contains the requested asset. 
    */
  var packageVersionRevision: js.UndefOr[PackageVersionRevision] = js.native
  
  /**
    *  The repository that contains the package version with the requested asset. 
    */
  var repository: RepositoryName = js.native
}
object GetPackageVersionAssetRequest {
  
  @scala.inline
  def apply(
    _package: PackageName,
    asset: AssetName,
    domain: DomainName,
    format: PackageFormat,
    packageVersion: PackageVersion,
    repository: RepositoryName
  ): GetPackageVersionAssetRequest = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPackageVersionAssetRequest]
  }
  
  @scala.inline
  implicit class GetPackageVersionAssetRequestMutableBuilder[Self <: GetPackageVersionAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: AssetName): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageVersionRevision(value: PackageVersionRevision): Self = StObject.set(x, "packageVersionRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageVersionRevisionUndefined: Self = StObject.set(x, "packageVersionRevision", js.undefined)
    
    @scala.inline
    def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
