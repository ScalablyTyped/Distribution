package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountHealthResponse extends StObject {
  
  /**
    *  An integer that specifies the number of metrics that have been analyzed in your Amazon Web Services account. 
    */
  var MetricsAnalyzed: NumMetricsAnalyzed
  
  /**
    *  An integer that specifies the number of open proactive insights in your Amazon Web Services account. 
    */
  var OpenProactiveInsights: NumOpenProactiveInsights
  
  /**
    *  An integer that specifies the number of open reactive insights in your Amazon Web Services account. 
    */
  var OpenReactiveInsights: NumOpenReactiveInsights
  
  /**
    * The number of Amazon DevOps Guru resource analysis hours billed to the current Amazon Web Services account in the last hour. 
    */
  var ResourceHours: typings.awsSdk.devopsguruMod.ResourceHours
}
object DescribeAccountHealthResponse {
  
  inline def apply(
    MetricsAnalyzed: NumMetricsAnalyzed,
    OpenProactiveInsights: NumOpenProactiveInsights,
    OpenReactiveInsights: NumOpenReactiveInsights,
    ResourceHours: ResourceHours
  ): DescribeAccountHealthResponse = {
    val __obj = js.Dynamic.literal(MetricsAnalyzed = MetricsAnalyzed.asInstanceOf[js.Any], OpenProactiveInsights = OpenProactiveInsights.asInstanceOf[js.Any], OpenReactiveInsights = OpenReactiveInsights.asInstanceOf[js.Any], ResourceHours = ResourceHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountHealthResponse]
  }
  
  extension [Self <: DescribeAccountHealthResponse](x: Self) {
    
    inline def setMetricsAnalyzed(value: NumMetricsAnalyzed): Self = StObject.set(x, "MetricsAnalyzed", value.asInstanceOf[js.Any])
    
    inline def setOpenProactiveInsights(value: NumOpenProactiveInsights): Self = StObject.set(x, "OpenProactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setOpenReactiveInsights(value: NumOpenReactiveInsights): Self = StObject.set(x, "OpenReactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setResourceHours(value: ResourceHours): Self = StObject.set(x, "ResourceHours", value.asInstanceOf[js.Any])
  }
}
