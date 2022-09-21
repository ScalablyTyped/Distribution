package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandidateArtifactLocations extends StObject {
  
  /**
    * The Amazon S3 prefix to the explainability artifacts generated for the AutoML candidate.
    */
  var Explainability: ExplainabilityLocation
  
  /**
    * The Amazon S3 prefix to the model insight artifacts generated for the AutoML candidate.
    */
  var ModelInsights: js.UndefOr[ModelInsightsLocation] = js.undefined
}
object CandidateArtifactLocations {
  
  inline def apply(Explainability: ExplainabilityLocation): CandidateArtifactLocations = {
    val __obj = js.Dynamic.literal(Explainability = Explainability.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateArtifactLocations]
  }
  
  extension [Self <: CandidateArtifactLocations](x: Self) {
    
    inline def setExplainability(value: ExplainabilityLocation): Self = StObject.set(x, "Explainability", value.asInstanceOf[js.Any])
    
    inline def setModelInsights(value: ModelInsightsLocation): Self = StObject.set(x, "ModelInsights", value.asInstanceOf[js.Any])
    
    inline def setModelInsightsUndefined: Self = StObject.set(x, "ModelInsights", js.undefined)
  }
}
