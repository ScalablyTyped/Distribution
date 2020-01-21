package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBranchesOutput extends js.Object {
  /**
    * The list of branch names.
    */
  var branches: js.UndefOr[BranchNameList] = js.native
  /**
    * An enumeration token that returns the batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBranchesOutput {
  @scala.inline
  def apply(branches: BranchNameList = null, nextToken: NextToken = null): ListBranchesOutput = {
    val __obj = js.Dynamic.literal()
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBranchesOutput]
  }
}

