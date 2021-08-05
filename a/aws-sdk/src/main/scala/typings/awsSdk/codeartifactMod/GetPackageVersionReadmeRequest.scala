package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPackageVersionReadmeRequest extends StObject {
  
  /**
    *  The name of the package version that contains the requested readme file. 
    */
  @JSName("package")
  var _package: PackageName
  
  /**
    *  The name of the domain that contains the repository that contains the package version with the requested readme file. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  A format that specifies the type of the package version with the requested readme file. The valid values are:     npm     pypi     maven   
    */
  var format: PackageFormat
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  A string that contains the package version (for example, 3.5.2). 
    */
  var packageVersion: PackageVersion
  
  /**
    *  The repository that contains the package with the requested readme file. 
    */
  var repository: RepositoryName
}
object GetPackageVersionReadmeRequest {
  
  inline def apply(
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
  
  extension [Self <: GetPackageVersionReadmeRequest](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
