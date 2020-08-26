package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFindingsFilterResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the filter that was updated.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the filter that was updated.
    */
  var id: js.UndefOr[string] = js.native
}

object UpdateFindingsFilterResponse {
  @scala.inline
  def apply(): UpdateFindingsFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFindingsFilterResponse]
  }
  @scala.inline
  implicit class UpdateFindingsFilterResponseOps[Self <: UpdateFindingsFilterResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

