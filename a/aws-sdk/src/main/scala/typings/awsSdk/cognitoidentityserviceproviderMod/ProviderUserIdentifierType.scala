package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderUserIdentifierType extends js.Object {
  
  /**
    * The name of the provider attribute to link to, for example, NameID.
    */
  var ProviderAttributeName: js.UndefOr[StringType] = js.native
  
  /**
    * The value of the provider attribute to link to, for example, xxxxx_account.
    */
  var ProviderAttributeValue: js.UndefOr[StringType] = js.native
  
  /**
    * The name of the provider, for example, Facebook, Google, or Login with Amazon.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
}
object ProviderUserIdentifierType {
  
  @scala.inline
  def apply(): ProviderUserIdentifierType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderUserIdentifierType]
  }
  
  @scala.inline
  implicit class ProviderUserIdentifierTypeOps[Self <: ProviderUserIdentifierType] (val x: Self) extends AnyVal {
    
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
    def setProviderAttributeName(value: StringType): Self = this.set("ProviderAttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderAttributeName: Self = this.set("ProviderAttributeName", js.undefined)
    
    @scala.inline
    def setProviderAttributeValue(value: StringType): Self = this.set("ProviderAttributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderAttributeValue: Self = this.set("ProviderAttributeValue", js.undefined)
    
    @scala.inline
    def setProviderName(value: ProviderNameType): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("ProviderName", js.undefined)
  }
}
