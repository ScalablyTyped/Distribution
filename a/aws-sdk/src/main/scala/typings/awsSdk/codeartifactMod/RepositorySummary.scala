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
  def apply(
    administratorAccount: AccountId = null,
    arn: Arn = null,
    description: Description = null,
    domainName: DomainName = null,
    domainOwner: AccountId = null,
    name: RepositoryName = null
  ): RepositorySummary = {
    val __obj = js.Dynamic.literal()
    if (administratorAccount != null) __obj.updateDynamic("administratorAccount")(administratorAccount.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositorySummary]
  }
}

