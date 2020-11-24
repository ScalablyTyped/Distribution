package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UICustomizationType extends js.Object {
  
  /**
    * The CSS values in the UI customization.
    */
  var CSS: js.UndefOr[CSSType] = js.native
  
  /**
    * The CSS version number.
    */
  var CSSVersion: js.UndefOr[CSSVersionType] = js.native
  
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  
  /**
    * The creation date for the UI customization.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The logo image for the UI customization.
    */
  var ImageUrl: js.UndefOr[ImageUrlType] = js.native
  
  /**
    * The last-modified date for the UI customization.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}
object UICustomizationType {
  
  @scala.inline
  def apply(): UICustomizationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UICustomizationType]
  }
  
  @scala.inline
  implicit class UICustomizationTypeOps[Self <: UICustomizationType] (val x: Self) extends AnyVal {
    
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
    def setCSS(value: CSSType): Self = this.set("CSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCSS: Self = this.set("CSS", js.undefined)
    
    @scala.inline
    def setCSSVersion(value: CSSVersionType): Self = this.set("CSSVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCSSVersion: Self = this.set("CSSVersion", js.undefined)
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setImageUrl(value: ImageUrlType): Self = this.set("ImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("ImageUrl", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
}
