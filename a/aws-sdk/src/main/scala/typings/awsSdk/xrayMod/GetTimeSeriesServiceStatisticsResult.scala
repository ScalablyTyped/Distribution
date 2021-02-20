package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTimeSeriesServiceStatisticsResult extends StObject {
  
  /**
    * A flag indicating whether or not a group's filter expression has been consistent, or if a returned aggregation might show statistics from an older version of the group's filter expression.
    */
  var ContainsOldGroupVersions: js.UndefOr[Boolean] = js.native
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The collection of statistics.
    */
  var TimeSeriesServiceStatistics: js.UndefOr[TimeSeriesServiceStatisticsList] = js.native
}
object GetTimeSeriesServiceStatisticsResult {
  
  @scala.inline
  def apply(): GetTimeSeriesServiceStatisticsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTimeSeriesServiceStatisticsResult]
  }
  
  @scala.inline
  implicit class GetTimeSeriesServiceStatisticsResultMutableBuilder[Self <: GetTimeSeriesServiceStatisticsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsOldGroupVersions(value: Boolean): Self = StObject.set(x, "ContainsOldGroupVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsOldGroupVersionsUndefined: Self = StObject.set(x, "ContainsOldGroupVersions", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTimeSeriesServiceStatistics(value: TimeSeriesServiceStatisticsList): Self = StObject.set(x, "TimeSeriesServiceStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesServiceStatisticsUndefined: Self = StObject.set(x, "TimeSeriesServiceStatistics", js.undefined)
    
    @scala.inline
    def setTimeSeriesServiceStatisticsVarargs(value: TimeSeriesServiceStatistics*): Self = StObject.set(x, "TimeSeriesServiceStatistics", js.Array(value :_*))
  }
}
