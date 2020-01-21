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
  def apply(
    CandidateDefinitionNotebookLocation: CandidateDefinitionNotebookLocation = null,
    DataExplorationNotebookLocation: DataExplorationNotebookLocation = null
  ): AutoMLJobArtifacts = {
    val __obj = js.Dynamic.literal()
    if (CandidateDefinitionNotebookLocation != null) __obj.updateDynamic("CandidateDefinitionNotebookLocation")(CandidateDefinitionNotebookLocation.asInstanceOf[js.Any])
    if (DataExplorationNotebookLocation != null) __obj.updateDynamic("DataExplorationNotebookLocation")(DataExplorationNotebookLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobArtifacts]
  }
}

