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
  
  inline def apply(): StopInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopInstancesResult]
  }
  
  extension [Self <: StopInstancesResult](x: Self) {
    
    inline def setStoppingInstances(value: InstanceStateChangeList): Self = StObject.set(x, "StoppingInstances", value.asInstanceOf[js.Any])
    
    inline def setStoppingInstancesUndefined: Self = StObject.set(x, "StoppingInstances", js.undefined)
    
    inline def setStoppingInstancesVarargs(value: InstanceStateChange*): Self = StObject.set(x, "StoppingInstances", js.Array(value*))
  }
}
