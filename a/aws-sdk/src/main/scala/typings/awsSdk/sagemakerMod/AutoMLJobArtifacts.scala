package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobArtifacts extends js.Object {
  /**
    * The URL to the notebook location.
    */
  var CandidateDefinitionNotebookLocation: js.UndefOr[typings.awsSdk.sagemakerMod.CandidateDefinitionNotebookLocation] = js.native
  /**
    * The URL to the notebook location.
    */
  var DataExplorationNotebookLocation: js.UndefOr[typings.awsSdk.sagemakerMod.DataExplorationNotebookLocation] = js.native
}

object AutoMLJobArtifacts {
  @scala.inline
  def apply(): AutoMLJobArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobArtifacts]
  }
  @scala.inline
  implicit class AutoMLJobArtifactsOps[Self <: AutoMLJobArtifacts] (val x: Self) extends AnyVal {
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
    def setCandidateDefinitionNotebookLocation(value: CandidateDefinitionNotebookLocation): Self = this.set("CandidateDefinitionNotebookLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandidateDefinitionNotebookLocation: Self = this.set("CandidateDefinitionNotebookLocation", js.undefined)
    @scala.inline
    def setDataExplorationNotebookLocation(value: DataExplorationNotebookLocation): Self = this.set("DataExplorationNotebookLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataExplorationNotebookLocation: Self = this.set("DataExplorationNotebookLocation", js.undefined)
  }
  
}

