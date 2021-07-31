package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCorsPolicyInput extends StObject {
  
  /**
    * The name of the container that the policy is assigned to.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName
}
object GetCorsPolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName): GetCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCorsPolicyInput]
  }
  
  @scala.inline
  implicit class GetCorsPolicyInputMutableBuilder[Self <: GetCorsPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
