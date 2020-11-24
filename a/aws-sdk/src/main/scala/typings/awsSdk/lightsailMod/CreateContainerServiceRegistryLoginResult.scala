package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContainerServiceRegistryLoginResult extends js.Object {
  
  /**
    * An object that describes the log in information for the container service registry of your Lightsail account.
    */
  var registryLogin: js.UndefOr[ContainerServiceRegistryLogin] = js.native
}
object CreateContainerServiceRegistryLoginResult {
  
  @scala.inline
  def apply(): CreateContainerServiceRegistryLoginResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerServiceRegistryLoginResult]
  }
  
  @scala.inline
  implicit class CreateContainerServiceRegistryLoginResultOps[Self <: CreateContainerServiceRegistryLoginResult] (val x: Self) extends AnyVal {
    
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
    def setRegistryLogin(value: ContainerServiceRegistryLogin): Self = this.set("registryLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryLogin: Self = this.set("registryLogin", js.undefined)
  }
}
