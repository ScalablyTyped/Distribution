package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCodeConfigurationDescription extends js.Object {
  /**
    * Describes details about the location and format of the application code.
    */
  var CodeContentDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeContentDescription] = js.native
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: typings.awsSdk.kinesisanalyticsv2Mod.CodeContentType = js.native
}

object ApplicationCodeConfigurationDescription {
  @scala.inline
  def apply(CodeContentType: CodeContentType): ApplicationCodeConfigurationDescription = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCodeConfigurationDescription]
  }
  @scala.inline
  implicit class ApplicationCodeConfigurationDescriptionOps[Self <: ApplicationCodeConfigurationDescription] (val x: Self) extends AnyVal {
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
    def setCodeContentType(value: CodeContentType): Self = this.set("CodeContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeContentDescription(value: CodeContentDescription): Self = this.set("CodeContentDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeContentDescription: Self = this.set("CodeContentDescription", js.undefined)
  }
  
}

