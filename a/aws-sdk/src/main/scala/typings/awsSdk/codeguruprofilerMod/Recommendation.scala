package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recommendation extends StObject {
  
  /**
    * How many different places in the profile graph triggered a match.
    */
  var allMatchesCount: Integer
  
  /**
    * How much of the total sample count is potentially affected.
    */
  var allMatchesSum: Double
  
  /**
    * End time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var endTime: Timestamp
  
  /**
    * The pattern that analysis recognized in the profile to make this recommendation.
    */
  var pattern: Pattern
  
  /**
    * The start time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var startTime: Timestamp
  
  /**
    * List of the matches with most impact. 
    */
  var topMatches: Matches
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
  implicit class RecommendationMutableBuilder[Self <: Recommendation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllMatchesCount(value: Integer): Self = StObject.set(x, "allMatchesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllMatchesSum(value: Double): Self = StObject.set(x, "allMatchesSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMatches(value: Matches): Self = StObject.set(x, "topMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMatchesVarargs(value: Match*): Self = StObject.set(x, "topMatches", js.Array(value :_*))
  }
}
