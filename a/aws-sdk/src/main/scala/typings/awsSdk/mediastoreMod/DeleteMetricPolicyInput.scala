package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMetricPolicyInput extends StObject {
  
  /**
    * The name of the container that is associated with the metric policy that you want to delete.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName
}
object DeleteMetricPolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteMetricPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMetricPolicyInput]
  }
  
  @scala.inline
  implicit class DeleteMetricPolicyInputMutableBuilder[Self <: DeleteMetricPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
