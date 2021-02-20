package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutContainerPolicyInput extends StObject {
  
  /**
    * The name of the container.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
  
  /**
    * The contents of the policy, which includes the following:    One Version tag   One Statement tag that contains the standard tags for the policy.  
    */
  var Policy: ContainerPolicy = js.native
}
object PutContainerPolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName, Policy: ContainerPolicy): PutContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutContainerPolicyInput]
  }
  
  @scala.inline
  implicit class PutContainerPolicyInputMutableBuilder[Self <: PutContainerPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: ContainerPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
