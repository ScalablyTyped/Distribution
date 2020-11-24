package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateExternalConnectionRequest extends js.Object {
  
  /**
    * The name of the domain that contains the repository from which to remove the external repository. 
    */
  var domain: DomainName = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The name of the external connection to be removed from the repository. 
    */
  var externalConnection: ExternalConnectionName = js.native
  
  /**
    * The name of the repository from which the external connection will be removed. 
    */
  var repository: RepositoryName = js.native
}
object DisassociateExternalConnectionRequest {
  
  @scala.inline
  def apply(domain: DomainName, externalConnection: ExternalConnectionName, repository: RepositoryName): DisassociateExternalConnectionRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], externalConnection = externalConnection.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateExternalConnectionRequest]
  }
  
  @scala.inline
  implicit class DisassociateExternalConnectionRequestOps[Self <: DisassociateExternalConnectionRequest] (val x: Self) extends AnyVal {
    
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
    def setExternalConnection(value: ExternalConnectionName): Self = this.set("externalConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: RepositoryName): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
  }
}
