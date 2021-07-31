package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLifecyclePolicyOutput extends StObject {
  
  /**
    * The object lifecycle policy that is assigned to the container.
    */
  var LifecyclePolicy: typings.awsSdk.mediastoreMod.LifecyclePolicy
}
object GetLifecyclePolicyOutput {
  
  @scala.inline
  def apply(LifecyclePolicy: LifecyclePolicy): GetLifecyclePolicyOutput = {
    val __obj = js.Dynamic.literal(LifecyclePolicy = LifecyclePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePolicyOutput]
  }
  
  @scala.inline
  implicit class GetLifecyclePolicyOutputMutableBuilder[Self <: GetLifecyclePolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifecyclePolicy(value: LifecyclePolicy): Self = StObject.set(x, "LifecyclePolicy", value.asInstanceOf[js.Any])
  }
}
