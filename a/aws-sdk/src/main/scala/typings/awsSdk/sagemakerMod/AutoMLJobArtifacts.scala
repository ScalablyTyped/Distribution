package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLJobArtifacts extends StObject {
  
  /**
    * The URL of the notebook location.
    */
  var CandidateDefinitionNotebookLocation: js.UndefOr[typings.awsSdk.sagemakerMod.CandidateDefinitionNotebookLocation] = js.undefined
  
  /**
    * The URL of the notebook location.
    */
  var DataExplorationNotebookLocation: js.UndefOr[typings.awsSdk.sagemakerMod.DataExplorationNotebookLocation] = js.undefined
}
object AutoMLJobArtifacts {
  
  inline def apply(): AutoMLJobArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobArtifacts]
  }
  
  extension [Self <: AutoMLJobArtifacts](x: Self) {
    
    inline def setCandidateDefinitionNotebookLocation(value: CandidateDefinitionNotebookLocation): Self = StObject.set(x, "CandidateDefinitionNotebookLocation", value.asInstanceOf[js.Any])
    
    inline def setCandidateDefinitionNotebookLocationUndefined: Self = StObject.set(x, "CandidateDefinitionNotebookLocation", js.undefined)
    
    inline def setDataExplorationNotebookLocation(value: DataExplorationNotebookLocation): Self = StObject.set(x, "DataExplorationNotebookLocation", value.asInstanceOf[js.Any])
    
    inline def setDataExplorationNotebookLocationUndefined: Self = StObject.set(x, "DataExplorationNotebookLocation", js.undefined)
  }
}
