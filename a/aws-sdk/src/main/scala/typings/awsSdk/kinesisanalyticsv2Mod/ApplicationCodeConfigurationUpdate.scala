package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCodeConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the code content type.
    */
  var CodeContentTypeUpdate: js.UndefOr[CodeContentType] = js.native
  /**
    * Describes updates to the code content of an application.
    */
  var CodeContentUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeContentUpdate] = js.native
}

object ApplicationCodeConfigurationUpdate {
  @scala.inline
  def apply(): ApplicationCodeConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationCodeConfigurationUpdate]
  }
  @scala.inline
  implicit class ApplicationCodeConfigurationUpdateOps[Self <: ApplicationCodeConfigurationUpdate] (val x: Self) extends AnyVal {
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
    def setCodeContentTypeUpdate(value: CodeContentType): Self = this.set("CodeContentTypeUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeContentTypeUpdate: Self = this.set("CodeContentTypeUpdate", js.undefined)
    @scala.inline
    def setCodeContentUpdate(value: CodeContentUpdate): Self = this.set("CodeContentUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeContentUpdate: Self = this.set("CodeContentUpdate", js.undefined)
  }
  
}

