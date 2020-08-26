package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobOutput extends js.Object {
  var ArtifactList: js.UndefOr[typings.awsSdk.importexportMod.ArtifactList] = js.native
  var Success: js.UndefOr[typings.awsSdk.importexportMod.Success] = js.native
  var WarningMessage: js.UndefOr[typings.awsSdk.importexportMod.WarningMessage] = js.native
}

object UpdateJobOutput {
  @scala.inline
  def apply(): UpdateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobOutput]
  }
  @scala.inline
  implicit class UpdateJobOutputOps[Self <: UpdateJobOutput] (val x: Self) extends AnyVal {
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
    def setArtifactListVarargs(value: Artifact*): Self = this.set("ArtifactList", js.Array(value :_*))
    @scala.inline
    def setArtifactList(value: ArtifactList): Self = this.set("ArtifactList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactList: Self = this.set("ArtifactList", js.undefined)
    @scala.inline
    def setSuccess(value: Success): Self = this.set("Success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("Success", js.undefined)
    @scala.inline
    def setWarningMessage(value: WarningMessage): Self = this.set("WarningMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarningMessage: Self = this.set("WarningMessage", js.undefined)
  }
  
}

