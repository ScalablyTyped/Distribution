package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerPolicyOutput extends StObject {
  
  /**
    * The contents of the access policy.
    */
  var Policy: ContainerPolicy = js.native
}
object GetContainerPolicyOutput {
  
  @scala.inline
  def apply(Policy: ContainerPolicy): GetContainerPolicyOutput = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerPolicyOutput]
  }
  
  @scala.inline
  implicit class GetContainerPolicyOutputMutableBuilder[Self <: GetContainerPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: ContainerPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
