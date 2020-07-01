package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recommendation extends js.Object {
  /**
    * How many different places in the profile graph triggered a match.
    */
  var allMatchesCount: Integer = js.native
  /**
    * How much of the total sample count is potentially affected.
    */
  var allMatchesSum: Double = js.native
  /**
    * End time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var endTime: Timestamp = js.native
  /**
    * The pattern that analysis recognized in the profile to make this recommendation.
    */
  var pattern: Pattern = js.native
  /**
    * The start time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var startTime: Timestamp = js.native
  /**
    * List of the matches with most impact. 
    */
  var topMatches: Matches = js.native
}

object Recommendation {
  @scala.inline
  def apply(
    allMatchesCount: Integer,
    allMatchesSum: Double,
    endTime: Timestamp,
    pattern: Pattern,
    startTime: Timestamp,
    topMatches: Matches
  ): Recommendation = {
    val __obj = js.Dynamic.literal(allMatchesCount = allMatchesCount.asInstanceOf[js.Any], allMatchesSum = allMatchesSum.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], topMatches = topMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recommendation]
  }
}

