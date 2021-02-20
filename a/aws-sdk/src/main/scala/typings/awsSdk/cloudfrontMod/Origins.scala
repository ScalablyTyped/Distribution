package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Origins extends StObject {
  
  /**
    * A list of origins.
    */
  var Items: OriginList = js.native
  
  /**
    * The number of origins for this distribution.
    */
  var Quantity: integer = js.native
}
object Origins {
  
  @scala.inline
  def apply(Items: OriginList, Quantity: integer): Origins = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origins]
  }
  
  @scala.inline
  implicit class OriginsMutableBuilder[Self <: Origins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: OriginList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Origin*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
