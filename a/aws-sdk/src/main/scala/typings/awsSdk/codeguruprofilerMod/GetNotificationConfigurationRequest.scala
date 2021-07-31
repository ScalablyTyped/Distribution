package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNotificationConfigurationRequest extends StObject {
  
  /**
    * The name of the profiling group we want to get the notification configuration for.
    */
  var profilingGroupName: ProfilingGroupName
}
object GetNotificationConfigurationRequest {
  
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): GetNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetNotificationConfigurationRequestMutableBuilder[Self <: GetNotificationConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
