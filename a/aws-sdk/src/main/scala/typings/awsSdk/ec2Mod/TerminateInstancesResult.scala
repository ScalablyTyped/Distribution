package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateInstancesResult extends StObject {
  
  /**
    * Information about the terminated instances.
    */
  var TerminatingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
}
object TerminateInstancesResult {
  
  inline def apply(): TerminateInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateInstancesResult]
  }
  
  extension [Self <: TerminateInstancesResult](x: Self) {
    
    inline def setTerminatingInstances(value: InstanceStateChangeList): Self = StObject.set(x, "TerminatingInstances", value.asInstanceOf[js.Any])
    
    inline def setTerminatingInstancesUndefined: Self = StObject.set(x, "TerminatingInstances", js.undefined)
    
    inline def setTerminatingInstancesVarargs(value: InstanceStateChange*): Self = StObject.set(x, "TerminatingInstances", js.Array(value :_*))
  }
}
