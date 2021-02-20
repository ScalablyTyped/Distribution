package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLJobArtifacts extends StObject {
  
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
  implicit class AutoMLJobArtifactsMutableBuilder[Self <: AutoMLJobArtifacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidateDefinitionNotebookLocation(value: CandidateDefinitionNotebookLocation): Self = StObject.set(x, "CandidateDefinitionNotebookLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateDefinitionNotebookLocationUndefined: Self = StObject.set(x, "CandidateDefinitionNotebookLocation", js.undefined)
    
    @scala.inline
    def setDataExplorationNotebookLocation(value: DataExplorationNotebookLocation): Self = StObject.set(x, "DataExplorationNotebookLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExplorationNotebookLocationUndefined: Self = StObject.set(x, "DataExplorationNotebookLocation", js.undefined)
  }
}
