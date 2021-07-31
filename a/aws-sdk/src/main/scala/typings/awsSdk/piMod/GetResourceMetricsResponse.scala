package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceMetricsResponse extends StObject {
  
  /**
    * The end time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
    */
  var AlignedEndTime: js.UndefOr[ISOTimestamp] = js.undefined
  
  /**
    * The start time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
    */
  var AlignedStartTime: js.UndefOr[ISOTimestamp] = js.undefined
  
  /**
    * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
    */
  var Identifier: js.UndefOr[String] = js.undefined
  
  /**
    * An array of metric results,, where each array element contains all of the data points for a particular dimension.
    */
  var MetricList: js.UndefOr[MetricKeyDataPointsList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetResourceMetricsResponse {
  
  @scala.inline
  def apply(): GetResourceMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceMetricsResponse]
  }
  
  @scala.inline
  implicit class GetResourceMetricsResponseMutableBuilder[Self <: GetResourceMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignedEndTime(value: ISOTimestamp): Self = StObject.set(x, "AlignedEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignedEndTimeUndefined: Self = StObject.set(x, "AlignedEndTime", js.undefined)
    
    @scala.inline
    def setAlignedStartTime(value: ISOTimestamp): Self = StObject.set(x, "AlignedStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignedStartTimeUndefined: Self = StObject.set(x, "AlignedStartTime", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    @scala.inline
    def setMetricList(value: MetricKeyDataPointsList): Self = StObject.set(x, "MetricList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricListUndefined: Self = StObject.set(x, "MetricList", js.undefined)
    
    @scala.inline
    def setMetricListVarargs(value: MetricKeyDataPoints*): Self = StObject.set(x, "MetricList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
