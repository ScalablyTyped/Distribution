package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesInDomainRequest extends js.Object {
  
  /**
    *  Filter the list of repositories to only include those that are managed by the AWS account ID. 
    */
  var administratorAccount: js.UndefOr[AccountId] = js.native
  
  /**
    *  The name of the domain that contains the returned list of repositories. 
    */
  var domain: DomainName = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListRepositoriesInDomainMaxResults] = js.native
  
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  A prefix used to filter returned repositories. Only repositories with names that start with repositoryPrefix are returned. 
    */
  var repositoryPrefix: js.UndefOr[RepositoryName] = js.native
}
object ListRepositoriesInDomainRequest {
  
  @scala.inline
  def apply(domain: DomainName): ListRepositoriesInDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesInDomainRequest]
  }
  
  @scala.inline
  implicit class ListRepositoriesInDomainRequestOps[Self <: ListRepositoriesInDomainRequest] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministratorAccount(value: AccountId): Self = this.set("administratorAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministratorAccount: Self = this.set("administratorAccount", js.undefined)
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListRepositoriesInDomainMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRepositoryPrefix(value: RepositoryName): Self = this.set("repositoryPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryPrefix: Self = this.set("repositoryPrefix", js.undefined)
  }
}
