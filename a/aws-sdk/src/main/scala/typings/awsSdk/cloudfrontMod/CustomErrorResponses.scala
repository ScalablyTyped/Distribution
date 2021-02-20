package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomErrorResponses extends StObject {
  
  /**
    * A complex type that contains a CustomErrorResponse element for each HTTP status code for which you want to specify a custom error page and/or a caching duration. 
    */
  var Items: js.UndefOr[CustomErrorResponseList] = js.native
  
  /**
    * The number of HTTP status codes for which you want to specify a custom error page and/or a caching duration. If Quantity is 0, you can omit Items.
    */
  var Quantity: integer = js.native
}
object CustomErrorResponses {
  
  @scala.inline
  def apply(Quantity: integer): CustomErrorResponses = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomErrorResponses]
  }
  
  @scala.inline
  implicit class CustomErrorResponsesMutableBuilder[Self <: CustomErrorResponses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: CustomErrorResponseList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CustomErrorResponse*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
