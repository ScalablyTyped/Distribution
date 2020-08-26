package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCommitsOutput extends js.Object {
  /**
    * An array of commit data type objects, each of which contains information about a specified commit.
    */
  var commits: js.UndefOr[CommitObjectsList] = js.native
  /**
    * Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was a shortened SHA ID or that commit was not found in the specified repository, the ID returns an error object with more information.
    */
  var errors: js.UndefOr[BatchGetCommitsErrorsList] = js.native
}

object BatchGetCommitsOutput {
  @scala.inline
  def apply(): BatchGetCommitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCommitsOutput]
  }
  @scala.inline
  implicit class BatchGetCommitsOutputOps[Self <: BatchGetCommitsOutput] (val x: Self) extends AnyVal {
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
    def setCommitsVarargs(value: Commit*): Self = this.set("commits", js.Array(value :_*))
    @scala.inline
    def setCommits(value: CommitObjectsList): Self = this.set("commits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommits: Self = this.set("commits", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: BatchGetCommitsError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchGetCommitsErrorsList): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

