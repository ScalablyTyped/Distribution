package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLifecyclePolicyInput extends StObject {
  
  /**
    * The name of the container that you want to assign the object lifecycle policy to.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName
  
  /**
    * The object lifecycle policy to apply to the container.
    */
  var LifecyclePolicy: typings.awsSdk.mediastoreMod.LifecyclePolicy
}
object PutLifecyclePolicyInput {
  
  inline def apply(ContainerName: ContainerName, LifecyclePolicy: LifecyclePolicy): PutLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], LifecyclePolicy = LifecyclePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecyclePolicyInput]
  }
  
  extension [Self <: PutLifecyclePolicyInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setLifecyclePolicy(value: LifecyclePolicy): Self = StObject.set(x, "LifecyclePolicy", value.asInstanceOf[js.Any])
  }
}
