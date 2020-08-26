package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBranchInput extends js.Object {
  /**
    * The name of the branch for which you want to retrieve information.
    */
  var branchName: js.UndefOr[BranchName] = js.native
  /**
    * The name of the repository that contains the branch for which you want to retrieve information.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object GetBranchInput {
  @scala.inline
  def apply(): GetBranchInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBranchInput]
  }
  @scala.inline
  implicit class GetBranchInputOps[Self <: GetBranchInput] (val x: Self) extends AnyVal {
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
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranchName: Self = this.set("branchName", js.undefined)
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
  
}

