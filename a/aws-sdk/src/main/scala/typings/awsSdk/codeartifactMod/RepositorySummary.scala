package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositorySummary extends StObject {
  
  /**
    *  The AWS account ID that manages the repository. 
    */
  var administratorAccount: js.UndefOr[AccountId] = js.native
  
  /**
    *  The ARN of the repository. 
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    *  The description of the repository. 
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    *  The name of the domain that contains the repository. 
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  
  /**
    *  The name of the repository. 
    */
  var name: js.UndefOr[RepositoryName] = js.native
}
object RepositorySummary {
  
  @scala.inline
  def apply(): RepositorySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositorySummary]
  }
  
  @scala.inline
  implicit class RepositorySummaryMutableBuilder[Self <: RepositorySummary] (val x: Self) extends AnyVal {
    
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
    def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
