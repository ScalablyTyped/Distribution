package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MFAOptionType extends StObject {
  
  /**
    * The attribute name of the MFA option type. The only valid value is phone_number.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.undefined
  
  /**
    * The delivery medium to send the MFA code. You can use this parameter to set only the SMS delivery medium value.
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined
}
object MFAOptionType {
  
  @scala.inline
  def apply(): MFAOptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MFAOptionType]
  }
  
  @scala.inline
  implicit class MFAOptionTypeMutableBuilder[Self <: MFAOptionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: AttributeNameType): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setDeliveryMedium(value: DeliveryMediumType): Self = StObject.set(x, "DeliveryMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryMediumUndefined: Self = StObject.set(x, "DeliveryMedium", js.undefined)
  }
}
