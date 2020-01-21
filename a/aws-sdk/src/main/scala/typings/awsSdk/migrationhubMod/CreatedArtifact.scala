package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatedArtifact extends js.Object {
  /**
    * A description that can be free-form text to record additional detail about the artifact for clarity or for later reference.
    */
  var Description: js.UndefOr[CreatedArtifactDescription] = js.native
  /**
    * An ARN that uniquely identifies the result of a migration task.
    */
  var Name: CreatedArtifactName = js.native
}

object CreatedArtifact {
  @scala.inline
  def apply(Name: CreatedArtifactName, Description: CreatedArtifactDescription = null): CreatedArtifact = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedArtifact]
  }
}

