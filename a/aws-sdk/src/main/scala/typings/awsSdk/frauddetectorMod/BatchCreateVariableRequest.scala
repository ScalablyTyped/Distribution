package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateVariableRequest extends js.Object {
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
  /**
    * The list of variables for the batch create variable request.
    */
  var variableEntries: VariableEntryList = js.native
}

object BatchCreateVariableRequest {
  @scala.inline
  def apply(variableEntries: VariableEntryList): BatchCreateVariableRequest = {
    val __obj = js.Dynamic.literal(variableEntries = variableEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateVariableRequest]
  }
  @scala.inline
  implicit class BatchCreateVariableRequestOps[Self <: BatchCreateVariableRequest] (val x: Self) extends AnyVal {
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
    def setVariableEntriesVarargs(value: VariableEntry*): Self = this.set("variableEntries", js.Array(value :_*))
    @scala.inline
    def setVariableEntries(value: VariableEntryList): Self = this.set("variableEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

