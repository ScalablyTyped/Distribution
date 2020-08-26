package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteCaSummary extends js.Object {
  /**
    * The time when the CA was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.native
}

object WebsiteCaSummary {
  @scala.inline
  def apply(): WebsiteCaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsiteCaSummary]
  }
  @scala.inline
  implicit class WebsiteCaSummaryOps[Self <: WebsiteCaSummary] (val x: Self) extends AnyVal {
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
    def setCreatedTime(value: DateTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setWebsiteCaId(value: Id): Self = this.set("WebsiteCaId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteCaId: Self = this.set("WebsiteCaId", js.undefined)
  }
  
}

