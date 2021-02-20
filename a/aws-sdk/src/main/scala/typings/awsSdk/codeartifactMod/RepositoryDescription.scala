package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryDescription extends StObject {
  
  /**
    *  The 12-digit account number of the AWS account that manages the repository. 
    */
  var administratorAccount: js.UndefOr[AccountId] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the repository. 
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    *  A text description of the repository. 
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    *  The name of the domain that contains the repository. 
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  
  /**
    *  An array of external connections associated with the repository. 
    */
  var externalConnections: js.UndefOr[RepositoryExternalConnectionInfoList] = js.native
  
  /**
    *  The name of the repository. 
    */
  var name: js.UndefOr[RepositoryName] = js.native
  
  /**
    *  A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. For more information, see Working with upstream repositories. 
    */
  var upstreams: js.UndefOr[UpstreamRepositoryInfoList] = js.native
}
object RepositoryDescription {
  
  @scala.inline
  def apply(): RepositoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryDescription]
  }
  
  @scala.inline
  implicit class RepositoryDescriptionMutableBuilder[Self <: RepositoryDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministratorAccount(value: AccountId): Self = StObject.set(x, "administratorAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministratorAccountUndefined: Self = StObject.set(x, "administratorAccount", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setExternalConnections(value: RepositoryExternalConnectionInfoList): Self = StObject.set(x, "externalConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalConnectionsUndefined: Self = StObject.set(x, "externalConnections", js.undefined)
    
    @scala.inline
    def setExternalConnectionsVarargs(value: RepositoryExternalConnectionInfo*): Self = StObject.set(x, "externalConnections", js.Array(value :_*))
    
    @scala.inline
    def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpstreams(value: UpstreamRepositoryInfoList): Self = StObject.set(x, "upstreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpstreamsUndefined: Self = StObject.set(x, "upstreams", js.undefined)
    
    @scala.inline
    def setUpstreamsVarargs(value: UpstreamRepositoryInfo*): Self = StObject.set(x, "upstreams", js.Array(value :_*))
  }
}
