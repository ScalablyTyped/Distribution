package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommitOutput extends js.Object {
  /**
    * A commit data type object that contains information about the specified commit.
    */
  var commit: Commit = js.native
}

object GetCommitOutput {
  @scala.inline
  def apply(commit: Commit): GetCommitOutput = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommitOutput]
  }
  @scala.inline
  implicit class GetCommitOutputOps[Self <: GetCommitOutput] (val x: Self) extends AnyVal {
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
    def setCommit(value: Commit): Self = this.set("commit", value.asInstanceOf[js.Any])
  }
  
}

