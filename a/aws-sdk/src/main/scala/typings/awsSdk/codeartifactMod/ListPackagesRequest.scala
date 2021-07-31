package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagesRequest extends StObject {
  
  /**
    *  The domain that contains the repository that contains the requested list of packages. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The format of the packages. The valid package types are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.   
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListPackagesMaxResults] = js.undefined
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  A prefix used to filter returned repositories. Only repositories with names that start with repositoryPrefix are returned. 
    */
  var packagePrefix: js.UndefOr[PackageName] = js.undefined
  
  /**
    *  The name of the repository from which packages are to be listed. 
    */
  var repository: RepositoryName
}
object ListPackagesRequest {
  
  @scala.inline
  def apply(domain: DomainName, repository: RepositoryName): ListPackagesRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackagesRequest]
  }
  
  @scala.inline
  implicit class ListPackagesRequestMutableBuilder[Self <: ListPackagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListPackagesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPackagePrefix(value: PackageName): Self = StObject.set(x, "packagePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagePrefixUndefined: Self = StObject.set(x, "packagePrefix", js.undefined)
    
    @scala.inline
    def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
