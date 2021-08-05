package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricPolicyInput extends StObject {
  
  /**
    * The name of the container that is associated with the metric policy.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName
}
object GetMetricPolicyInput {
  
  inline def apply(ContainerName: ContainerName): GetMetricPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricPolicyInput]
  }
  
  extension [Self <: GetMetricPolicyInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
