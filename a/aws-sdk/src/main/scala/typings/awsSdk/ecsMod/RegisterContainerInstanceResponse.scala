package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterContainerInstanceResponse extends js.Object {
  
  /**
    * The container instance that was registered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.native
}
object RegisterContainerInstanceResponse {
  
  @scala.inline
  def apply(): RegisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterContainerInstanceResponse]
  }
  
  @scala.inline
  implicit class RegisterContainerInstanceResponseOps[Self <: RegisterContainerInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerInstance(value: ContainerInstance): Self = this.set("containerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerInstance: Self = this.set("containerInstance", js.undefined)
  }
}
