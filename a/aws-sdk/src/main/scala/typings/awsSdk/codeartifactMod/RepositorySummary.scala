package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositorySummary extends js.Object {
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
  implicit class RepositorySummaryOps[Self <: RepositorySummary] (val x: Self) extends AnyVal {
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
    def setAdministratorAccount(value: AccountId): Self = this.set("administratorAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdministratorAccount: Self = this.set("administratorAccount", js.undefined)
    @scala.inline
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    @scala.inline
    def setName(value: RepositoryName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

