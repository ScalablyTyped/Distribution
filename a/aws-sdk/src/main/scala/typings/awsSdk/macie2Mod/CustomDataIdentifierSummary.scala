package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDataIdentifierSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the custom data identifier.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The custom description of the custom data identifier.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the custom data identifier.
    */
  var id: js.UndefOr[string] = js.native
  /**
    * The custom name of the custom data identifier.
    */
  var name: js.UndefOr[string] = js.native
}

object CustomDataIdentifierSummary {
  @scala.inline
  def apply(): CustomDataIdentifierSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDataIdentifierSummary]
  }
  @scala.inline
  implicit class CustomDataIdentifierSummaryOps[Self <: CustomDataIdentifierSummary] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: timestampIso8601): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

