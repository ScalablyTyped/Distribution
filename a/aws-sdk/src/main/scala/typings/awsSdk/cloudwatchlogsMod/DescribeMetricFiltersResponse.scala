package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMetricFiltersResponse extends StObject {
  
  /**
    * The metric filters.
    */
  var metricFilters: js.UndefOr[MetricFilters] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeMetricFiltersResponse {
  
  @scala.inline
  def apply(): DescribeMetricFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricFiltersResponse]
  }
  
  @scala.inline
  implicit class DescribeMetricFiltersResponseMutableBuilder[Self <: DescribeMetricFiltersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricFilters(value: MetricFilters): Self = StObject.set(x, "metricFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricFiltersUndefined: Self = StObject.set(x, "metricFilters", js.undefined)
    
    @scala.inline
    def setMetricFiltersVarargs(value: MetricFilter*): Self = StObject.set(x, "metricFilters", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
