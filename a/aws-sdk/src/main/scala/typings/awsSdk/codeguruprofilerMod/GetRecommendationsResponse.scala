package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationsResponse extends js.Object {
  /**
    *  The list of anomalies that the analysis has found for this profile. 
    */
  var anomalies: Anomalies = js.native
  /**
    *  The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var profileEndTime: Timestamp = js.native
  /**
    *  The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var profileStartTime: Timestamp = js.native
  /**
    * The name of the profiling group the analysis data is about.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    * The list of recommendations that the analysis found for this profile.
    */
  var recommendations: Recommendations = js.native
}

object GetRecommendationsResponse {
  @scala.inline
  def apply(
    anomalies: Anomalies,
    profileEndTime: Timestamp,
    profileStartTime: Timestamp,
    profilingGroupName: ProfilingGroupName,
    recommendations: Recommendations
  ): GetRecommendationsResponse = {
    val __obj = js.Dynamic.literal(anomalies = anomalies.asInstanceOf[js.Any], profileEndTime = profileEndTime.asInstanceOf[js.Any], profileStartTime = profileStartTime.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], recommendations = recommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsResponse]
  }
}

