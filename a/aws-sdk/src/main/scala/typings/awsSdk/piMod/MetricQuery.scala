package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricQuery extends StObject {
  
  /**
    * One or more filters to apply in the request. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy parameter.   A single filter for any other dimension in this dimension group.  
    */
  var Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined
  
  /**
    * A specification for how to aggregate the data points from a query result. You must specify a valid dimension group. Performance Insights will return all of the dimensions within that group, unless you provide the names of specific dimensions within that group. You can also request that Performance Insights return a limited number of values for a dimension.
    */
  var GroupBy: js.UndefOr[DimensionGroup] = js.undefined
  
  /**
    * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
    */
  var Metric: String
}
object MetricQuery {
  
  @scala.inline
  def apply(Metric: String): MetricQuery = {
    val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricQuery]
  }
  
  @scala.inline
  implicit class MetricQueryMutableBuilder[Self <: MetricQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: MetricQueryFilterMap): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setGroupBy(value: DimensionGroup): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
  }
}
