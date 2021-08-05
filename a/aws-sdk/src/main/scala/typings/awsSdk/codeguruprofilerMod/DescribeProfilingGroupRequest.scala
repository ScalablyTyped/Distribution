package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProfilingGroupRequest extends StObject {
  
  /**
    *  The name of the profiling group to get information about. 
    */
  var profilingGroupName: ProfilingGroupName
}
object DescribeProfilingGroupRequest {
  
  inline def apply(profilingGroupName: ProfilingGroupName): DescribeProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProfilingGroupRequest]
  }
  
  extension [Self <: DescribeProfilingGroupRequest](x: Self) {
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
