package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTimeSeriesServiceStatisticsResult extends js.Object {
  
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
  implicit class GetTimeSeriesServiceStatisticsResultOps[Self <: GetTimeSeriesServiceStatisticsResult] (val x: Self) extends AnyVal {
    
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
    def setContainsOldGroupVersions(value: Boolean): Self = this.set("ContainsOldGroupVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsOldGroupVersions: Self = this.set("ContainsOldGroupVersions", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTimeSeriesServiceStatisticsVarargs(value: TimeSeriesServiceStatistics*): Self = this.set("TimeSeriesServiceStatistics", js.Array(value :_*))
    
    @scala.inline
    def setTimeSeriesServiceStatistics(value: TimeSeriesServiceStatisticsList): Self = this.set("TimeSeriesServiceStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesServiceStatistics: Self = this.set("TimeSeriesServiceStatistics", js.undefined)
  }
}
