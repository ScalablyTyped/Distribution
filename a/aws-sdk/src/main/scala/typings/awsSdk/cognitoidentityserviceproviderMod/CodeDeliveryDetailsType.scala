package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeDeliveryDetailsType extends js.Object {
  
  /**
    * The attribute name.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.native
  
  /**
    * The delivery medium (email message or phone number).
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.native
  
  /**
    * The destination for the code delivery details.
    */
  var Destination: js.UndefOr[StringType] = js.native
}
object CodeDeliveryDetailsType {
  
  @scala.inline
  def apply(): CodeDeliveryDetailsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeDeliveryDetailsType]
  }
  
  @scala.inline
  implicit class CodeDeliveryDetailsTypeOps[Self <: CodeDeliveryDetailsType] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setDestination(value: StringType): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
  }
}
