package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGrantPermissionsResponse extends js.Object {
  /**
    * A list of failures to grant permissions to the resources.
    */
  var Failures: js.UndefOr[BatchPermissionsFailureList] = js.native
}

object BatchGrantPermissionsResponse {
  @scala.inline
  def apply(): BatchGrantPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGrantPermissionsResponse]
  }
  @scala.inline
  implicit class BatchGrantPermissionsResponseOps[Self <: BatchGrantPermissionsResponse] (val x: Self) extends AnyVal {
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
    def setFailuresVarargs(value: BatchPermissionsFailureEntry*): Self = this.set("Failures", js.Array(value :_*))
    @scala.inline
    def setFailures(value: BatchPermissionsFailureList): Self = this.set("Failures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailures: Self = this.set("Failures", js.undefined)
  }
  
}

