package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MFAOptionType extends js.Object {
  
  /**
    * The attribute name of the MFA option type. The only valid value is phone_number.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.native
  
  /**
    * The delivery medium to send the MFA code. You can use this parameter to set only the SMS delivery medium value.
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.native
}
object MFAOptionType {
  
  @scala.inline
  def apply(): MFAOptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MFAOptionType]
  }
  
  @scala.inline
  implicit class MFAOptionTypeOps[Self <: MFAOptionType] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: AttributeNameType): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    
    @scala.inline
    def setDeliveryMedium(value: DeliveryMediumType): Self = this.set("DeliveryMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryMedium: Self = this.set("DeliveryMedium", js.undefined)
  }
}
