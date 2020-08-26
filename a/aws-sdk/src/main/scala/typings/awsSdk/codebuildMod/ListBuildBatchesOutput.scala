package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBuildBatchesOutput extends js.Object {
  /**
    * An array of strings that contains the batch build identifiers.
    */
  var ids: js.UndefOr[BuildBatchIds] = js.native
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to ListBuildBatches to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListBuildBatchesOutput {
  @scala.inline
  def apply(): ListBuildBatchesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildBatchesOutput]
  }
  @scala.inline
  implicit class ListBuildBatchesOutputOps[Self <: ListBuildBatchesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdsVarargs(value: NonEmptyString*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: BuildBatchIds): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

