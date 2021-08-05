package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterInput extends StObject {
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: String
  
  /**
    * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps. 
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.undefined
}
object ModifyClusterInput {
  
  inline def apply(ClusterId: String): ModifyClusterInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterInput]
  }
  
  extension [Self <: ModifyClusterInput](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setStepConcurrencyLevel(value: Integer): Self = StObject.set(x, "StepConcurrencyLevel", value.asInstanceOf[js.Any])
    
    inline def setStepConcurrencyLevelUndefined: Self = StObject.set(x, "StepConcurrencyLevel", js.undefined)
  }
}
