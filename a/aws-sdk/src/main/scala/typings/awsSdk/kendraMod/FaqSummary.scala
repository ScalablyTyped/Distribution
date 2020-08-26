package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaqSummary extends js.Object {
  /**
    * The UNIX datetime that the FAQ was added to the index.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier of the FAQ.
    */
  var Id: js.UndefOr[FaqId] = js.native
  /**
    * The name that you assigned the FAQ when you created or updated the FAQ.
    */
  var Name: js.UndefOr[FaqName] = js.native
  /**
    * The current status of the FAQ. When the status is ACTIVE the FAQ is ready for use.
    */
  var Status: js.UndefOr[FaqStatus] = js.native
  /**
    * The UNIX datetime that the FAQ was last updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object FaqSummary {
  @scala.inline
  def apply(): FaqSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaqSummary]
  }
  @scala.inline
  implicit class FaqSummaryOps[Self <: FaqSummary] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setId(value: FaqId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: FaqName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStatus(value: FaqStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
  
}

