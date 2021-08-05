package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommendationsResponse extends StObject {
  
  /**
    *  The list of anomalies that the analysis has found for this profile. 
    */
  var anomalies: Anomalies
  
  /**
    *  The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var profileEndTime: Timestamp
  
  /**
    *  The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var profileStartTime: Timestamp
  
  /**
    * The name of the profiling group the analysis data is about.
    */
  var profilingGroupName: ProfilingGroupName
  
  /**
    * The list of recommendations that the analysis found for this profile.
    */
  var recommendations: Recommendations
}
object GetRecommendationsResponse {
  
  inline def apply(
    anomalies: Anomalies,
    profileEndTime: Timestamp,
    profileStartTime: Timestamp,
    profilingGroupName: ProfilingGroupName,
    recommendations: Recommendations
  ): GetRecommendationsResponse = {
    val __obj = js.Dynamic.literal(anomalies = anomalies.asInstanceOf[js.Any], profileEndTime = profileEndTime.asInstanceOf[js.Any], profileStartTime = profileStartTime.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], recommendations = recommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsResponse]
  }
  
  extension [Self <: GetRecommendationsResponse](x: Self) {
    
    inline def setAnomalies(value: Anomalies): Self = StObject.set(x, "anomalies", value.asInstanceOf[js.Any])
    
    inline def setAnomaliesVarargs(value: Anomaly*): Self = StObject.set(x, "anomalies", js.Array(value :_*))
    
    inline def setProfileEndTime(value: Timestamp): Self = StObject.set(x, "profileEndTime", value.asInstanceOf[js.Any])
    
    inline def setProfileStartTime(value: Timestamp): Self = StObject.set(x, "profileStartTime", value.asInstanceOf[js.Any])
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    inline def setRecommendations(value: Recommendations): Self = StObject.set(x, "recommendations", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsVarargs(value: Recommendation*): Self = StObject.set(x, "recommendations", js.Array(value :_*))
  }
}
