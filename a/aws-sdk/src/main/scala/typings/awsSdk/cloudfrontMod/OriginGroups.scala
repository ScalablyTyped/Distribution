package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginGroups extends StObject {
  
  /**
    * The items (origin groups) in a distribution.
    */
  var Items: js.UndefOr[OriginGroupList] = js.native
  
  /**
    * The number of origin groups.
    */
  var Quantity: integer = js.native
}
object OriginGroups {
  
  @scala.inline
  def apply(Quantity: integer): OriginGroups = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroups]
  }
  
  @scala.inline
  implicit class OriginGroupsMutableBuilder[Self <: OriginGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: OriginGroupList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: OriginGroup*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
