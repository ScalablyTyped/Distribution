package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceCodeType extends js.Object {
  /**
    *  The commit diff for the pull request. 
    */
  var CommitDiff: js.UndefOr[CommitDiffSourceCodeType] = js.native
}

object SourceCodeType {
  @scala.inline
  def apply(): SourceCodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCodeType]
  }
  @scala.inline
  implicit class SourceCodeTypeOps[Self <: SourceCodeType] (val x: Self) extends AnyVal {
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
    def setCommitDiff(value: CommitDiffSourceCodeType): Self = this.set("CommitDiff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitDiff: Self = this.set("CommitDiff", js.undefined)
  }
  
}

