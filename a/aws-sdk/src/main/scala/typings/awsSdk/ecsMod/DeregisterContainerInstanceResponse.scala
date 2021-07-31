package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterContainerInstanceResponse extends StObject {
  
  /**
    * The container instance that was deregistered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.undefined
}
object DeregisterContainerInstanceResponse {
  
  @scala.inline
  def apply(): DeregisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterContainerInstanceResponse]
  }
  
  @scala.inline
  implicit class DeregisterContainerInstanceResponseMutableBuilder[Self <: DeregisterContainerInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerInstance(value: ContainerInstance): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
