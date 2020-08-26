package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPermissionsFailureEntry extends js.Object {
  /**
    * An error message that applies to the failure of the entry.
    */
  var Error: js.UndefOr[ErrorDetail] = js.native
  /**
    * An identifier for an entry of the batch request.
    */
  var RequestEntry: js.UndefOr[BatchPermissionsRequestEntry] = js.native
}

object BatchPermissionsFailureEntry {
  @scala.inline
  def apply(): BatchPermissionsFailureEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPermissionsFailureEntry]
  }
  @scala.inline
  implicit class BatchPermissionsFailureEntryOps[Self <: BatchPermissionsFailureEntry] (val x: Self) extends AnyVal {
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
    def setError(value: ErrorDetail): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    @scala.inline
    def setRequestEntry(value: BatchPermissionsRequestEntry): Self = this.set("RequestEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestEntry: Self = this.set("RequestEntry", js.undefined)
  }
  
}

