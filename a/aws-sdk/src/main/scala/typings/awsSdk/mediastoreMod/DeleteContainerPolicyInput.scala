package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteContainerPolicyInput extends StObject {
  
  /**
    * The name of the container that holds the policy.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}
object DeleteContainerPolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContainerPolicyInput]
  }
  
  @scala.inline
  implicit class DeleteContainerPolicyInputMutableBuilder[Self <: DeleteContainerPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
