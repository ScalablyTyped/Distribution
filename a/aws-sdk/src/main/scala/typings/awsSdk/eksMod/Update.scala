package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  /**
    * The Unix epoch timestamp in seconds for when the update was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * Any errors associated with a Failed update.
    */
  var errors: js.UndefOr[ErrorDetails] = js.native
  /**
    * A UUID that is used to track the update.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A key-value map that contains the parameters associated with the update.
    */
  var params: js.UndefOr[UpdateParams] = js.native
  /**
    * The current status of the update.
    */
  var status: js.UndefOr[UpdateStatus] = js.native
  /**
    * The type of the update.
    */
  var `type`: js.UndefOr[UpdateType] = js.native
}

object Update {
  @scala.inline
  def apply(): Update = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Update]
  }
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: ErrorDetail*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: ErrorDetails): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setParamsVarargs(value: UpdateParam*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: UpdateParams): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setStatus(value: UpdateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: UpdateType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

