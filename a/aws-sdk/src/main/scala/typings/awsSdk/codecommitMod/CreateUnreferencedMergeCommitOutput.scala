package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUnreferencedMergeCommitOutput extends js.Object {
  /**
    * The full commit ID of the commit that contains your merge results.
    */
  var commitId: js.UndefOr[ObjectId] = js.native
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the merge results.
    */
  var treeId: js.UndefOr[ObjectId] = js.native
}

object CreateUnreferencedMergeCommitOutput {
  @scala.inline
  def apply(): CreateUnreferencedMergeCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUnreferencedMergeCommitOutput]
  }
  @scala.inline
  implicit class CreateUnreferencedMergeCommitOutputOps[Self <: CreateUnreferencedMergeCommitOutput] (val x: Self) extends AnyVal {
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
    def setCommitId(value: ObjectId): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitId: Self = this.set("commitId", js.undefined)
    @scala.inline
    def setTreeId(value: ObjectId): Self = this.set("treeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeId: Self = this.set("treeId", js.undefined)
  }
  
}

