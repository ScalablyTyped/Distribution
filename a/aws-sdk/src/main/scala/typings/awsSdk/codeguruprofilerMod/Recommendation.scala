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
  @scala.inline
  implicit class RecommendationOps[Self <: Recommendation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllMatchesCount(value: Integer): Self = this.set("allMatchesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllMatchesSum(value: Double): Self = this.set("allMatchesSum", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: Pattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopMatchesVarargs(value: Match*): Self = this.set("topMatches", js.Array(value :_*))
    @scala.inline
    def setTopMatches(value: Matches): Self = this.set("topMatches", value.asInstanceOf[js.Any])
  }
  
}

