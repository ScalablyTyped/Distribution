package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTopicsDetectionJobResponse extends StObject {
  
  /**
    * The list of properties for the requested job.
    */
  var TopicsDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.TopicsDetectionJobProperties] = js.undefined
}
object DescribeTopicsDetectionJobResponse {
  
  @scala.inline
  def apply(): DescribeTopicsDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTopicsDetectionJobResponse]
  }
  
  @scala.inline
  implicit class DescribeTopicsDetectionJobResponseMutableBuilder[Self <: DescribeTopicsDetectionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicsDetectionJobProperties(value: TopicsDetectionJobProperties): Self = StObject.set(x, "TopicsDetectionJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsDetectionJobPropertiesUndefined: Self = StObject.set(x, "TopicsDetectionJobProperties", js.undefined)
  }
}
