package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandidateProperties extends StObject {
  
  /**
    * The Amazon S3 prefix to the artifacts generated for an AutoML candidate.
    */
  var CandidateArtifactLocations: js.UndefOr[typings.awsSdk.sagemakerMod.CandidateArtifactLocations] = js.undefined
  
  /**
    * Information about the candidate metrics for an AutoML job.
    */
  var CandidateMetrics: js.UndefOr[MetricDataList] = js.undefined
}
object CandidateProperties {
  
  inline def apply(): CandidateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandidateProperties]
  }
  
  extension [Self <: CandidateProperties](x: Self) {
    
    inline def setCandidateArtifactLocations(value: CandidateArtifactLocations): Self = StObject.set(x, "CandidateArtifactLocations", value.asInstanceOf[js.Any])
    
    inline def setCandidateArtifactLocationsUndefined: Self = StObject.set(x, "CandidateArtifactLocations", js.undefined)
    
    inline def setCandidateMetrics(value: MetricDataList): Self = StObject.set(x, "CandidateMetrics", value.asInstanceOf[js.Any])
    
    inline def setCandidateMetricsUndefined: Self = StObject.set(x, "CandidateMetrics", js.undefined)
    
    inline def setCandidateMetricsVarargs(value: MetricDatum*): Self = StObject.set(x, "CandidateMetrics", js.Array(value*))
  }
}
