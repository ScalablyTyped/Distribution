package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterInput extends StObject {
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: String = js.native
  
  /**
    * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps. 
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
}
object ModifyClusterInput {
  
  @scala.inline
  def apply(ClusterId: String): ModifyClusterInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterInput]
  }
  
  @scala.inline
  implicit class ModifyClusterInputMutableBuilder[Self <: ModifyClusterInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepConcurrencyLevel(value: Integer): Self = StObject.set(x, "StepConcurrencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepConcurrencyLevelUndefined: Self = StObject.set(x, "StepConcurrencyLevel", js.undefined)
  }
}
