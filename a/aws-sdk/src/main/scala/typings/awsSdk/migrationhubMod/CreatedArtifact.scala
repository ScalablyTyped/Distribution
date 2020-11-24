package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(Name: CreatedArtifactName): CreatedArtifact = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedArtifact]
  }
  
  @scala.inline
  implicit class CreatedArtifactOps[Self <: CreatedArtifact] (val x: Self) extends AnyVal {
    
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
    def setName(value: CreatedArtifactName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: CreatedArtifactDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}
