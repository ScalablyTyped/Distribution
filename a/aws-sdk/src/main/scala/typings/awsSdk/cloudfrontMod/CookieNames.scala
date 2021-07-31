package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieNames extends StObject {
  
  /**
    * A list of cookie names.
    */
  var Items: js.UndefOr[CookieNameList] = js.undefined
  
  /**
    * The number of cookie names in the Items list.
    */
  var Quantity: integer
}
object CookieNames {
  
  @scala.inline
  def apply(Quantity: integer): CookieNames = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieNames]
  }
  
  @scala.inline
  implicit class CookieNamesMutableBuilder[Self <: CookieNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: CookieNameList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
