package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDefaultBranchInput extends js.Object {
  /**
    * The name of the branch to set as the default.
    */
  var defaultBranchName: BranchName = js.native
  /**
    * The name of the repository to set or change the default branch for.
    */
  var repositoryName: RepositoryName = js.native
}

object UpdateDefaultBranchInput {
  @scala.inline
  def apply(defaultBranchName: BranchName, repositoryName: RepositoryName): UpdateDefaultBranchInput = {
    val __obj = js.Dynamic.literal(defaultBranchName = defaultBranchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDefaultBranchInput]
  }
  @scala.inline
  implicit class UpdateDefaultBranchInputOps[Self <: UpdateDefaultBranchInput] (val x: Self) extends AnyVal {
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
    def setDefaultBranchName(value: BranchName): Self = this.set("defaultBranchName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
  }
  
}

