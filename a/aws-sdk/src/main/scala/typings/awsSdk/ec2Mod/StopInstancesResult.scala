package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopInstancesResult extends StObject {
  
  /**
    * Information about the stopped instances.
    */
  var StoppingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
}
object StopInstancesResult {
  
  @scala.inline
  def apply(): StopInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopInstancesResult]
  }
  
  @scala.inline
  implicit class StopInstancesResultMutableBuilder[Self <: StopInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStoppingInstances(value: InstanceStateChangeList): Self = StObject.set(x, "StoppingInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingInstancesUndefined: Self = StObject.set(x, "StoppingInstances", js.undefined)
    
    @scala.inline
    def setStoppingInstancesVarargs(value: InstanceStateChange*): Self = StObject.set(x, "StoppingInstances", js.Array(value :_*))
  }
}
