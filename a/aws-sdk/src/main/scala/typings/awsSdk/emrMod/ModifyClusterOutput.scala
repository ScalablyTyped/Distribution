package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterOutput extends StObject {
  
  /**
    * The number of steps that can be executed concurrently.
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
}
object ModifyClusterOutput {
  
  @scala.inline
  def apply(): ModifyClusterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterOutput]
  }
  
  @scala.inline
  implicit class ModifyClusterOutputMutableBuilder[Self <: ModifyClusterOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStepConcurrencyLevel(value: Integer): Self = StObject.set(x, "StepConcurrencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepConcurrencyLevelUndefined: Self = StObject.set(x, "StepConcurrencyLevel", js.undefined)
  }
}
