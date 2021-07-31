package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMetricFilterRequest extends StObject {
  
  /**
    * The name of the metric filter.
    */
  var filterName: FilterName
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}
object DeleteMetricFilterRequest {
  
  @scala.inline
  def apply(filterName: FilterName, logGroupName: LogGroupName): DeleteMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterName = filterName.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMetricFilterRequest]
  }
  
  @scala.inline
  implicit class DeleteMetricFilterRequestMutableBuilder[Self <: DeleteMetricFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterName(value: FilterName): Self = StObject.set(x, "filterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
