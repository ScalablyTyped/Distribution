package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddLayerVersionPermissionResponse extends js.Object {
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * The permission statement.
    */
  var Statement: js.UndefOr[String] = js.native
}

object AddLayerVersionPermissionResponse {
  @scala.inline
  def apply(): AddLayerVersionPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddLayerVersionPermissionResponse]
  }
  @scala.inline
  implicit class AddLayerVersionPermissionResponseOps[Self <: AddLayerVersionPermissionResponse] (val x: Self) extends AnyVal {
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
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
    @scala.inline
    def setStatement(value: String): Self = this.set("Statement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement: Self = this.set("Statement", js.undefined)
  }
  
}

