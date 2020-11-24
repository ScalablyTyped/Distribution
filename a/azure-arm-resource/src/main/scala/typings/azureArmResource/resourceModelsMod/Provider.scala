package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends js.Object {
  
  /**
    * The provider ID.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The namespace of the resource provider.
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * The registration state of the provider.
    */
  val registrationState: js.UndefOr[String] = js.native
  
  /**
    * The collection of provider resource types.
    */
  val resourceTypes: js.UndefOr[js.Array[ProviderResourceType]] = js.native
}
object Provider {
  
  @scala.inline
  def apply(): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setRegistrationState(value: String): Self = this.set("registrationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrationState: Self = this.set("registrationState", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ProviderResourceType*): Self = this.set("resourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: js.Array[ProviderResourceType]): Self = this.set("resourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypes: Self = this.set("resourceTypes", js.undefined)
  }
}
