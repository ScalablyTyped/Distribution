package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeDeliveryDetailsType extends StObject {
  
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
  implicit class CodeDeliveryDetailsTypeMutableBuilder[Self <: CodeDeliveryDetailsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: AttributeNameType): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setDeliveryMedium(value: DeliveryMediumType): Self = StObject.set(x, "DeliveryMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryMediumUndefined: Self = StObject.set(x, "DeliveryMedium", js.undefined)
    
    @scala.inline
    def setDestination(value: StringType): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
  }
}
