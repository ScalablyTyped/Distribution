package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLifecyclePolicyInput extends StObject {
  
  /**
    * The name of the container that the object lifecycle policy is assigned to.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}
object GetLifecyclePolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName): GetLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePolicyInput]
  }
  
  @scala.inline
  implicit class GetLifecyclePolicyInputMutableBuilder[Self <: GetLifecyclePolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
