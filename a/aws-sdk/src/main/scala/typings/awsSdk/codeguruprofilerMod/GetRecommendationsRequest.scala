package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationsRequest extends js.Object {
  /**
    *  The start time of the profile to get analysis data about. You must specify startTime and endTime. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: Timestamp = js.native
  /**
    *  The language used to provide analysis. Specify using a string that is one of the following BCP 47 language codes.     de-DE - German, Germany     en-GB - English, United Kingdom     en-US - English, United States     es-ES - Spanish, Spain     fr-FR - French, France     it-IT - Italian, Italy     ja-JP - Japanese, Japan     ko-KR - Korean, Republic of Korea     pt-BR - Portugese, Brazil     zh-CN - Chinese, China     zh-TW - Chinese, Taiwan   
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    *  The name of the profiling group to get analysis data about. 
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    *  The end time of the profile to get analysis data about. You must specify startTime and endTime. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: Timestamp = js.native
}

object GetRecommendationsRequest {
  @scala.inline
  def apply(
    endTime: Timestamp,
    profilingGroupName: ProfilingGroupName,
    startTime: Timestamp,
    locale: Locale = null
  ): GetRecommendationsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsRequest]
  }
}

