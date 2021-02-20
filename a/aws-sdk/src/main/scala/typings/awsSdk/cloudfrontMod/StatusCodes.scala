package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCodes extends StObject {
  
  /**
    * The items (status codes) for an origin group.
    */
  var Items: StatusCodeList = js.native
  
  /**
    * The number of status codes.
    */
  var Quantity: integer = js.native
}
object StatusCodes {
  
  @scala.inline
  def apply(Items: StatusCodeList, Quantity: integer): StatusCodes = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCodes]
  }
  
  @scala.inline
  implicit class StatusCodesMutableBuilder[Self <: StatusCodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: StatusCodeList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: integer*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
