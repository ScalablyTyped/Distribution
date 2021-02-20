package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutLifecyclePolicyInput extends StObject {
  
  /**
    * The name of the container that you want to assign the object lifecycle policy to.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
  
  /**
    * The object lifecycle policy to apply to the container.
    */
  var LifecyclePolicy: typings.awsSdk.mediastoreMod.LifecyclePolicy = js.native
}
object PutLifecyclePolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName, LifecyclePolicy: LifecyclePolicy): PutLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], LifecyclePolicy = LifecyclePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecyclePolicyInput]
  }
  
  @scala.inline
  implicit class PutLifecyclePolicyInputMutableBuilder[Self <: PutLifecyclePolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecyclePolicy(value: LifecyclePolicy): Self = StObject.set(x, "LifecyclePolicy", value.asInstanceOf[js.Any])
  }
}
