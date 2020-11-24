package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainSummary extends js.Object {
  
  /**
    *  The ARN of the domain. 
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    *  A timestamp that contains the date and time the domain was created. 
    */
  var createdTime: js.UndefOr[Timestamp] = js.native
  
  /**
    *  The key used to encrypt the domain. 
    */
  var encryptionKey: js.UndefOr[Arn] = js.native
  
  /**
    *  The name of the domain. 
    */
  var name: js.UndefOr[DomainName] = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var owner: js.UndefOr[AccountId] = js.native
  
  /**
    *  A string that contains the status of the domain. The valid values are:     Active     Deleted   
    */
  var status: js.UndefOr[DomainStatus] = js.native
}
object DomainSummary {
  
  @scala.inline
  def apply(): DomainSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainSummary]
  }
  
  @scala.inline
  implicit class DomainSummaryOps[Self <: DomainSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: Arn): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setName(value: DomainName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: AccountId): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setStatus(value: DomainStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
