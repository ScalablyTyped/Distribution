package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderDescription extends js.Object {
  
  /**
    * The date the provider was added to the user pool.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The date the provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * The identity provider name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
  
  /**
    * The identity provider type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.native
}
object ProviderDescription {
  
  @scala.inline
  def apply(): ProviderDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderDescription]
  }
  
  @scala.inline
  implicit class ProviderDescriptionOps[Self <: ProviderDescription] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setProviderName(value: ProviderNameType): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("ProviderName", js.undefined)
    
    @scala.inline
    def setProviderType(value: IdentityProviderTypeType): Self = this.set("ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderType: Self = this.set("ProviderType", js.undefined)
  }
}
