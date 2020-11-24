package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContainerServiceDeploymentResult extends js.Object {
  
  /**
    * An object that describes a container service.
    */
  var containerService: js.UndefOr[ContainerService] = js.native
}
object CreateContainerServiceDeploymentResult {
  
  @scala.inline
  def apply(): CreateContainerServiceDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerServiceDeploymentResult]
  }
  
  @scala.inline
  implicit class CreateContainerServiceDeploymentResultOps[Self <: CreateContainerServiceDeploymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerService(value: ContainerService): Self = this.set("containerService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerService: Self = this.set("containerService", js.undefined)
  }
}
