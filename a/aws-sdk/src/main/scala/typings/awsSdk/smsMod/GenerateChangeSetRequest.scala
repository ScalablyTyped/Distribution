package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateChangeSetRequest extends js.Object {
  /**
    * ID of the application associated with the change set.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Format for the change set.
    */
  var changesetFormat: js.UndefOr[OutputFormat] = js.native
}

object GenerateChangeSetRequest {
  @scala.inline
  def apply(): GenerateChangeSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateChangeSetRequest]
  }
  @scala.inline
  implicit class GenerateChangeSetRequestOps[Self <: GenerateChangeSetRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setChangesetFormat(value: OutputFormat): Self = this.set("changesetFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangesetFormat: Self = this.set("changesetFormat", js.undefined)
  }
  
}

