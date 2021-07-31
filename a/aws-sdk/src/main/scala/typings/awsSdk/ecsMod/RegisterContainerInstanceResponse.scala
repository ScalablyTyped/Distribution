package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterContainerInstanceResponse extends StObject {
  
  /**
    * The container instance that was registered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.undefined
}
object RegisterContainerInstanceResponse {
  
  @scala.inline
  def apply(): RegisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterContainerInstanceResponse]
  }
  
  @scala.inline
  implicit class RegisterContainerInstanceResponseMutableBuilder[Self <: RegisterContainerInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerInstance(value: ContainerInstance): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
