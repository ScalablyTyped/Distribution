package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesForApprovalRuleTemplateOutput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of repository names that are associated with the specified approval rule template.
    */
  var repositoryNames: js.UndefOr[RepositoryNameList] = js.native
}

object ListRepositoriesForApprovalRuleTemplateOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, repositoryNames: RepositoryNameList = null): ListRepositoriesForApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (repositoryNames != null) __obj.updateDynamic("repositoryNames")(repositoryNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesForApprovalRuleTemplateOutput]
  }
}

