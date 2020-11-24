package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServiceRegistryLogin extends js.Object {
  
  /**
    * The timestamp of when the container image registry username and password expire. The log in credentials expire 12 hours after they are created, at which point you will need to create a new set of log in credentials using the CreateContainerServiceRegistryLogin action.
    */
  var expiresAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The container service registry password to use to push container images to the container image registry of a Lightsail account
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The address to use to push container images to the container image registry of a Lightsail account.
    */
  var registry: js.UndefOr[String] = js.native
  
  /**
    * The container service registry username to use to push container images to the container image registry of a Lightsail account.
    */
  var username: js.UndefOr[String] = js.native
}
object ContainerServiceRegistryLogin {
  
  @scala.inline
  def apply(): ContainerServiceRegistryLogin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceRegistryLogin]
  }
  
  @scala.inline
  implicit class ContainerServiceRegistryLoginOps[Self <: ContainerServiceRegistryLogin] (val x: Self) extends AnyVal {
    
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
    def setExpiresAt(value: IsoDate): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresAt: Self = this.set("expiresAt", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRegistry(value: String): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
