package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociatedApprovalRuleTemplatesForRepositoryInput extends js.Object {
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the repository for which you want to list all associated approval rule templates.
    */
  var repositoryName: RepositoryName = js.native
}

object ListAssociatedApprovalRuleTemplatesForRepositoryInput {
  @scala.inline
  def apply(repositoryName: RepositoryName): ListAssociatedApprovalRuleTemplatesForRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedApprovalRuleTemplatesForRepositoryInput]
  }
  @scala.inline
  implicit class ListAssociatedApprovalRuleTemplatesForRepositoryInputOps[Self <: ListAssociatedApprovalRuleTemplatesForRepositoryInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

