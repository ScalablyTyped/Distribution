package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstancesResult extends StObject {
  
  /**
    * Information about the started instances.
    */
  var StartingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
}
object StartInstancesResult {
  
  inline def apply(): StartInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInstancesResult]
  }
  
  extension [Self <: StartInstancesResult](x: Self) {
    
    inline def setStartingInstances(value: InstanceStateChangeList): Self = StObject.set(x, "StartingInstances", value.asInstanceOf[js.Any])
    
    inline def setStartingInstancesUndefined: Self = StObject.set(x, "StartingInstances", js.undefined)
    
    inline def setStartingInstancesVarargs(value: InstanceStateChange*): Self = StObject.set(x, "StartingInstances", js.Array(value*))
  }
}
