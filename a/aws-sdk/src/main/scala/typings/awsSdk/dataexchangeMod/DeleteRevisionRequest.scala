package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRevisionRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string = js.native
}

object DeleteRevisionRequest {
  @scala.inline
  def apply(DataSetId: string, RevisionId: string): DeleteRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRevisionRequest]
  }
  @scala.inline
  implicit class DeleteRevisionRequestOps[Self <: DeleteRevisionRequest] (val x: Self) extends AnyVal {
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
    def setDataSetId(value: string): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevisionId(value: string): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
  }
  
}

