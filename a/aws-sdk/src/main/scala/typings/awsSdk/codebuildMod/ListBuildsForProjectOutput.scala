package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBuildsForProjectOutput extends js.Object {
  /**
    * A list of build IDs for the specified build project, with each build ID representing a single build.
    */
  var ids: js.UndefOr[BuildIds] = js.native
  /**
    * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a nextToken. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListBuildsForProjectOutput {
  @scala.inline
  def apply(): ListBuildsForProjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsForProjectOutput]
  }
  @scala.inline
  implicit class ListBuildsForProjectOutputOps[Self <: ListBuildsForProjectOutput] (val x: Self) extends AnyVal {
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
    def setIds(value: BuildIds): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

