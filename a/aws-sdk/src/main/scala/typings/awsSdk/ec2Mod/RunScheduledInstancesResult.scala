package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunScheduledInstancesResult extends StObject {
  
  /**
    * The IDs of the newly launched instances.
    */
  var InstanceIdSet: js.UndefOr[typings.awsSdk.ec2Mod.InstanceIdSet] = js.undefined
}
object RunScheduledInstancesResult {
  
  inline def apply(): RunScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunScheduledInstancesResult]
  }
  
  extension [Self <: RunScheduledInstancesResult](x: Self) {
    
    inline def setInstanceIdSet(value: InstanceIdSet): Self = StObject.set(x, "InstanceIdSet", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdSetUndefined: Self = StObject.set(x, "InstanceIdSet", js.undefined)
    
    inline def setInstanceIdSetVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIdSet", js.Array(value*))
  }
}
